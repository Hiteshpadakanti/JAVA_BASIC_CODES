package renamesinglefile;

	import java.io.*;

	public class renamesinglefile {
	 
    public static void main(String[] args) throws IOException{
    	//windows use (\\) for linux flavours use (/)
       File f=new File("C:\\Users\\USER10\\Desktop\\Rename\\New Text Document.txt");
       File r=new File("C:\\Users\\USER10\\Desktop\\Rename\\abc+.txt");
       
       if(f.exists()) {
    	   System.out.println(f.renameTo(r)); 
       } 
       else {
    	   System.out.println("File doesn't exists");
       }
    }
	}