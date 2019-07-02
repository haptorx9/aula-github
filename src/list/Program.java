package list;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  Locale.setDefault(Locale.US);
	  
	  
	ArrayList<Employee> list = new ArrayList<>();
	  
	 
	  
  System.out.print("how many employee will be registered?");
  int n = sc.nextInt();
  
	   for (int i=1; i<=n; i++) {
		   System.out.println();
		   System.out.println("employee #"+ i + ":");
		   sc.nextLine();
		   int id = sc.nextInt();
		   System.out.print("id: ");
		   String name = sc.nextLine();
		   System.out.print("Salary :");
		   double salary = sc.nextDouble();
		   list.add(new Employee(id, name, salary));
		  
	   }
	  
	   System.out.println();
	   System.out.print("Enter the employee is thet will have salary increase :");
	   int id = sc.nextInt();
	   Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	   if(emp == null) {
		   
		   System.out.println("this is does not exist!");
	   }
	  
	   else {
		   System.out.println("Enter the porcentage: ");
		   double percentage = sc.nextDouble();
		   emp.increaseSalary(percentage);
		   
		   
	   }
	   System.out.println();
	   System.out.println("List of employees: ");
	   for (Employee obj : list) {
		   System.out.println(obj);
	   }
	  
	  sc.close();
	}

}
