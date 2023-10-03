package excelgen;

import java.io.*;

public class excelgen {
	public static void main(String[] args) {
		try {
			//Creating the excel file in the directory
			String filename="/home/hithesh/Downloads/gen.xls";
			FileOutputStream fileOut= new FileOutputStream(filename);
			fileOut.close();
		}
		catch (Exception e){
	}
	}
}