package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import day9.OrgMaster;

public class ExcelOps 
{
	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		String xlpath="F:\\Novie\\Selenium\\src\\Testdata\\TestData.xlsx";
		String xlout="F:\\Novie\\Selenium\\src\\Results\\Emprescolours.xlsx";				
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
//		XSSFRow r=ws.getRow(7);
//		XSSFCell c=r.getCell(0);
//		
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		
		om.org_Launch("http://opensource.demo.orangehrmlive.com/");
		om.org_Login("Admin", "admin");
		
		CellStyle style=wb.createCellStyle();
		
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			System.out.println(r.getLastCellNum());
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			System.out.println(f+"---"+l);
			
			String res=om.org_Empreg(f, l);
			c2.setCellValue(res);
			if (res.equalsIgnoreCase("Pass"))
			{
				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);	
				
				
			}
			else
			{
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
				
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);	
				
			}
			c2.setCellStyle(style);
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
		
		
	}

}
