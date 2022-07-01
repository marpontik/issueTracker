package com.ibm.issue;

import java.util.Date;


public class Issue {
	private int id;
	private String user;
	private String title;
	
	private String desc;
	private Date targetDate;
	private boolean isDone;

	public Issue() {
		super();
	}

	
	public Issue(int id,  String user,String title, String desc, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.title = title;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Issue other = (Issue) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Issue [id=%s, user=%s, title=%s, desc=%s, targetDate=%s, isDone=%s]", id,
				user, title,  desc, targetDate, isDone);
	}

}