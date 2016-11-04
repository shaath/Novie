package day10;

import day9.OrgMaster;

public class TestSuit {

	public static void main(String[] args)
	{
		//Login
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//Empreg TC
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Empreg("Novie123", "George123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//User Reg TC
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Userreg("Novie123 George123", "NovieGeorge123456", "NovieGeorge123", "NovieGeorge123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

		//UserLogin
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("NovieGeorge123456", "NovieGeorge123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();


	}

}
