package com.dafeng.sec.circuit.response.volobj;

import java.util.List;

import com.dafeng.sec.circuit.infrastructure.util.AbstractResponse;
import com.github.pagehelper.PageInfo;

public class CircuitResponse<T> extends AbstractResponse{
	private List<T> list;
	private int i;
	private String str;
	private int currentPage;
	private int pageSize;
	private long total;
	private boolean flag;
	private Object obj;
	private PageInfo info;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public CircuitResponse(List<T> list) {
		super();
		this.list = list;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
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

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
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

	

	public CircuitResponse() {
		super();
	}

	public CircuitResponse(int i) {
		super();
		this.i = i;
	}

	public CircuitResponse(boolean flag) {
		super();
		this.flag = flag;
	}
	
	

	public CircuitResponse(List<T> list, int i, String str, int currentPage, int pageSize, long total, boolean flag,
			Object obj, PageInfo info) {
		super();
		this.list = list;
		this.i = i;
		this.str = str;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.total = total;
		this.flag = flag;
		this.obj = obj;
		this.info = info;
	}
	
	
	
}
