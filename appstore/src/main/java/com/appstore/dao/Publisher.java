package com.appstore.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String code;
	private String name;

	public Publisher() {}

	public Publisher(int pid, String code, String name) {
		this.pid = pid;
		this.code = code;
		this.name = name;
	}

	public Publisher(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publisher [pid=");
		builder.append(pid);
		builder.append(", code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}	
	
	
	
}














