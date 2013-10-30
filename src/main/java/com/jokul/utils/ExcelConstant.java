package com.jokul.utils;

public interface ExcelConstant {

	/*一、限制表格最大行数*/
	public final int MAX_ROW_NUM = 5000;
	
	/*二、根据MSG_TYPE显示错误信息importMessage,0红色信息,1绿色信息*/
	public static final String MSG_TYPE_ERROR = "0";
	public static final String MSG_TYPE_SUCESS = "1";
	public static final String IMPORT_MESSAGE = "importMessage";
	
	/*三、正则以验证单元格内容*/
	public final String CN_PTN = "^[\u4e00-\u9fa5]{1,}$";//中文
	public final String INT_STR_PTN = "^[\\d]+$";//字符型数字型
	public final String FLOAT_STR_PTN = "^[+]?\\d*([.]\\d+)?$";//小数
	public final String STR_PTN = "^[\\S]+$";//字符行
	public final String ZIP_PTN="^[0-9]\\d{5}$";//邮政编码
	public final String DATE_PTN="^[0-9]{4}-[0-9]{2}-[0-9]{2}$";//日期
	
	/*四、定义验证规则*/
	//1.必填验证,"Y"必填 ""不做验证
	public final String student_require_array[] = {"Y","Y","Y","Y","Y","Y","Y","Y","Y","Y","Y"};
	
	//2.格式验证
	
	public final String student_format_array[] = {INT_STR_PTN,INT_STR_PTN,STR_PTN,STR_PTN,DATE_PTN,STR_PTN,STR_PTN,STR_PTN,STR_PTN,DATE_PTN,STR_PTN};
	
	//3.标题验证,excel单元格中的数据长度不能大于此处列出的长度
	
	public final String student_title_array[] = {"序号","学号","姓名","性别","出生日期","身份证号","院系","专业","班级","入学时间","学历"};
}
