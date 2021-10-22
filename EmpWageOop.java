public class EmpWageOop {
 
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUMBER_OF_WORKING_DAY = 20;
	public static final int MAX_NUM_OF_HRS_IN_MONTH = 100;

	public static int computeEmpWage() {

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays= 0;

		while(totalEmpHrs <= MAX_NUM_OF_HRS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAY) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs +=empHrs;
			System.out.println("Day : "+ totalWorkingDays + " Emp Hr: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: " +totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args) {
		// print welcome message
		System.out.println("Welcome to Employee Wage Computation Program");

		computeEmpWage();
	}
}
