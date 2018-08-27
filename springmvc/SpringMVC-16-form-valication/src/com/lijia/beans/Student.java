package com.lijia.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author 李嘉
 *
 * @date 2018年7月27日
 */
public class Student {
	@NotNull(message="姓名不能为空")
	@Size(min=3,max=6,message="长度应该在{min}--{max}个字符")
	private String name;
	
	@Min(value=0,message="成绩不能小于{value}")
	@Max(value=100,message="成绩不能大于{value}")
	private double score;
	//[34578]只要是其中一个数字就可以配上
	@NotNull(message="手机号不能为空")
	@Pattern(regexp="^1[34578]\\d{9}$",message="手机号码格式不正确")
	private String moblie;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getMoblie() {
		return moblie;
	}
	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", moblie="
				+ moblie + "]";
	}
	
	
}