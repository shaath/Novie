package day10;

import day9.OrgMaster;

public class UserLoginTC {

	public static void main(String[] args) 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("NovieGeorge123", "NovieGeorge123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();


	}

}
