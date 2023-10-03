# **Project**
**Insert Data to Excel**

# **Description**
This project is used to Insert data into excel sheet.

# **Steps**
1. You can specify the path or use same.[String filename = "/home/hithesh/eclipse-workspace/InsertData/ASSF.xlsx";]
2. To add more cells use this format by changing the x with desired integer.

   //creating the xth row  
    HSSFRow row2 = sheet.createRow((short)x);  
	//inserting data in the xth row  
	row2.createCell(0).setCellValue("x");  
	row2.createCell(1).setCellValue("java");  
	row2.createCell(2).setCellValue("000000");  
	row2.createCell(3).setCellValue("java@gmail.com");  
	row2.createCell(4).setCellValue("800000.00"); 