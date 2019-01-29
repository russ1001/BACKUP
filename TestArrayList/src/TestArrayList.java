
public class TestArrayList {

	public static void main(String[] args) {
		
		java.util.ArrayList cityList = new java.util.ArrayList();
		
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("\n" + cityList + "\n");
		
		System.out.println("List size? " + cityList.size());
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list is: " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());
		
		System.out.println("\n" + cityList + "\n");
		
		cityList.add(2, "Xian");
		System.out.println("\n" + cityList + "\n");
		
		cityList.remove("Miami");
		System.out.println("\n" + cityList + "\n");
		
		cityList.remove(1);
		System.out.println("\n" + cityList + "\n");
		
		for(int i = cityList.size()-1; i>=0; i--) {
			System.out.println(cityList.get(i) + " ");
		}
		System.out.println();
	
		for(int i = 0; i<cityList.size(); i++) {
			System.out.println(cityList.get(i) + " ");
		}
		System.out.println();
		
		
		
		java.util.ArrayList list = new java.util.ArrayList();
		list.add(new Circle4(2));
		list.add(new Circle4(4));
		
		System.out.println("\n" + list + "\n");
		
	}
	
	
}
