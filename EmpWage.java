public class EmpWage {
	public static void main(String args[]) {
		System.out.println("***Welcome to EmpWage Details***");
				// Constants
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HR = 20;
			// Variables
		int empHrs = 0;
		int empWage = 0;
				// Computation
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == IS_PART_TIME)
			{
				empHrs = 4;
				System.out.println("Employee is Present");
			}
		else if (empcheck == IS_FULL_TIME)
			{
				empHrs = 8;
				System.out.println("Employee is Present");
			}
								
		else
			{
				empHrs = 0;
				System.out.println("Employee is Abscent");
			}
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Emp Wage: "+empWage);
	}
}

