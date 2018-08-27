package com.lijia.handlers;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/upload")
	public String doUpload(MultipartFile img,HttpSession session) throws Exception {//注意这里的参数是表单的那个name值，还有MultipartFile这里是一个接口
		//String path = "d:/images";//这里属于自己手动新建文件，不然会报错
		String path = session.getServletContext().getRealPath("/images");
		if (img.getSize()>0) {//如果什么都不上传，img不是为空,判断不可以是img!=null
			//获取到上传文件的原始名称
			String fileName = img.getOriginalFilename();
			if (fileName.endsWith("jpg") || fileName.endsWith("png")) {
				File file = new File(path, fileName);
				img.transferTo(file);//抛异常
				return "/success.jsp";
			}
			return "/error1.jsp";//上传格式错误
		}
		return "/error2.jsp";//没有上传东西
	}
	
/**
 * 如果不足配置文件里面配置mvc	注解驱动，不然会报错误
 * Failed to instantiate [org.springframework.web.multipart.MultipartFile]: Specified class is an interface
 * 
 * 
 * 
 */
	
	
	
}