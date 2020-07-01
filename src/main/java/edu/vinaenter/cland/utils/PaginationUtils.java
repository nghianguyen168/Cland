package edu.vinaenter.cland.utils;

import edu.vinaenter.cland.constants.GlobalsConstant;

public class PaginationUtils {
	public static  int getOffset(int page) {
		return (page-1) * GlobalsConstant.LIMIT_PAGE;
	}
	
	public static  int getOffset(int page,final int limit) {
		return (page-1) * limit;
	}
}
