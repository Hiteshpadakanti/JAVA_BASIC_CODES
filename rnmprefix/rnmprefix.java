package rnmprefix;


	import java.io.File;
import java.util.Scanner;

	public class rnmprefix {
	    public static void main(String[] args) throws Exception {

	        // VARIABLE SET UP.
	    	int count = 0;
	    	try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter Directory :");  
				String directory=scan.nextLine(); 
				System.out.println("Files Converted Succesfully");
				//String directory = "C:\\Users\\arate_fnfm9wd\\OneDrive - Aratek Innovation Private Limited\\Desktop\\New folder"; //windows use (\\) for linux flavours use (/)
				//String PREFIX = "";

				// No need to modify the code below.
				File[] files = new File(directory).listFiles();
				for(File file : files){
				    if(file.isFile()){
				    	count++;  
				        String ORIGINALNAME = file.getName();
				        File NEWFILE = new File(directory+count+"."+ORIGINALNAME);
				        boolean success = file.renameTo(NEWFILE);
				        if (!success) {
				            System.err.println("FAILED to rename "+file.getName());
				        } else {
				        System.out.println(NEWFILE.getName());
				        }
				    }
				}
			}
	    }
	}