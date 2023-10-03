# **Project Name**
**Rename File or Directories**

#**Description**
This project is used to rename file and folders in bulk or single.

#**Context**
1. RenameAllFiles --> This is used to rename all bulk files/folders at once.
     You can change desired path --> String absolutePath = "/home/hithesh/Downloads/AB"
     You can change desired output --> String newName = "" + i + ".txt"; (to get .txt you can use same or change it)
     
2. Rename extension --> This is used to change the extension of bulk files at once.
     You can   change extension --> myfile.renameTo(new File(folder_path +
							"\\" + new_file_name + ".png")); (instead of png you can change other)
	 
3. RenameSingleFile --> This is used to change a single file.
     You can change file name --> old filename  --> File f=new File("C:\\Users\\USER10\\Desktop\\Rename\\New Text Document.txt");
                                  new file name --> File r=new File("C:\\Users\\USER10\\Desktop\\Rename\\abc+.txt");
                                  
4. rnmprefix --> This is used to change prefix of the multiple files
     You can change prefix --> String PREFIX = ""; (you can add prefix in the double quotation like -->"example")
        files = textdoc.txt, textdoc2.txt,textdoc3.txt
        
        **output** 
        exampletextdoc.txt, exampletextdoc2.txt,exampletextdoc3.txt
