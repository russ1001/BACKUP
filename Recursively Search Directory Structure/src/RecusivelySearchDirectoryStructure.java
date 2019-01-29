import java.io.*;
import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;

public class RecusivelySearchDirectoryStructure {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("Usage: java Excercise directory Name word");
			System.exit(0);
		}
		findInFile(new File(args[0], args[1]), null);
	}
	
	public static long findInFile(File file, String word) {
		long numberOfFiles = 0;
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(int i=0; i<files.length; i++) {
				findInFile(files[i], word);
			}
		}
		else {
			findWord(file, word);
				numberOfFiles++;
			
		}
		return numberOfFiles;
	}
	
	public static void findWord(File file, String word) {
		try {
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				if(line.lastIndexOf(word) > -1) {
					System.out.println(file + ": " + line);
				}
			}
			input.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
