package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test02 {

	public static void main(String[] args) throws Exception {
		File file1=new File("IO/file/io.txt");
		File file2=new File("IO/file/io2.txt");
		
		InputStream in1=new FileInputStream(file1);
		OutputStream out1=new FileOutputStream(file2);
		
		byte[] string=new byte[in1.available()];
		in1.read(string);
		
		//方法一：
//		String str=new String(string, "utf-8");	
//		out1.write(str.getBytes());	
//		file2.createNewFile();
		
		//方法二:
		out1.write(string);
		file2.createNewFile();

	}

}
