package com.jokul.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@RequestMapping(value = "/v_import")
	public String v_import() {
		return "student/import";
	}

	@RequestMapping(value = "o_import")
	public String o_import(HttpServletRequest request,
			HttpServletResponse response) {
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
		MultipartFile multipartFile = multipartHttpServletRequest.getFile("file");
		
		if(!multipartFile.isEmpty()) {
			String fileName = multipartFile.getOriginalFilename();
			System.out.println(fileName);
			
		}
		
		return "student/importResult";
	}
}
