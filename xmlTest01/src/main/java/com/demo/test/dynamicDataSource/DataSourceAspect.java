package com.demo.test.dynamicDataSource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 用于拦截方法，获取方法注解上的数据源标识
 */
@Component
public class DataSourceAspect {
    /**
     * 拦截目标方法，获取由@DataSource指定的数据源标识，设置到线程存储中以便切换数据源
     *
     * @param point
     * @throws Exception
     */
    public void intercept(JoinPoint point) throws Exception {
        System.out.println("配置动态数据源的切面");
        Class<?> target = point.getTarget().getClass();
        //获取连接点的方法签名对象；该对象可以用于获取目标对象的方法对象，从而获取方法上的注解。
        MethodSignature signature = (MethodSignature) point.getSignature();
        // 默认使用目标类型的注解，如果没有则使用其实现接口的注解
        for (Class<?> clazz : target.getInterfaces()) {
            resolveDataSource(clazz, signature.getMethod());
        }
        resolveDataSource(target, signature.getMethod());
    }

    /**
     * 20      * 提取目标对象方法注解和类型注解中的数据源标识
     * 21      *
     * 22      * @param clazz
     * 23      * @param method
     * 24
     */
    private void resolveDataSource(Class<?> clazz, Method method) {
        try {
            Class<?>[] types = method.getParameterTypes();
            // 默认使用类型注解
            if (clazz.isAnnotationPresent(DataSource.class)) {
                DataSource source = clazz.getAnnotation(DataSource.class);
                DynamicDataSourceHolder.setDataSource(source.value().toString());
            }
            // 方法注解可以覆盖类型注解
            Method m = clazz.getMethod(method.getName(), types);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource source = m.getAnnotation(DataSource.class);
                DynamicDataSourceHolder.setDataSource(source.value().toString());
            }
        } catch (Exception e) {
            System.out.println(clazz + ":" + e.getMessage());
        }
    }

}
