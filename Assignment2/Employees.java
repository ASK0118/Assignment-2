package Assignment2;

import java.util.Scanner; 

import java.text.DecimalFormat;  

public class Employees {  

		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		private String empName;
		private int age, phoneNum, selection, choose,day;
		private char gender;
		private double salary, epf, totalPaid ;
		
		public Employees() {    //Constructor with no argument
			
			printInfo();
			System.out.println();
			
			System.out.print("Please enter the name				: ");
			this.empName = input.nextLine();
			
			System.out.print("Please enter the gender\n[M for male, F for female]			: ");
			this.gender = input.next().charAt(0);
			
			System.out.print("Please enter the age				: ");
			this.age = input.nextInt(); 
			
			System.out.print("Please enter the phone number\n[Example: 0123456789]				: ");
			this.phoneNum = input.nextInt();
			
			System.out.print("Please enter the position \n[1 for clerk, 2 for supervisor, 3 for manager]	: ");
			this.selection = input.nextInt();
			
			System.out.print("Please enter the type of position\n[1 for part-time, 2 for full-time]		: ");
			this.choose = input.nextInt();
			
			if(selection==1) { //start selection 1 clerk
				if(choose==1) {  //start choose part time
					System.out.print("Please enter the number of day			: ");
					this.day = input.nextInt();
					
					Payment clerk = new totalSalary(); //2.5 Interface
					salary = clerk.Rentprice(selection, choose, day);//salary for part time clerk
					totalPaid = clerk.getPayment(selection, choose, day);  //initialize the total paid for part time clerk
					
					System.out.println("\nInformation of Employee");
					System.out.println("=======================");
					System.out.println("Name				: " + this.getEmpName());
					System.out.println("Gender				: " + this.getGender());
					System.out.println("Age				: " + this.getAge());
					System.out.println("Phone number			: " + this.getPhoneNum());
					System.out.println("Position			: Clerk");
					System.out.println("Type of job        		: Part time");	
					System.out.println("Paid per day			: RM "+ salary);
					System.out.println("Total paid 			: RM " + df.format(totalPaid));
				}//end choose part time
				
				else if(choose==2) {  //start choose full time
					Payment clerk = new totalSalary();  //2.5 Interface
					salary = clerk.Rentprice(selection, choose, day);  //salary for full time clerk
					epf = clerk.discount();  //epf of full time clerk
					totalPaid = clerk.getPayment(selection, choose, day, epf);//initialize the total paid for full time clerk
					System.out.println("\nInformation of Employee");
					System.out.println("=======================");
					System.out.println("Name					: " + this.getEmpName());
					System.out.println("Gender					: " + this.getGender());
					System.out.println("Age					: " + this.getAge());
					System.out.println("Phone number				: " + this.getPhoneNum());
					System.out.println("Position				: Clerk");
					System.out.println("Type of job        			: Full time");
					System.out.println("Salary per month			: RM "+ salary);
					System.out.println("Total salary after minus EPF for a month: RM " + df.format(totalPaid));
				}  //end choose full time
			}//end selection 1 clerk
			
			else if(selection==2) { //start selection 2 supervisor
				if(choose==1) {  //start choose part time
					System.out.print("Please enter the number of day			: ");
					this.day = input.nextInt();
					
					Payment supervisor = new totalSalary(); //2.5 Interface
					salary = supervisor.Rentprice(selection, choose, day);//salary for part time supervisor
					totalPaid = supervisor.getPayment(selection, choose, day);  //initialize the total paid for part time supervisor
					
					System.out.println("\nInformation of Employee");
					System.out.println("=======================");
					System.out.println("Name				: " + this.getEmpName());
					System.out.println("Gender				: " + this.getGender());
					System.out.println("Age				: " + this.getAge());
					System.out.println("Phone number			: " + this.getPhoneNum());
					System.out.println("Position			: Supervisor");
					System.out.println("Type of job        		: Part time");	
					System.out.println("Paid per day			: RM "+ salary);
					System.out.println("Total paid 			: RM " + df.format(totalPaid));
				}//end choose part time
				
				else if(choose==2) {  //start choose full time
					Payment supervisor = new totalSalary();  //2.5 Interface
					salary = supervisor.Rentprice(selection, choose, day);  //salary for full time supervisor
					epf = supervisor.discount();  //epf of full time supervisor
					totalPaid = supervisor.getPayment(selection, choose, day, epf);//initialize the total paid for full time supervisor
					System.out.println("\nInformation of Employee");
					System.out.println("=======================");
					System.out.println("Name					: " + this.getEmpName());
					System.out.println("Gender					: " + this.getGender());
					System.out.println("Age					: " + this.getAge());
					System.out.println("Phone number				: " + this.getPhoneNum());
					System.out.println("Position				: Supervisor");
					System.out.println("Type of job        			: Full time");
					System.out.println("Salary per month			: RM "+ salary);
					System.out.println("Total salary after minus EPF for a month: RM " + df.format(totalPaid));
				}  //end choose full time
			}//end selection 2 supervisor
			
			else if(selection==3) { //start selection 3 manager
				if(choose==1) {  //start choose part time
					System.out.print("Please enter the number of day			: ");
					this.day = input.nextInt();
					
					Payment clerk = new totalSalary(); //2.5 Interface
					salary = clerk.Rentprice(selection, choose, day);//salary for part time manager
					totalPaid = clerk.getPayment(selection, choose, day);  //initialize the total paid for part time manager
					
					System.out.println("\nInformation of Employee");
					System.out.println("=======================");
					System.out.println("Name				: " + this.getEmpName());
					System.out.println("Gender				: " + this.getGender());
					System.out.println("Age				: " + this.getAge());
					System.out.println("Phone number			: " + this.getPhoneNum());
					System.out.println("Position			: Manager");
					System.out.println("Type of job        		: Part time");	
					System.out.println("Paid per day			: RM "+ salary);
					System.out.println("Total paid 			: RM " + df.format(totalPaid));
				}//end choose part time
				
				else if(choose==2) {  //start choose full time
					Payment clerk = new totalSalary();  //2.5 Interface
					salary = clerk.Rentprice(selection, choose, day);  //salary for full time manager
					epf = clerk.discount();  //epf of full time manager
					totalPaid = clerk.getPayment(selection, choose, day, epf);//initialize the total paid for full time manager
					System.out.println("\nInformation of Employee");
					System.out.println("=======================");
					System.out.println("Name					: " + this.getEmpName());
					System.out.println("Gender					: " + this.getGender());
					System.out.println("Age					: " + this.getAge());
					System.out.println("Phone number				: " + this.getPhoneNum());
					System.out.println("Position				: Manager");
					System.out.println("Type of job        			: Full time");
					System.out.println("Salary per month			: RM "+ salary);
					System.out.println("Total salary after minus EPF for a month: RM " + df.format(totalPaid));
				}  //end choose full time
			}//end selection 3 manager
		}
		
		public void printInfo() {  //2.2 Polymorphism
			System.out.println("Employee Input Session");
			System.out.println("======================");
		}
		
		//2.3 Encapsulation
		
		//Create getter method
		public String getEmpName() {
			return this.empName;
		}
		
		public char getGender() {
			return this.gender;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public int getPhoneNum() {
			return this.phoneNum;
		}
		
}