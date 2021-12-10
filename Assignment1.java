package Day1Assignments;

import java.util.Random;
import java.util.*;

class NotificationBar {
	static List<NotificationBar> list=new ArrayList<NotificationBar>();
	static Random random = new Random();
	private static NotificationBar obj = null;
	static int round;
	NotificationBar() {
		System.out.println("NotificationBar() called");
	}
	
	static NotificationBar get() {
		if (obj == null||NotificationBar.list.size()<3) {
			obj = new NotificationBar();
			list.add(obj);
			return obj;
		} 
		return null;
	}
	
	static NotificationBar getInstance(){
		NotificationBar obj= get();
		if(obj!= null) {
			return obj;
		}
		return NotificationBar.list.get( NotificationBar.random.nextInt(NotificationBar.list.size()));

	}
	
	static NotificationBar getRound(){
		NotificationBar obj= get();
			
		if(obj!= null) {
			return obj;
		}
		if(round==2) {
			round=0;
		}
		else{
			++round;
		}
		return NotificationBar.list.get(round);
	}
	
	void showIcon() {
		System.out.println("showing icon...."+this);
		
	}	
}
public class Assignment1 {
	
	public static void main(String[] args) {
		NotificationBar nBar1 = NotificationBar.getInstance();
		nBar1.showIcon();

		NotificationBar nBar2 = NotificationBar.getInstance();
		nBar2.showIcon();
		
		NotificationBar nBar3 = NotificationBar.getInstance();
		nBar3.showIcon();
		
		System.out.println("Random Instance -------------------");
		
		NotificationBar nBar4 = NotificationBar.getInstance();
		nBar4.showIcon();
		
		System.out.println("-------Roundrobin-------------------");

		NotificationBar nBar5 = NotificationBar.getRound();
		nBar5.showIcon();
		
		NotificationBar nBar6 = NotificationBar.getRound();
		nBar6.showIcon();
		
		NotificationBar nBar7 = NotificationBar.getRound();
		nBar7.showIcon();
		
		NotificationBar nBar8 = NotificationBar.getRound();
		nBar8.showIcon();
		
		NotificationBar nBar9 = NotificationBar.getRound();
		nBar9.showIcon();
		
		NotificationBar nBar10 = NotificationBar.getRound();
		nBar10.showIcon();

	}

}
