package RenameAllFiles;	
	import java.io.File;
  	public class RenameAllFiles {
		    public static void main(String[] args) {
		        // change file names in 'Directory':
		        String absolutePath = "/home/hithesh/Downloads/AB"; //windows use (\\) for linux flavours use (/)
		        File dir = new File(absolutePath);
		        File[] filesInDir = dir.listFiles();
		        int i = 0;
		        for(File file:filesInDir) {
		            i++;
		            String name = file.getName();
		            String newName = "" + i + ".txt";
		            String newPath = absolutePath + "//" + newName;
		            file.renameTo(new File(newPath));
		            System.out.println(name + " changed to " + newName);
		        }
		    } 
		} 