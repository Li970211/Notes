package com.lijia.handlers;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/upload") //注意因为 这里是数组，如果不进行@RequestParam校验的话会报错，
	public String doUpload(@RequestParam MultipartFile[] imgs,HttpSession session) throws Exception {//注意这里的参数是表单的那个name值，还有MultipartFile这里是一个接口
		String path = session.getServletContext().getRealPath("/images");
		for (MultipartFile img : imgs) {
			if (img.getSize()>0) {
				String fileName = img.getOriginalFilename();
				if (fileName.endsWith("jpg") || fileName.endsWith("png")) {
					File file = new File(path, fileName);
					img.transferTo(file);
				}
			}
		}
		return "/success.jsp";
		
	}
}