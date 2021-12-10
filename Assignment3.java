package Day1Assignments;
import java.io.*;

class Base{
	void method() {
		System.out.println("Base method");
	}
}
class Assignment3 extends Base{
	
		void method() throws ArithmeticException{
				System.out.println("Dervied Class overridden the Base with Unchecked");
			}
	
	public static void main(String args[]) {
		Base b = new Assignment3();
	    b.method();
	}
}
