package prefixchanger;
import java.io.File;
import java.util.Scanner;

	public class prefixchanger {
	    public static void main(String[] args) throws Exception {

	        // VARIABLE SET UP.
	    	int count = 0;
	    	try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Enter Directory: ");
				String directory = scanner.nextLine();
				//String directory = "";
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