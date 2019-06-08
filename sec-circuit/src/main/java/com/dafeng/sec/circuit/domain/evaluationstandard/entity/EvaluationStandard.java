package com.dafeng.sec.circuit.domain.evaluationstandard.entity;

/**
 * 	评价指标管理
 * @author 大风
 *
 */
public class EvaluationStandard {
	
	private Integer id;

    private String name;

    private Integer whights;
    
    private String detail;
    
    

    /**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getWhights() {
        return whights;
    }

    public void setWhights(Integer whights) {
        this.whights = whights;
    }

	@Override
	public String toString() {
		return "EvaluationStandard [id=" + id + ", name=" + name + ", whights=" + whights + "]";
	}
    
}