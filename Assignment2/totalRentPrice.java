package Assignment2;

public class totalRentPrice implements Payment {  //2.5 Interface  use in class Customer
	
	public double discount() {
		return 0.2;
	}
	
	public double Rentprice(int selection, int choose, int day) {  //method to calculate rental price per day
		double price=0;
		
				if(selection==1) {    //start selection 1
						if(choose==1) {	//start choose 1
							if(day<=7)
								return price=113;
							else
								return price=113-113*discount();	
						}  //end choose 1
						
						else if(choose==2) {  //start choose 2
							if(day<=7)
								return price=103;
							else
								return price=103-103*discount();	
						}  //end choose 2
						
						else if(choose==3) {  //start choose 3
							if(day<=7)
								return price=93;
							else
								return price=93-93*discount();	
							} //end choose 3
						} //end selection 3
						
				else if(selection==2) {  //start selection 2
							if(choose==1) {  //start choose 1
								if(day<=7)
									return price=153;
								else
									return price=153-153*discount();	
							}  //end choose 1
							
							else if(choose==2) {  //start choose 2
								if(day<=7)
									return price=143;
								else
									return price=143-143*discount();	
							}  //end choose 2
							
							else if(choose==3) {  //start choose 3
								if(day<=7)
									return price=133;
								else
									return price=133-133*discount();	
								}  //end choose 3
							}  //end selection 2
						
				else if(selection==3) { //start selection 3
						if(choose==1) {  //start choose 1
							if(day<=7)
								return price=533;
							else
								return price=533-533*discount();	
						}  //end choose 1
						
						else if(choose==2) {  //start choose 2
							if(day<=7)
								return price=523;
							else
								return price=523-523*discount();	
						}  //end choose 2
						
						else if(choose==3) {  //start choose 3
							if(day<=7)
								return price=513;
							else
								return price=513-513*discount();	
							}  //end choose 3
						}  //end selection 3
				
				
				return price;
		}  //end of method Rentprice
	
	public double getPayment(int selection,int choose, int day) {  //method with 3 arguments implement form class interface to calculate total payment
		return day*Rentprice(selection,choose,day);
	}
	
	public double getPayment(int selection,int choose, int day, double discount) {  //method with 4 arguments implement form class interface to calculate total payment
		return day*Rentprice(selection,choose,day);
	}
	
}  //end totalRentPrice class