
public class StringDemo {

	public static void main(String[] args) {
		
		String s = "Welcome to Java.   ";
		String t = "     Russ is cool.";
		
		String a = "Russ";
		String b = "russ";
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.concat(t));
		System.out.println(s + t);
		System.out.println(t.trim());
		
		if(a.equals(b)) {
		System.out.println("They are the same");
		}
		else {
			System.out.println("They are not the same");
		}
		
		
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("They are the same");
			}
		
		
		
		if(s.compareTo(t) < 0) {
			System.out.println(s + " " + t);
		}
		else {
			System.out.println(t + " " + s);
		}
		
		
		if(s.startsWith("Welcome")) {
			System.out.println("Yes");
		}
		
		if(t.endsWith("cool.")) {
			System.out.println("Yes Yes");
		}
		
		if(s.contains("Java")) {
			System.out.println("Yes Yes Yes");
		}
		
		
		
		
	}
}
