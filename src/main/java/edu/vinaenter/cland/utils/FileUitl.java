package edu.vinaenter.cland.utils;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUitl {
	private static final String DIR_UPLOAD = "uploads";
	
	public static String upload(MultipartFile mtf, 
			HttpServletRequest request) throws IllegalStateException, IOException {
		String webPath = request.getServletContext().getRealPath("");
		String dirPath = webPath + DIR_UPLOAD;
		if(!new File(dirPath).exists()) {
			new File(dirPath).mkdir();
		}
		String fileName = mtf.getOriginalFilename();
		String pathFile = dirPath + File.separator + fileName;
		mtf.transferTo(new File(pathFile));
		return fileName;
	}
}
