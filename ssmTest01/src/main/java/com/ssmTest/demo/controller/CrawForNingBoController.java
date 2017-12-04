package com.ssmTest.demo.controller;

import com.ssmTest.demo.service.CrawForNingBoEDIService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("crawNingBo")
@Controller
public class CrawForNingBoController {
    @Resource
    private CrawForNingBoEDIService crawForNingBoEDIServiceImpl;

    //爬取船舶周计划信息
    @RequestMapping("crawShipWeeklyPlan")
    public String crawShipWeeklyPlan() {
        return null;
    }
}
