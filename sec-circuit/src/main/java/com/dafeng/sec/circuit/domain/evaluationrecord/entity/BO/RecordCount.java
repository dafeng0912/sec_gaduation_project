package com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO;

public class RecordCount {
	
	private String name;
	
	private int value;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RecordCount [name=" + name + ", value=" + value + "]";
	}

}
