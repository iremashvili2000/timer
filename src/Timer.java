import java.util.Scanner;
import java.util.TimerTask;

public class Timer {
	static Thread thread =new Thread();
	public static void main(String[] args) throws InterruptedException {
		 long d,b,c,a;
		
		Scanner bla=new Scanner(System.in);
		System.out.println("enter time in Seconds (0-60): ");
		d=bla.nextLong();
		if(d>60 || d<0) {
			System.out.println("error");
			
		}else {
		Scanner ans=new Scanner(System.in);
		System.out.println("enter time in minutes(0-60): ");
		c=ans.nextLong();
		if(c>60 || c<0) {
			System.out.println("error!");
		}else {
			Scanner ggg=new Scanner(System.in);
			System.out.println("enter time in hour(0-24): ");
			b=ggg.nextLong();
			if(b>24 || b<0) {
				System.out.println("error!");
			}else {
				a=d+c*60+b*60*60;
				for(long i=a;i>0;i--) {
					thread.sleep(1000);
					System.out.println(i);
				}
				System.out.println("stop time:)");
				
			}
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}


	
}
