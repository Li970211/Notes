package com.lijia.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/Myajax.do")
	public void doAjax(String name,int age,HttpServletResponse response) throws IOException {
		System.out.println(name);
		System.out.println(age);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("age", age);
		
		JSONObject myJson = JSONObject.fromObject(map);
		String jsonStr = myJson.toString();
		PrintWriter out = response.getWriter();
		out.print(jsonStr);
		out.close();
	}
	
	
	
	
	
}