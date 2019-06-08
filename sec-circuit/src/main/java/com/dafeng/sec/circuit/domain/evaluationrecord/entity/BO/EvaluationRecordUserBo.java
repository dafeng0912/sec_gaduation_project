package com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO;

import java.util.Date;

public class EvaluationRecordUserBo  {
	
	private int userId;
	
	private long passId;
	
	private String userName;
	
	private Date userTime;
	
	private String userEmail;
	
	private long userPhone;
	
	private int userSex;
	
	private String roleRole;
	
	private int recordId;
	
	private String recordDetail;
	
	private String recordCount;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the passId
	 */
	public long getPassId() {
		return passId;
	}

	/**
	 * @param passId the passId to set
	 */
	public void setPassId(long passId) {
		this.passId = passId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userTime
	 */
	public Date getUserTime() {
		return userTime;
	}

	/**
	 * @param userTime the userTime to set
	 */
	public void setUserTime(Date userTime) {
		this.userTime = userTime;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userPhone
	 */
	public long getUserPhone() {
		return userPhone;
	}

	/**
	 * @param userPhone the userPhone to set
	 */
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * @return the userSex
	 */
	public int getUserSex() {
		return userSex;
	}

	/**
	 * @param userSex the userSex to set
	 */
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

	/**
	 * @return the roleRole
	 */
	public String getRoleRole() {
		return roleRole;
	}

	/**
	 * @param roleRole the roleRole to set
	 */
	public void setRoleRole(String roleRole) {
		this.roleRole = roleRole;
	}

	/**
	 * @return the recordId
	 */
	public int getRecordId() {
		return recordId;
	}

	/**
	 * @param recordId the recordId to set
	 */
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	/**
	 * @return the recordDetail
	 */
	public String getRecordDetail() {
		return recordDetail;
	}

	/**
	 * @param recordDetail the recordDetail to set
	 */
	public void setRecordDetail(String recordDetail) {
		this.recordDetail = recordDetail;
	}

	/**
	 * @return the recordCount
	 */
	public String getRecordCount() {
		return recordCount;
	}

	/**
	 * @param recordCount the recordCount to set
	 */
	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}

	@Override
	public String toString() {
		return "EvaluationRecordUserBo [userId=" + userId + ", passId=" + passId + ", userName=" + userName
				+ ", userTime=" + userTime + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userSex="
				+ userSex + ", roleRole=" + roleRole + ", recordId=" + recordId + ", recordDetail=" + recordDetail
				+ ", recordCount=" + recordCount + "]";
	}
	
	
	
}
