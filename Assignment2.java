package Day1Assignments;

class Parent {
	    public static void display() {
	        System.out.println("Static or class method from Base");
	    }
	     
	     public void print()  {
	         System.out.println("Non-static or Instance method from Base");
	    }
	}

class Derived extends Parent {
	    public static void display() {
	    	 System.out.println("Static or class method from Derived");
	    }
	     
	    public void print() {
	         System.out.println("Non-static or Instance method from Derived");
	   }
	}
	 
	
	public class Assignment2 {
	    public static void main(String args[])  {
	       Parent ps = new Derived();
	       ps.display(); 
	       ps.print();  
	    }

}
