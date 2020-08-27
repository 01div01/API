package com.SoftSuave.BustelSpotTest;

import com.SoftSuave.BustelSpotMain.ExcelTestData;

public class GetResources 
{
	public static String data;
	static ExcelTestData getDataFromExcel = new ExcelTestData();
	String email = getDataFromExcel.getEmailData("ProjectManager");
	String paas = getDataFromExcel.getPasswordData("ProjectManager");

	public static String loginResources() {
		data = getDataFromExcel.getCellValueAPI(1, 1);
		System.out.println(data);
		return data;
	}
	public static String forgetPasswordResources() {
		data = getDataFromExcel.getCellValueAPI(2, 1);
		System.out.println(data);
		return data;
	}
	public static String signUpResources() {
		data = getDataFromExcel.getCellValueAPI(3, 1);
		System.out.println(data);
		return data;
	}
	public static String organisationResources() {
		data = getDataFromExcel.getCellValueAPI(4, 1);
		System.out.println(data);
		return data;
		
	}
	public static String organisationEditResources() {
		data = getDataFromExcel.getCellValueAPI(5, 1);
		System.out.println(data);
		return data;
		
	}
	public static String selectactivityPageResources()
	{
		data = getDataFromExcel.getCellValueAPI(6, 1);
		System.out.println(data);
		return data;
	}
	public static String viewActivityPageResources()
	{
		data = getDataFromExcel.getCellValueAPI(7, 1);
		System.out.println(data);
		return data;
	}
	public static String getNextDateResources()
	{
		data = getDataFromExcel.getCellValueAPI(8, 1);
		System.out.println(data);
		return data;
	}
	public static String getScreenShootsResources()
	{
		data = getDataFromExcel.getCellValueAPI(9, 1);
		System.out.println(data);
		return data;
	}
	public static String getappActivityResources()
	{
		data = getDataFromExcel.getCellValueAPI(10, 1);
		System.out.println(data);
		return data;
	}
	public static String getUserListResources()
	{
		data = getDataFromExcel.getCellValueAPI(11, 1);
		System.out.println(data);
		return data;
	}
	public static String addProjectResources()
	{
		data = getDataFromExcel.getCellValueAPI(12, 1);
		System.out.println(data);
		return data;
	}
	public static String addDupliacateResources()
	{
		data = getDataFromExcel.getCellValueAPI(13, 1);
		System.out.println(data);
		return data;
	}
	public static String getProjectResources()
	{
		data = getDataFromExcel.getCellValueAPI(14, 1);
		System.out.println(data);
		return data;
	}
	public static String inviteMembersResources()
	{
		data = getDataFromExcel.getCellValueAPI(15, 1);
		System.out.println(data);
		return data;
	}
	public static String searchProjectResources()
	{
		data = getDataFromExcel.getCellValueAPI(16, 1);
		System.out.println(data);
		return data;
	}
	public static String addTaskResources()
	{
		data = getDataFromExcel.getCellValueAPI(17, 1);
		System.out.println(data);
		return data;
	}
	public static String editTaskResources()
	{
		data = getDataFromExcel.getCellValueAPI(18, 1);
		System.out.println(data);
		return data;
	}
	public static String deleteTaskResources()
	{
		data = getDataFromExcel.getCellValueAPI(18, 1);
		System.out.println(data);
		return data;
	}
	public static String inviteMembersFromMembersResources()
	{
		data = getDataFromExcel.getCellValueAPI(20, 1);
		System.out.println(data);
		return data;
	}
	
	

}
