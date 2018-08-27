package com.lijia.handlers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

//Converter接口中的两个泛型表示:
//第一个：表示源的类型，即传入的参数类型
//第二个:表示宿的类型，即要转换为的目标类型
public class MyDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//用于接口没有抛异常，所以这里只能try-catch捕获异常
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
