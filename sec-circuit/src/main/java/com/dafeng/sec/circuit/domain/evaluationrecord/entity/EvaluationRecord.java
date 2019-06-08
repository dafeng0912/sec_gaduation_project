package com.dafeng.sec.circuit.domain.evaluationrecord.entity;

public class EvaluationRecord {
	
		private Integer id;

	    private Integer count;

	    private Integer userId;

	    private String detail;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public Integer getCount() {
	        return count;
	    }

	    public void setCount(Integer count) {
	        this.count = count;
	    }

	    public Integer getUserId() {
	        return userId;
	    }

	    public void setUserId(Integer userId) {
	        this.userId = userId;
	    }

	    public String getDetail() {
	        return detail;
	    }

	    public void setDetail(String detail) {
	        this.detail = detail == null ? null : detail.trim();
	    }

		@Override
		public String toString() {
			return "EvaluationRecord [id=" + id + ", count=" + count + ", userId=" + userId + ", detail=" + detail
					+ "]";
		}
	    
	}