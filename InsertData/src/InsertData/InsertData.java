package InsertData;

	import  java.io.*;  
	import  org.apache.poi.hssf.usermodel.HSSFSheet;  
	import  org.apache.poi.hssf.usermodel.HSSFWorkbook;  
	import  org.apache.poi.hssf.usermodel.HSSFRow;  
    public class InsertData {
	public static void main(String[]args)
	{  
	try   
	{  
	//declare file name to be create
	String filename = "/home/hithesh/eclipse-workspace/InsertData/ASSF.xlsx";
	//creating an instance of HSSFWorkbook class  
	HSSFWorkbook workbook = new HSSFWorkbook();  
	//invoking creatSheet() method and passing the name of the sheet to be created   
	HSSFSheet sheet = workbook.createSheet("Sheet1");   
	//creating the 0th row using the createRow() method  
	HSSFRow rowhead = sheet.createRow((short)0);  
	//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
	rowhead.createCell(0).setCellValue("S.No.");  
	rowhead.createCell(1).setCellValue("Customer Name");  
	rowhead.createCell(2).setCellValue("Account Number");  
	rowhead.createCell(3).setCellValue("e-mail");  
	rowhead.createCell(4).setCellValue("Balance");  
	//creating the 1st row  
	HSSFRow row = sheet.createRow((short)1);  
	//inserting data in the first row  
	row.createCell(0).setCellValue("1");  
	row.createCell(1).setCellValue("hitesh");  
	row.createCell(2).setCellValue("9999999");  
	row.createCell(3).setCellValue("hsp@gmail.com");  
	row.createCell(4).setCellValue("700000.00");  
	//creating the 2nd row  
	HSSFRow row1 = sheet.createRow((short)2);  
	//inserting data in the second row  
	row1.createCell(0).setCellValue("2");  
	row1.createCell(1).setCellValue("aratek");  
	row1.createCell(2).setCellValue("22222222");  
	row1.createCell(3).setCellValue("ara@gmail.com");  
	row1.createCell(4).setCellValue("200000.00");
	//creating the 3rd row  
    HSSFRow row2 = sheet.createRow((short)3);  
	//inserting data in the third row  
	row2.createCell(0).setCellValue("3");  
	row2.createCell(1).setCellValue("java");  
	row2.createCell(2).setCellValue("000000");  
	row2.createCell(3).setCellValue("java@gmail.com");  
	row2.createCell(4).setCellValue("800000.00");
	FileOutputStream fileOut = new FileOutputStream(filename);  
	workbook.write(fileOut);  
	//closing the Stream  
	fileOut.close();  
	//closing the workbook  
	workbook.close();  
	//prints the message on the console  
	System.out.println("Excel file has been generated successfully.");  
	}   
	catch (Exception e)   
	{  
	e.printStackTrace();  
	}  
	}  
	}