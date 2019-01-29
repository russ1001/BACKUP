public class Test { 
 public static void main(String[] args) {
  String s = "Java";
  StringBuilder buffer = new StringBuilder(s);
  change(s);
  System.out.println(s);
 }
 
 private static void change(String s) {
  s = s + " and HTML";
 }
}