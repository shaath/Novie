package day10;

import day9.OrgMaster;

public class UserRegTC 
{

	public static void main(String[] args) 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Userreg("Novie George", "NovieGeorge123", "NovieGeorge123", "NovieGeorge123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();


	}

}
