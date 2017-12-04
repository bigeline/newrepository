package com.ssmTest.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImportOrExportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImportOrExportExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlNoIsNull() {
            addCriterion("bl_no is null");
            return (Criteria) this;
        }

        public Criteria andBlNoIsNotNull() {
            addCriterion("bl_no is not null");
            return (Criteria) this;
        }

        public Criteria andBlNoEqualTo(String value) {
            addCriterion("bl_no =", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoNotEqualTo(String value) {
            addCriterion("bl_no <>", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoGreaterThan(String value) {
            addCriterion("bl_no >", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoGreaterThanOrEqualTo(String value) {
            addCriterion("bl_no >=", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoLessThan(String value) {
            addCriterion("bl_no <", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoLessThanOrEqualTo(String value) {
            addCriterion("bl_no <=", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoLike(String value) {
            addCriterion("bl_no like", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoNotLike(String value) {
            addCriterion("bl_no not like", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoIn(List<String> values) {
            addCriterion("bl_no in", values, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoNotIn(List<String> values) {
            addCriterion("bl_no not in", values, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoBetween(String value1, String value2) {
            addCriterion("bl_no between", value1, value2, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoNotBetween(String value1, String value2) {
            addCriterion("bl_no not between", value1, value2, "blNo");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightIsNull() {
            addCriterion("ctn_gross_weight is null");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightIsNotNull() {
            addCriterion("ctn_gross_weight is not null");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightEqualTo(Double value) {
            addCriterion("ctn_gross_weight =", value, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightNotEqualTo(Double value) {
            addCriterion("ctn_gross_weight <>", value, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightGreaterThan(Double value) {
            addCriterion("ctn_gross_weight >", value, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("ctn_gross_weight >=", value, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightLessThan(Double value) {
            addCriterion("ctn_gross_weight <", value, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightLessThanOrEqualTo(Double value) {
            addCriterion("ctn_gross_weight <=", value, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightIn(List<Double> values) {
            addCriterion("ctn_gross_weight in", values, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightNotIn(List<Double> values) {
            addCriterion("ctn_gross_weight not in", values, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightBetween(Double value1, Double value2) {
            addCriterion("ctn_gross_weight between", value1, value2, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnGrossWeightNotBetween(Double value1, Double value2) {
            addCriterion("ctn_gross_weight not between", value1, value2, "ctnGrossWeight");
            return (Criteria) this;
        }

        public Criteria andCtnNoIsNull() {
            addCriterion("ctn_no is null");
            return (Criteria) this;
        }

        public Criteria andCtnNoIsNotNull() {
            addCriterion("ctn_no is not null");
            return (Criteria) this;
        }

        public Criteria andCtnNoEqualTo(String value) {
            addCriterion("ctn_no =", value, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoNotEqualTo(String value) {
            addCriterion("ctn_no <>", value, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoGreaterThan(String value) {
            addCriterion("ctn_no >", value, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoGreaterThanOrEqualTo(String value) {
            addCriterion("ctn_no >=", value, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoLessThan(String value) {
            addCriterion("ctn_no <", value, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoLessThanOrEqualTo(String value) {
            addCriterion("ctn_no <=", value, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoLike(String value) {
            addCriterion("ctn_no like", value, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoNotLike(String value) {
            addCriterion("ctn_no not like", value, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoIn(List<String> values) {
            addCriterion("ctn_no in", values, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoNotIn(List<String> values) {
            addCriterion("ctn_no not in", values, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoBetween(String value1, String value2) {
            addCriterion("ctn_no between", value1, value2, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnNoNotBetween(String value1, String value2) {
            addCriterion("ctn_no not between", value1, value2, "ctnNo");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeIsNull() {
            addCriterion("ctn_operator_code is null");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeIsNotNull() {
            addCriterion("ctn_operator_code is not null");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeEqualTo(String value) {
            addCriterion("ctn_operator_code =", value, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeNotEqualTo(String value) {
            addCriterion("ctn_operator_code <>", value, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeGreaterThan(String value) {
            addCriterion("ctn_operator_code >", value, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ctn_operator_code >=", value, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeLessThan(String value) {
            addCriterion("ctn_operator_code <", value, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeLessThanOrEqualTo(String value) {
            addCriterion("ctn_operator_code <=", value, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeLike(String value) {
            addCriterion("ctn_operator_code like", value, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeNotLike(String value) {
            addCriterion("ctn_operator_code not like", value, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeIn(List<String> values) {
            addCriterion("ctn_operator_code in", values, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeNotIn(List<String> values) {
            addCriterion("ctn_operator_code not in", values, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeBetween(String value1, String value2) {
            addCriterion("ctn_operator_code between", value1, value2, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnOperatorCodeNotBetween(String value1, String value2) {
            addCriterion("ctn_operator_code not between", value1, value2, "ctnOperatorCode");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeIsNull() {
            addCriterion("ctn_size_type is null");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeIsNotNull() {
            addCriterion("ctn_size_type is not null");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeEqualTo(String value) {
            addCriterion("ctn_size_type =", value, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeNotEqualTo(String value) {
            addCriterion("ctn_size_type <>", value, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeGreaterThan(String value) {
            addCriterion("ctn_size_type >", value, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctn_size_type >=", value, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeLessThan(String value) {
            addCriterion("ctn_size_type <", value, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeLessThanOrEqualTo(String value) {
            addCriterion("ctn_size_type <=", value, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeLike(String value) {
            addCriterion("ctn_size_type like", value, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeNotLike(String value) {
            addCriterion("ctn_size_type not like", value, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeIn(List<String> values) {
            addCriterion("ctn_size_type in", values, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeNotIn(List<String> values) {
            addCriterion("ctn_size_type not in", values, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeBetween(String value1, String value2) {
            addCriterion("ctn_size_type between", value1, value2, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnSizeTypeNotBetween(String value1, String value2) {
            addCriterion("ctn_size_type not between", value1, value2, "ctnSizeType");
            return (Criteria) this;
        }

        public Criteria andCtnStatusIsNull() {
            addCriterion("ctn_status is null");
            return (Criteria) this;
        }

        public Criteria andCtnStatusIsNotNull() {
            addCriterion("ctn_status is not null");
            return (Criteria) this;
        }

        public Criteria andCtnStatusEqualTo(String value) {
            addCriterion("ctn_status =", value, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusNotEqualTo(String value) {
            addCriterion("ctn_status <>", value, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusGreaterThan(String value) {
            addCriterion("ctn_status >", value, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ctn_status >=", value, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusLessThan(String value) {
            addCriterion("ctn_status <", value, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusLessThanOrEqualTo(String value) {
            addCriterion("ctn_status <=", value, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusLike(String value) {
            addCriterion("ctn_status like", value, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusNotLike(String value) {
            addCriterion("ctn_status not like", value, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusIn(List<String> values) {
            addCriterion("ctn_status in", values, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusNotIn(List<String> values) {
            addCriterion("ctn_status not in", values, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusBetween(String value1, String value2) {
            addCriterion("ctn_status between", value1, value2, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andCtnStatusNotBetween(String value1, String value2) {
            addCriterion("ctn_status not between", value1, value2, "ctnStatus");
            return (Criteria) this;
        }

        public Criteria andDirectIsNull() {
            addCriterion("direct is null");
            return (Criteria) this;
        }

        public Criteria andDirectIsNotNull() {
            addCriterion("direct is not null");
            return (Criteria) this;
        }

        public Criteria andDirectEqualTo(String value) {
            addCriterion("direct =", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotEqualTo(String value) {
            addCriterion("direct <>", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThan(String value) {
            addCriterion("direct >", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThanOrEqualTo(String value) {
            addCriterion("direct >=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThan(String value) {
            addCriterion("direct <", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThanOrEqualTo(String value) {
            addCriterion("direct <=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLike(String value) {
            addCriterion("direct like", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotLike(String value) {
            addCriterion("direct not like", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectIn(List<String> values) {
            addCriterion("direct in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotIn(List<String> values) {
            addCriterion("direct not in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectBetween(String value1, String value2) {
            addCriterion("direct between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotBetween(String value1, String value2) {
            addCriterion("direct not between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeIsNull() {
            addCriterion("dl_port_code is null");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeIsNotNull() {
            addCriterion("dl_port_code is not null");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeEqualTo(String value) {
            addCriterion("dl_port_code =", value, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeNotEqualTo(String value) {
            addCriterion("dl_port_code <>", value, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeGreaterThan(String value) {
            addCriterion("dl_port_code >", value, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dl_port_code >=", value, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeLessThan(String value) {
            addCriterion("dl_port_code <", value, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeLessThanOrEqualTo(String value) {
            addCriterion("dl_port_code <=", value, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeLike(String value) {
            addCriterion("dl_port_code like", value, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeNotLike(String value) {
            addCriterion("dl_port_code not like", value, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeIn(List<String> values) {
            addCriterion("dl_port_code in", values, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeNotIn(List<String> values) {
            addCriterion("dl_port_code not in", values, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeBetween(String value1, String value2) {
            addCriterion("dl_port_code between", value1, value2, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andDlPortCodeNotBetween(String value1, String value2) {
            addCriterion("dl_port_code not between", value1, value2, "dlPortCode");
            return (Criteria) this;
        }

        public Criteria andInGateTimeIsNull() {
            addCriterion("in_gate_time is null");
            return (Criteria) this;
        }

        public Criteria andInGateTimeIsNotNull() {
            addCriterion("in_gate_time is not null");
            return (Criteria) this;
        }

        public Criteria andInGateTimeEqualTo(Date value) {
            addCriterion("in_gate_time =", value, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeNotEqualTo(Date value) {
            addCriterion("in_gate_time <>", value, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeGreaterThan(Date value) {
            addCriterion("in_gate_time >", value, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("in_gate_time >=", value, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeLessThan(Date value) {
            addCriterion("in_gate_time <", value, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeLessThanOrEqualTo(Date value) {
            addCriterion("in_gate_time <=", value, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeIn(List<Date> values) {
            addCriterion("in_gate_time in", values, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeNotIn(List<Date> values) {
            addCriterion("in_gate_time not in", values, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeBetween(Date value1, Date value2) {
            addCriterion("in_gate_time between", value1, value2, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andInGateTimeNotBetween(Date value1, Date value2) {
            addCriterion("in_gate_time not between", value1, value2, "inGateTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeIsNull() {
            addCriterion("msg_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeIsNotNull() {
            addCriterion("msg_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeEqualTo(Date value) {
            addCriterion("msg_receive_time =", value, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeNotEqualTo(Date value) {
            addCriterion("msg_receive_time <>", value, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeGreaterThan(Date value) {
            addCriterion("msg_receive_time >", value, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("msg_receive_time >=", value, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeLessThan(Date value) {
            addCriterion("msg_receive_time <", value, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("msg_receive_time <=", value, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeIn(List<Date> values) {
            addCriterion("msg_receive_time in", values, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeNotIn(List<Date> values) {
            addCriterion("msg_receive_time not in", values, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("msg_receive_time between", value1, value2, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andMsgReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("msg_receive_time not between", value1, value2, "msgReceiveTime");
            return (Criteria) this;
        }

        public Criteria andSealNoIsNull() {
            addCriterion("seal_no is null");
            return (Criteria) this;
        }

        public Criteria andSealNoIsNotNull() {
            addCriterion("seal_no is not null");
            return (Criteria) this;
        }

        public Criteria andSealNoEqualTo(String value) {
            addCriterion("seal_no =", value, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoNotEqualTo(String value) {
            addCriterion("seal_no <>", value, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoGreaterThan(String value) {
            addCriterion("seal_no >", value, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoGreaterThanOrEqualTo(String value) {
            addCriterion("seal_no >=", value, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoLessThan(String value) {
            addCriterion("seal_no <", value, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoLessThanOrEqualTo(String value) {
            addCriterion("seal_no <=", value, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoLike(String value) {
            addCriterion("seal_no like", value, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoNotLike(String value) {
            addCriterion("seal_no not like", value, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoIn(List<String> values) {
            addCriterion("seal_no in", values, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoNotIn(List<String> values) {
            addCriterion("seal_no not in", values, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoBetween(String value1, String value2) {
            addCriterion("seal_no between", value1, value2, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSealNoNotBetween(String value1, String value2) {
            addCriterion("seal_no not between", value1, value2, "sealNo");
            return (Criteria) this;
        }

        public Criteria andSenderCodeIsNull() {
            addCriterion("sender_code is null");
            return (Criteria) this;
        }

        public Criteria andSenderCodeIsNotNull() {
            addCriterion("sender_code is not null");
            return (Criteria) this;
        }

        public Criteria andSenderCodeEqualTo(String value) {
            addCriterion("sender_code =", value, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeNotEqualTo(String value) {
            addCriterion("sender_code <>", value, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeGreaterThan(String value) {
            addCriterion("sender_code >", value, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sender_code >=", value, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeLessThan(String value) {
            addCriterion("sender_code <", value, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeLessThanOrEqualTo(String value) {
            addCriterion("sender_code <=", value, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeLike(String value) {
            addCriterion("sender_code like", value, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeNotLike(String value) {
            addCriterion("sender_code not like", value, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeIn(List<String> values) {
            addCriterion("sender_code in", values, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeNotIn(List<String> values) {
            addCriterion("sender_code not in", values, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeBetween(String value1, String value2) {
            addCriterion("sender_code between", value1, value2, "senderCode");
            return (Criteria) this;
        }

        public Criteria andSenderCodeNotBetween(String value1, String value2) {
            addCriterion("sender_code not between", value1, value2, "senderCode");
            return (Criteria) this;
        }

        public Criteria andVesselIsNull() {
            addCriterion("vessel is null");
            return (Criteria) this;
        }

        public Criteria andVesselIsNotNull() {
            addCriterion("vessel is not null");
            return (Criteria) this;
        }

        public Criteria andVesselEqualTo(String value) {
            addCriterion("vessel =", value, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselNotEqualTo(String value) {
            addCriterion("vessel <>", value, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselGreaterThan(String value) {
            addCriterion("vessel >", value, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselGreaterThanOrEqualTo(String value) {
            addCriterion("vessel >=", value, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselLessThan(String value) {
            addCriterion("vessel <", value, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselLessThanOrEqualTo(String value) {
            addCriterion("vessel <=", value, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselLike(String value) {
            addCriterion("vessel like", value, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselNotLike(String value) {
            addCriterion("vessel not like", value, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselIn(List<String> values) {
            addCriterion("vessel in", values, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselNotIn(List<String> values) {
            addCriterion("vessel not in", values, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselBetween(String value1, String value2) {
            addCriterion("vessel between", value1, value2, "vessel");
            return (Criteria) this;
        }

        public Criteria andVesselNotBetween(String value1, String value2) {
            addCriterion("vessel not between", value1, value2, "vessel");
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