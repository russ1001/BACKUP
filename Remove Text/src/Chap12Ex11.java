import java.io.File;
import java.text.FieldPosition;

public class Chap12Ex11 {

	
	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("Invalid arguements");
			System.out.println("Usage: java Chapgter_12.Excercise_11 word filename");
			System.exit(1);
		}
		
		File file = new File(args[1]) {
			if(!file.exists()) {
				System.out.println(args[1] + " does not exist");
				System.out.println(2);
				
			}
		}
	}
}
