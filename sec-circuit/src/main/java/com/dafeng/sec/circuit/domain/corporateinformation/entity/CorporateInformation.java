package com.dafeng.sec.circuit.domain.corporateinformation.entity;

/**
 * 	企业信息维护
 * @author 大风
 *
 */
public class CorporateInformation {
	
		private Integer id;
	   
		private String company;

	    private Integer userId;

	    private String manager;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getCompany() {
	        return company;
	    }

	    public void setCompany(String company) {
	        this.company = company == null ? null : company.trim();
	    }

	    public Integer getUserId() {
	        return userId;
	    }

	    public void setUserId(Integer userId) {
	        this.userId = userId;
	    }

	    public String getManager() {
	        return manager;
	    }

	    public void setManager(String manager) {
	        this.manager = manager == null ? null : manager.trim();
	    }

		@Override
		public String toString() {
			return "CorporateInformation [id=" + id + ", company=" + company + ", userId=" + userId + ", manager="
					+ manager + "]";
		}
	    
	    
	}