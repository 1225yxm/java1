package file;

import java.io.File;

public class Test01 {

	public static void main(String[] args) throws Exception {
		
		File test = new File("g:/test");
		search(test);

	}
	
	public static void search(File test) {
		File [ ] file=test.listFiles();
		for (File f : file) {
			System.out.println(f);
			if(f.isDirectory()) {
				search(f);
		}
	}
	}
	

}
