package Payroll;
/**
 *
 * @author Peggy Fisher
 */
public class Payroll {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address a1 = new Address("123", "South Main Street", "Cleveland", "OH", 
                "12345");
        Address a2 = new Address("123", "North Main Street", "Willoughby", "OH", 
                "54321");
        Address a3 = null;
        
        
        
        Employee ee1 = new Employee("Peggy", "Fisher", "717-555-1212",a1, 
                955123, 003, "Lecturer",45000.00 );
        ee1.printEmployee();
		
		Employee ee2 = new Employee("Bob", "Fisher", "717-555-1212",a2, 955123, 
                003, "Lecturer",45500.00 );
        ee2.printEmployee();
        
        Employee ee3 = new Employee("Jane", "Smith", "510-55-1212", a3, 456789, 001, "Administrator", 55000);
        
        ee2.setSalary(60000);
        ee2.setTitle("Producer");
        ee2.printEmployee();
        
        
        ee1.printEmployee();
        ee2.printEmployee();
        ee3.printEmployee();
        
        
		//compare salaries to see who makes more money  
		  
		if(ee1.compareTo(ee2)==0)
			System.out.println("\nEqual salaries");
		else if(ee1.compareTo(ee2)<0)
			System.out.println("\n"+ee2.getName() + " makes more than "+
					ee1.getName());
		else			
			System.out.println("\n"+ee1.getName() + " makes more than "+
					ee2.getName());
					
		//print out the addresses in sorted order by zipcode
		System.out.println("Addresses in sorted order: \n");
		if(a1.compareTo(a2)==0 || a1.compareTo(a2)<0)
		{
			System.out.println(a1);
			System.out.println(a2);
		}
		else
		{
			System.out.println(a2);
			System.out.println(a1);
		}
			
		
    } 
    
}
