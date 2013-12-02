package com.jokul.web.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.jokul.utils.Constant;

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
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String name = sdf.format(new Date());
			String rootPath = request.getRealPath("/");
			File file = new File(rootPath + "/" +Constant.uploadSrc + "/" + name + fileName.substring(fileName.indexOf("."), fileName.length()));
			try {
				FileCopyUtils.copy(multipartFile.getBytes(), file);
				
				InputStream is = new FileInputStream(file);
				HSSFWorkbook wb = new HSSFWorkbook(is);
				HSSFSheet sheet = wb.getSheetAt(0);
				HSSFRow row = null;
				
				if(sheet.getLastRowNum() < 1) {
					return "";
				}
				
				if(sheet.getLastRowNum() > 5000) {
					return "";
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return "student/importResult";
	}
	
}
