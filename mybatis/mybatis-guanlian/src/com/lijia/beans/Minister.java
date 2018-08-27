package com.lijia.beans;

public class Minister {
	private Integer mid;
	private String mname;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Minister [mid=" + mid + ", mname=" + mname + "]";
	}
	public Minister() {
		super();
	}
	public Minister(Integer mid, String mname) {
		this.mid = mid;
		this.mname = mname;
	}
	
}
