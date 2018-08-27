package com.lijia.spring.di01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * 与@@Component功能注解功能相同，但意义不同的注解还有三个:
 * 1.@Repository:注解在Dao实现类上
 * 2.@Service:注解在Service 实现类上
 * 3.@Controller：注解在springmvc的处理器上
 */
//@Scope("prototype") 默认也是singleton
@Component("mySchool")//组件，表示当前类被spring容器所管理
public class School {
	@Value("华东交通大学")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}
	
}
