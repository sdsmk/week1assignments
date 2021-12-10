package Day1Assignments;

import java.util.*;

abstract class employee{
	public String name;
	public int id;
	public String status;
	
	public employee(String name, int id) {
	      //System.out.println("Constructing an Employee");
	      this.name = name;
	      this.id = id;
	   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
	      return name + " " + id;
	   }
}

class Permanentemployee extends employee{
	public String status;
	public Permanentemployee(String name, int id, String status) {
		super(name, id);
		this.status=status;		
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
	      return name + " " + id +" "+status;
	   }
}
class Currentemployee extends employee{
	public String status;
	public Currentemployee(String name, int id, String status) {
		super(name, id);
		this.status=status;		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String toString() {
	      return name + " " + id +" "+status;
	   }
}
public class Assignment4 {
	public static void main(String args[]) {
		
		Permanentemployee emp1= new Permanentemployee("Dhana",1,"permanentemployee");
		Permanentemployee emp2= new Permanentemployee("Satya",2,"permanentemployee");
		Permanentemployee emp3= new Permanentemployee("Mani",3,"permanentemployee");
		
		Currentemployee emp4 = new Currentemployee("kiran",4,"currentemployee");
		Currentemployee emp5 = new Currentemployee("uday",5,"currentemployee");
		Currentemployee emp6 = new Currentemployee("lokesh",6,"currentemployee");
		
		List<employee> stringList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
		stringList.forEach(employee->System.out.println(employee));
}}
