import java.io.File;
import java.util.Scanner;

public class DirectorySize {

	public static void main(String[] args) {
		
		System.out.println("Enter a dirctory or file: ");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		input.close();
		
		System.out.println(getSize(new File(directory)) + " bytes");
	}
	
	public static long getSize(File file) {
		
		long size = 0;
		
		if(file.isDirectory()) {
			File[] files = file.listFiles()	;
			for(int i=0; i<files.length; i++) {
				size += getSize(files[i]);
			}
		}
		else {
			size += file.length();
		}
		return size;
	}
	
	
	
}
