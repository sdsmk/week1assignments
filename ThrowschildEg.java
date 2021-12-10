package Day1Assignments;
import java.io.*;

class Base{
	void method() {
		System.out.println("Base method");
	}
}
class ThrowschildEg extends Base{
	
		void method() throws ArithmeticException{
				System.out.println("Dervied Class overridden the Base with Unchecked");
			}
	
	public static void main(String args[]) {
		Base b = new ThrowschildEg();
	    b.method();
	}
}
