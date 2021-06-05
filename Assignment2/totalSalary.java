package Assignment2;

public class totalSalary implements Payment {  //2.5 Interface  use in class Employee
	
	public double discount() {  
		return 0.07;
	}
	
	public double Rentprice(int selection, int choose, int day) {  //method to calculate salary per day
		double price=0;
		
				if(selection==1) {    //start selection 1
						if(choose==1) {	//start choose 1
								return price=10;	
						}  //end choose 1
						
						else if(choose==2) {  //start choose 2
								return price=2000;
	
						}  //end choose 2

					} //end selection 1
						
				else if(selection==2) {  //start selection 2
							if(choose==1) {  //start choose 1
									return price=30;	
							}  //end choose 1
							
							else if(choose==2) {  //start choose 2
									return price=2500;	
							}  //end choose 2

						}  //end selection 2
						
				else if(selection==3) { //start selection 3
						if(choose==1) {  //start choose 1
								return price=100;
						    }
						else if(choose==2) {  //start choose 2
								return price=3500;	
						}  //end choose 2
					}  //end selection 3
				
				return price;
		}  //end of method Rentprice
	
	public double getPayment(int selection,int choose, int day) {  //method with 3 arguments implement form class interface to calculate total salary
		return day*Rentprice(selection,choose,day);
	}
	
	public double getPayment(int selection,int choose, int day, double discount) {  //method with 4 arguments implement form class interface to calculate total salary
		day=1;
		return day*Rentprice(selection,choose,day)*(1-discount);
	}
	
}  //end totalSalary class
