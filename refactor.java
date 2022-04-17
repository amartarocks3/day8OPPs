package UC7_refactor;
import java.util.Random;

public class refactor {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;


	public static void main(String[] args) {

			// TODO Auto-generated method stub
			int empHrs = 0;
			int totalWage=0;
			int empWage = 0,totalemphrs=0,totalempdays=0;
					
					while(totalemphrs<100 && totalempdays<20) {
					Random rand = new Random();
					int random1 = rand.nextInt();
					int empCheck = random1%3;
					switch(empCheck) {
						case IS_FULL_TIME:empHrs = 8 ;
						break;
						case IS_PART_TIME:empHrs =4;
						break;
						default :empHrs = 0;
					}
					totalempdays++;
					
					empWage = empHrs * EMP_RATE_PER_HOUR;
					totalWage +=empWage;
					System.out.println("Emp Wage: " + empWage);
					totalemphrs=totalemphrs+empHrs;
				}
					System.out.println("Total Wage of month is = "+totalWage);
			}

		}

