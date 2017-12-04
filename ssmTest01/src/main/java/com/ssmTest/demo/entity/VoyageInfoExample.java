package com.ssmTest.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VoyageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoyageInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIsNull() {
            addCriterion("arrival_date is null");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIsNotNull() {
            addCriterion("arrival_date is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalDateEqualTo(Date value) {
            addCriterion("arrival_date =", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotEqualTo(Date value) {
            addCriterion("arrival_date <>", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateGreaterThan(Date value) {
            addCriterion("arrival_date >", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_date >=", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateLessThan(Date value) {
            addCriterion("arrival_date <", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateLessThanOrEqualTo(Date value) {
            addCriterion("arrival_date <=", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIn(List<Date> values) {
            addCriterion("arrival_date in", values, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotIn(List<Date> values) {
            addCriterion("arrival_date not in", values, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateBetween(Date value1, Date value2) {
            addCriterion("arrival_date between", value1, value2, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotBetween(Date value1, Date value2) {
            addCriterion("arrival_date not between", value1, value2, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionIsNull() {
            addCriterion("chn_description is null");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionIsNotNull() {
            addCriterion("chn_description is not null");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionEqualTo(String value) {
            addCriterion("chn_description =", value, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionNotEqualTo(String value) {
            addCriterion("chn_description <>", value, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionGreaterThan(String value) {
            addCriterion("chn_description >", value, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("chn_description >=", value, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionLessThan(String value) {
            addCriterion("chn_description <", value, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionLessThanOrEqualTo(String value) {
            addCriterion("chn_description <=", value, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionLike(String value) {
            addCriterion("chn_description like", value, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionNotLike(String value) {
            addCriterion("chn_description not like", value, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionIn(List<String> values) {
            addCriterion("chn_description in", values, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionNotIn(List<String> values) {
            addCriterion("chn_description not in", values, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionBetween(String value1, String value2) {
            addCriterion("chn_description between", value1, value2, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andChnDescriptionNotBetween(String value1, String value2) {
            addCriterion("chn_description not between", value1, value2, "chnDescription");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateIsNull() {
            addCriterion("ctn_apply_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateIsNotNull() {
            addCriterion("ctn_apply_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateEqualTo(Date value) {
            addCriterion("ctn_apply_begin_date =", value, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateNotEqualTo(Date value) {
            addCriterion("ctn_apply_begin_date <>", value, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateGreaterThan(Date value) {
            addCriterion("ctn_apply_begin_date >", value, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ctn_apply_begin_date >=", value, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateLessThan(Date value) {
            addCriterion("ctn_apply_begin_date <", value, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("ctn_apply_begin_date <=", value, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateIn(List<Date> values) {
            addCriterion("ctn_apply_begin_date in", values, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateNotIn(List<Date> values) {
            addCriterion("ctn_apply_begin_date not in", values, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateBetween(Date value1, Date value2) {
            addCriterion("ctn_apply_begin_date between", value1, value2, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("ctn_apply_begin_date not between", value1, value2, "ctnApplyBeginDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateIsNull() {
            addCriterion("ctn_apply_end_date is null");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateIsNotNull() {
            addCriterion("ctn_apply_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateEqualTo(Date value) {
            addCriterion("ctn_apply_end_date =", value, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateNotEqualTo(Date value) {
            addCriterion("ctn_apply_end_date <>", value, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateGreaterThan(Date value) {
            addCriterion("ctn_apply_end_date >", value, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ctn_apply_end_date >=", value, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateLessThan(Date value) {
            addCriterion("ctn_apply_end_date <", value, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateLessThanOrEqualTo(Date value) {
            addCriterion("ctn_apply_end_date <=", value, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateIn(List<Date> values) {
            addCriterion("ctn_apply_end_date in", values, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateNotIn(List<Date> values) {
            addCriterion("ctn_apply_end_date not in", values, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateBetween(Date value1, Date value2) {
            addCriterion("ctn_apply_end_date between", value1, value2, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnApplyEndDateNotBetween(Date value1, Date value2) {
            addCriterion("ctn_apply_end_date not between", value1, value2, "ctnApplyEndDate");
            return (Criteria) this;
        }

        public Criteria andCtnEndIsNull() {
            addCriterion("ctn_end is null");
            return (Criteria) this;
        }

        public Criteria andCtnEndIsNotNull() {
            addCriterion("ctn_end is not null");
            return (Criteria) this;
        }

        public Criteria andCtnEndEqualTo(Date value) {
            addCriterion("ctn_end =", value, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndNotEqualTo(Date value) {
            addCriterion("ctn_end <>", value, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndGreaterThan(Date value) {
            addCriterion("ctn_end >", value, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndGreaterThanOrEqualTo(Date value) {
            addCriterion("ctn_end >=", value, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndLessThan(Date value) {
            addCriterion("ctn_end <", value, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndLessThanOrEqualTo(Date value) {
            addCriterion("ctn_end <=", value, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndIn(List<Date> values) {
            addCriterion("ctn_end in", values, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndNotIn(List<Date> values) {
            addCriterion("ctn_end not in", values, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndBetween(Date value1, Date value2) {
            addCriterion("ctn_end between", value1, value2, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnEndNotBetween(Date value1, Date value2) {
            addCriterion("ctn_end not between", value1, value2, "ctnEnd");
            return (Criteria) this;
        }

        public Criteria andCtnStartIsNull() {
            addCriterion("ctn_start is null");
            return (Criteria) this;
        }

        public Criteria andCtnStartIsNotNull() {
            addCriterion("ctn_start is not null");
            return (Criteria) this;
        }

        public Criteria andCtnStartEqualTo(Date value) {
            addCriterion("ctn_start =", value, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartNotEqualTo(Date value) {
            addCriterion("ctn_start <>", value, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartGreaterThan(Date value) {
            addCriterion("ctn_start >", value, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartGreaterThanOrEqualTo(Date value) {
            addCriterion("ctn_start >=", value, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartLessThan(Date value) {
            addCriterion("ctn_start <", value, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartLessThanOrEqualTo(Date value) {
            addCriterion("ctn_start <=", value, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartIn(List<Date> values) {
            addCriterion("ctn_start in", values, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartNotIn(List<Date> values) {
            addCriterion("ctn_start not in", values, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartBetween(Date value1, Date value2) {
            addCriterion("ctn_start between", value1, value2, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andCtnStartNotBetween(Date value1, Date value2) {
            addCriterion("ctn_start not between", value1, value2, "ctnStart");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDischargeDateIsNull() {
            addCriterion("discharge_date is null");
            return (Criteria) this;
        }

        public Criteria andDischargeDateIsNotNull() {
            addCriterion("discharge_date is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeDateEqualTo(Date value) {
            addCriterion("discharge_date =", value, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateNotEqualTo(Date value) {
            addCriterion("discharge_date <>", value, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateGreaterThan(Date value) {
            addCriterion("discharge_date >", value, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("discharge_date >=", value, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateLessThan(Date value) {
            addCriterion("discharge_date <", value, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateLessThanOrEqualTo(Date value) {
            addCriterion("discharge_date <=", value, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateIn(List<Date> values) {
            addCriterion("discharge_date in", values, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateNotIn(List<Date> values) {
            addCriterion("discharge_date not in", values, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateBetween(Date value1, Date value2) {
            addCriterion("discharge_date between", value1, value2, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andDischargeDateNotBetween(Date value1, Date value2) {
            addCriterion("discharge_date not between", value1, value2, "dischargeDate");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionIsNull() {
            addCriterion("eng_description is null");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionIsNotNull() {
            addCriterion("eng_description is not null");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionEqualTo(String value) {
            addCriterion("eng_description =", value, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionNotEqualTo(String value) {
            addCriterion("eng_description <>", value, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionGreaterThan(String value) {
            addCriterion("eng_description >", value, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("eng_description >=", value, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionLessThan(String value) {
            addCriterion("eng_description <", value, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionLessThanOrEqualTo(String value) {
            addCriterion("eng_description <=", value, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionLike(String value) {
            addCriterion("eng_description like", value, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionNotLike(String value) {
            addCriterion("eng_description not like", value, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionIn(List<String> values) {
            addCriterion("eng_description in", values, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionNotIn(List<String> values) {
            addCriterion("eng_description not in", values, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionBetween(String value1, String value2) {
            addCriterion("eng_description between", value1, value2, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEngDescriptionNotBetween(String value1, String value2) {
            addCriterion("eng_description not between", value1, value2, "engDescription");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateIsNull() {
            addCriterion("eta_arrived_date is null");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateIsNotNull() {
            addCriterion("eta_arrived_date is not null");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateEqualTo(Date value) {
            addCriterion("eta_arrived_date =", value, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateNotEqualTo(Date value) {
            addCriterion("eta_arrived_date <>", value, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateGreaterThan(Date value) {
            addCriterion("eta_arrived_date >", value, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("eta_arrived_date >=", value, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateLessThan(Date value) {
            addCriterion("eta_arrived_date <", value, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateLessThanOrEqualTo(Date value) {
            addCriterion("eta_arrived_date <=", value, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateIn(List<Date> values) {
            addCriterion("eta_arrived_date in", values, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateNotIn(List<Date> values) {
            addCriterion("eta_arrived_date not in", values, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateBetween(Date value1, Date value2) {
            addCriterion("eta_arrived_date between", value1, value2, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaArrivedDateNotBetween(Date value1, Date value2) {
            addCriterion("eta_arrived_date not between", value1, value2, "etaArrivedDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateIsNull() {
            addCriterion("eta_sailing_date is null");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateIsNotNull() {
            addCriterion("eta_sailing_date is not null");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateEqualTo(Date value) {
            addCriterion("eta_sailing_date =", value, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateNotEqualTo(Date value) {
            addCriterion("eta_sailing_date <>", value, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateGreaterThan(Date value) {
            addCriterion("eta_sailing_date >", value, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("eta_sailing_date >=", value, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateLessThan(Date value) {
            addCriterion("eta_sailing_date <", value, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateLessThanOrEqualTo(Date value) {
            addCriterion("eta_sailing_date <=", value, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateIn(List<Date> values) {
            addCriterion("eta_sailing_date in", values, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateNotIn(List<Date> values) {
            addCriterion("eta_sailing_date not in", values, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateBetween(Date value1, Date value2) {
            addCriterion("eta_sailing_date between", value1, value2, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andEtaSailingDateNotBetween(Date value1, Date value2) {
            addCriterion("eta_sailing_date not between", value1, value2, "etaSailingDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateIsNull() {
            addCriterion("port_close_date is null");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateIsNotNull() {
            addCriterion("port_close_date is not null");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateEqualTo(Date value) {
            addCriterion("port_close_date =", value, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateNotEqualTo(Date value) {
            addCriterion("port_close_date <>", value, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateGreaterThan(Date value) {
            addCriterion("port_close_date >", value, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("port_close_date >=", value, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateLessThan(Date value) {
            addCriterion("port_close_date <", value, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateLessThanOrEqualTo(Date value) {
            addCriterion("port_close_date <=", value, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateIn(List<Date> values) {
            addCriterion("port_close_date in", values, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateNotIn(List<Date> values) {
            addCriterion("port_close_date not in", values, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateBetween(Date value1, Date value2) {
            addCriterion("port_close_date between", value1, value2, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortCloseDateNotBetween(Date value1, Date value2) {
            addCriterion("port_close_date not between", value1, value2, "portCloseDate");
            return (Criteria) this;
        }

        public Criteria andPortsIsNull() {
            addCriterion("ports is null");
            return (Criteria) this;
        }

        public Criteria andPortsIsNotNull() {
            addCriterion("ports is not null");
            return (Criteria) this;
        }

        public Criteria andPortsEqualTo(String value) {
            addCriterion("ports =", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsNotEqualTo(String value) {
            addCriterion("ports <>", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsGreaterThan(String value) {
            addCriterion("ports >", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsGreaterThanOrEqualTo(String value) {
            addCriterion("ports >=", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsLessThan(String value) {
            addCriterion("ports <", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsLessThanOrEqualTo(String value) {
            addCriterion("ports <=", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsLike(String value) {
            addCriterion("ports like", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsNotLike(String value) {
            addCriterion("ports not like", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsIn(List<String> values) {
            addCriterion("ports in", values, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsNotIn(List<String> values) {
            addCriterion("ports not in", values, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsBetween(String value1, String value2) {
            addCriterion("ports between", value1, value2, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsNotBetween(String value1, String value2) {
            addCriterion("ports not between", value1, value2, "ports");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeIsNull() {
            addCriterion("termainal_code is null");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeIsNotNull() {
            addCriterion("termainal_code is not null");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeEqualTo(String value) {
            addCriterion("termainal_code =", value, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeNotEqualTo(String value) {
            addCriterion("termainal_code <>", value, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeGreaterThan(String value) {
            addCriterion("termainal_code >", value, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("termainal_code >=", value, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeLessThan(String value) {
            addCriterion("termainal_code <", value, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeLessThanOrEqualTo(String value) {
            addCriterion("termainal_code <=", value, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeLike(String value) {
            addCriterion("termainal_code like", value, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeNotLike(String value) {
            addCriterion("termainal_code not like", value, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeIn(List<String> values) {
            addCriterion("termainal_code in", values, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeNotIn(List<String> values) {
            addCriterion("termainal_code not in", values, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeBetween(String value1, String value2) {
            addCriterion("termainal_code between", value1, value2, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andTermainalCodeNotBetween(String value1, String value2) {
            addCriterion("termainal_code not between", value1, value2, "termainalCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeIsNull() {
            addCriterion("vessel_code is null");
            return (Criteria) this;
        }

        public Criteria andVesselCodeIsNotNull() {
            addCriterion("vessel_code is not null");
            return (Criteria) this;
        }

        public Criteria andVesselCodeEqualTo(String value) {
            addCriterion("vessel_code =", value, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeNotEqualTo(String value) {
            addCriterion("vessel_code <>", value, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeGreaterThan(String value) {
            addCriterion("vessel_code >", value, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vessel_code >=", value, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeLessThan(String value) {
            addCriterion("vessel_code <", value, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeLessThanOrEqualTo(String value) {
            addCriterion("vessel_code <=", value, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeLike(String value) {
            addCriterion("vessel_code like", value, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeNotLike(String value) {
            addCriterion("vessel_code not like", value, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeIn(List<String> values) {
            addCriterion("vessel_code in", values, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeNotIn(List<String> values) {
            addCriterion("vessel_code not in", values, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeBetween(String value1, String value2) {
            addCriterion("vessel_code between", value1, value2, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVesselCodeNotBetween(String value1, String value2) {
            addCriterion("vessel_code not between", value1, value2, "vesselCode");
            return (Criteria) this;
        }

        public Criteria andVoyageIsNull() {
            addCriterion("voyage is null");
            return (Criteria) this;
        }

        public Criteria andVoyageIsNotNull() {
            addCriterion("voyage is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageEqualTo(String value) {
            addCriterion("voyage =", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotEqualTo(String value) {
            addCriterion("voyage <>", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageGreaterThan(String value) {
            addCriterion("voyage >", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageGreaterThanOrEqualTo(String value) {
            addCriterion("voyage >=", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLessThan(String value) {
            addCriterion("voyage <", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLessThanOrEqualTo(String value) {
            addCriterion("voyage <=", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageLike(String value) {
            addCriterion("voyage like", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotLike(String value) {
            addCriterion("voyage not like", value, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageIn(List<String> values) {
            addCriterion("voyage in", values, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotIn(List<String> values) {
            addCriterion("voyage not in", values, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageBetween(String value1, String value2) {
            addCriterion("voyage between", value1, value2, "voyage");
            return (Criteria) this;
        }

        public Criteria andVoyageNotBetween(String value1, String value2) {
            addCriterion("voyage not between", value1, value2, "voyage");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}