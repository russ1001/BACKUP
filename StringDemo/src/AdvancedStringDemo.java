
public class AdvancedStringDemo {

	public static void main(String[]args ) {
		
		
		String a = "Welcome to Java";
		String b = new String("Programming is Fun");
		String c = "Java Java Java";
		
		System.out.println(a.replace('W', 'D'));
		System.out.println(c.replaceFirst("Java", "Russ"));
		System.out.println(c.replaceAll("Java", "Russ"));
		System.out.println("Java is fun".matches("Java.*"));
		System.out.println("Java is cool".matches("Java.*"));
		System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
		
		String d = 12 + "";
		System.out.println(d);
		
		char[] chars = b.toCharArray();
		for(int i=0;i<chars.length; i++) {
			
			System.out.println(chars[i]);
		}
		
		
		
		
		
	}
}

