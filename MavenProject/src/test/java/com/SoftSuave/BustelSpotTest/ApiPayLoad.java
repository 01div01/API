package com.SoftSuave.BustelSpotTest;

import com.SoftSuave.BustelSpotMain.ExcelTestData;

public class ApiPayLoad {
	public static String data;
	static ExcelTestData getDataFromExcel = new ExcelTestData();
	String email = getDataFromExcel.getEmailData("ProjectManager");
	String paas = getDataFromExcel.getPasswordData("ProjectManager");

	public static String loginPayLoad() {
		data = getDataFromExcel.getCellValueAPI(1, 2);
		System.out.println(data);
		return data;
	}

	public static String forgetPasswordPayLoad() {
		data = getDataFromExcel.getCellValueAPI(2, 2);
		System.out.println(data);
		return data;
	}

	public static String signupPagePayLoad() {
		data = getDataFromExcel.getCellValueAPI(3, 2);
		System.out.println(data);
		return data;
	}

	public static String organisatioPayLoad() {
		data = getDataFromExcel.getCellValueAPI(4, 2);
		System.out.println(data);
		return data;

	}
	public static String organisatioEditPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(5, 2);
		System.out.println(data);
		return data;
		
	}
	public static String activityPageDetailsPayLoad() {
		data = getDataFromExcel.getCellValueAPI(6, 2);
		System.out.println(data);
		return data;
	}

	public static String viewActivityPageDetailsPayLoad() {
		data = getDataFromExcel.getCellValueAPI(7, 2);
		System.out.println(data);
		return data;
	}
	public static String getNextDatePayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(8, 2);
		System.out.println(data);
		return data;
	}
	public static String getScreenShootsPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(9, 2);
		System.out.println(data);
		return data;
	}
	public static String getappActivityPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(10, 2);
		System.out.println(data);
		return data;
	}
	
	public static String getUserListPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(11, 2);
		System.out.println(data);
		return data;
	}
	public static String addProjectPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(12, 2);
		System.out.println(data);
		return data;
	}
	public static String addDupliacatePayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(13, 2);
		System.out.println(data);
		return data;
	}
	public static String getProjectPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(14, 2);
		System.out.println(data);
		return data;
	}
	public static String inviteMembersPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(15, 2);
		System.out.println(data);
		return data;
	}
	public static String searchProjectPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(16, 2);
		System.out.println(data);
		return data;
	}
	public static String addTaskPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(17, 2);
		System.out.println(data);
		return data;
	}
	public static String editTaskPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(18, 2);
		System.out.println(data);
		return data;
	}
	public static String deleteTaskPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(18, 2);
		System.out.println(data);
		return data;
	}
	//DELETE TASK
	public static String inviteMembersFromMembersPayLoad()
	{
		data = getDataFromExcel.getCellValueAPI(20, 2);
		System.out.println(data);
		return data;
	}

}
