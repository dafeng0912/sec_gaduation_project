package com.dafeng.sec.user.facese.response;

import java.util.List;

import com.dafeng.sec.user.domain.user.entity.User;
import com.dafeng.sec.user.infrastructure.util.AbstractResponse;
import com.github.pagehelper.PageInfo;

public class UserResponse<T> extends AbstractResponse{
	private int id;
	private boolean flag;
	private List<T> list;
	private String str;
	private int currentPage;
	private int pageSize;
	private long total;
	private Object obj;
	private PageInfo info;
	private User user;
	
	
	
	public UserResponse(long total) {
		super();
		this.total = total;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public PageInfo getInfo() {
		return info;
	}
	public void setInfo(PageInfo info) {
		this.info = info;
	}
	public UserResponse() {
		super();
	}
	
	public UserResponse(User user) {
		super();
		this.user = user;
	}
	public UserResponse(int id) {
		super();
		this.id = id;
	}
	public UserResponse(List<T> list) {
		super();
		this.list = list;
	}
	public UserResponse(boolean flag) {
		super();
		this.flag = flag;
	}
	
}
	
