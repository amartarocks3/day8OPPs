package UC7_refactor;

import java.util.Random;

public class refactor2 {
	int print;
	int val2;
	
	public int rand1() {
		Random rand= new Random();
		int val1 = rand.nextInt();
		val2 = val1%3;
		return val2;
	}
	
	public int toCheck() {
		if(val2==1) {
			print=8;
			
		}
		else if(val2==2) {
			print=4;
		}
		else {
			print=0;
		}
		return print;
	}
	public static void main(String[] args) {
		refactor2 a1 = new refactor2();
		int totalemphrs=0;
		int totalempdays=0,empwageperhr=20;
		
		int total=0;
		while(totalemphrs<100 && totalempdays<20) {
			a1.rand1();
			totalemphrs+=a1.toCheck();
			System.out.println(a1.toCheck());
			totalempdays++;
			total= total+empwageperhr*a1.toCheck();
		}
		System.out.println(total);
	}

}
