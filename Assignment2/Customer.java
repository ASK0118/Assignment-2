package Assignment2;

import java.util.Scanner; 

import java.text.DecimalFormat;  

public class Customer extends vehicleType {   //2.1 Inheritance   Subclass of vehicleType

		Scanner input = new Scanner(System.in);
		
		DecimalFormat df2 = new DecimalFormat("#.##") ;
		
		private String custName;
		private int age, phoneNum, selection,day, choose;
		private char gender;
		private double RentPrice, totPrice;
		
		public Customer() {   //Constructor with no argument
			//super(n,m,t);
			
			printInfoToyota();
			printInfoHonda();
			printInfoNissan();
			
			printInfo();
			System.out.println();
			System.out.print("Please enter the name			: ");
			this.custName = input.nextLine();
			
			System.out.print("Please enter the gender\n[M for male, F for female]		: ");
			this.gender = input.next().charAt(0);
			
			System.out.print("Please enter the age			: ");
			this.age = input.nextInt(); 
			
			System.out.print("Please enter the phone number [Example: 0123456789]: ");
			this.phoneNum = input.nextInt();
			
			System.out.print("Please enter the type of car wanted to select\n[1 for Sedan, 2 for SUV, 3 for MPV]	: ");
			this.selection = input.nextInt();
			
				switch(selection) {
					
				case 1 :System.out.print("Please select the car model\n[1 for Vios, 2 for Civic, 3 for Almera]: ");  //selection for car type sedan
						this.choose = input.nextInt();
						
						if (choose==1) { //choose for vios
							System.out.print("Please enter number of rental days	: ");
							this.day = input.nextInt();
							System.out.println("\nInformation of Customer");
							System.out.println("=======================");
							
							if(day<=7) {  //start for day less or equal to 7
								
								Payment vios = new totalRentPrice(); //2.5 Interface
								this.RentPrice= vios.Rentprice(selection,choose,day);  // price for vios if rent less than or equal 7 days
								this.totPrice=vios.getPayment(selection,choose,day);   //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Vios" );
								System.out.println("The rental price per day 	: RM "+ this.RentPrice);
								System.out.println("The total rental price 		: RM "+ totPrice);
								} //end for day less than 7
						
							else {  //start of day more than 7
								Payment vios = new totalRentPrice();  //2.5 Interface
								double discount = vios.discount();
								this.RentPrice= vios.Rentprice(selection,choose, day);  //new price for vios if rent more than 7 days 
								totPrice= vios.getPayment(selection,choose,day, discount); //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Vios" );
								System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
								System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
								}  //end for day more than 7
							} //end for choose 1
				
							else if (choose==2) { //choose for civic
								System.out.print("Please enter number of rental days	: ");
								this.day = input.nextInt();
								System.out.println("\nInformation of Customer");
								System.out.println("=======================");
								
								if(day<=7) {  //start for day less or equal to 7
									Payment civic = new totalRentPrice();  //2.5 Interface
									this.RentPrice= civic.Rentprice(selection,choose,day);  // price for civic if rent less than or equal 7 days
									this.totPrice= civic.getPayment(selection,choose,day);   //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Civic" );
									System.out.println("The rental price per day 	: RM "+ this.RentPrice);
									System.out.println("The total rental price 		: RM "+ totPrice);
									} //end for day less than 7
							
								else {  //start of day more than 7
									Payment civic = new totalRentPrice();  //2.5 Interface
									double discount = civic.discount();
									this.RentPrice= civic.Rentprice(selection,choose,day);  //new price for civic if rent more than 7 days 
									totPrice= civic.getPayment(selection,choose,day, discount); //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Civic" );
									System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
									System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
									}  //end for day more than 7
								} //end for selection 2
				
								else if (choose==3) { //choose for almera
									System.out.print("Please enter number of rental days	: ");
									this.day = input.nextInt();
									System.out.println("\nInformation of Customer");
									System.out.println("=======================");
									
									if(day<=7) {  //start for day less or equal to 7
										Payment almera = new totalRentPrice();  //2.5 Interface
										this.RentPrice= almera.Rentprice(selection,choose,day);  // price for almera if rent less than or equal 7 days
										this.totPrice= almera.getPayment(selection,choose,day);   //initialize the total price for rental
										System.out.println("\nName				: " + this.custName);
										System.out.println("Gender				: " + this.gender);
										System.out.println("Age				: " + this.age);
										System.out.println("Phone number			: " + this.phoneNum);
										System.out.println("Car				: Almera" );
										System.out.println("The rental price per day 	: RM "+ this.RentPrice);
										System.out.println("The total rental price 		: RM "+ totPrice);
										} //end for day less than 7
								
									else {  //start of day more than 7
										Payment almera = new totalRentPrice();  //2.5 Interface
										double discount = almera.discount();
										this.RentPrice= almera.Rentprice(selection,choose,day);  //new price for almera if rent more than 7 days 
										totPrice= almera.getPayment(selection,choose,day, discount); //initialize the total price for rental
										System.out.println("\nName				: " + this.custName);
										System.out.println("Gender				: " + this.gender);
										System.out.println("Age				: " + this.age);
										System.out.println("Phone number			: " + this.phoneNum);
										System.out.println("Car				: Almera" );
										System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
										System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
										}  //end for day more than 7
									} //end for choose 3
									break;   //break for switch case 1 
								
				case 2 :System.out.print("Please select the car model\n[1 for Harrier, 2 for CR-V, 3 for Rogue]: ");  //selection for car type SUV
						this.choose = input.nextInt();
				
						if (choose==1) { //choose for Harrier
							System.out.print("Please enter number of rental days	: ");
							this.day = input.nextInt();
							System.out.println("\nInformation of Customer");
							System.out.println("=======================");
							
							if(day<=7) {  //start for day less or equal to 7
								Payment Harrier = new totalRentPrice();  //2.5 Interface
								this.RentPrice= Harrier.Rentprice(selection,choose,day);  // price for Harrier if rent less than or equal 7 days
								this.totPrice= Harrier.getPayment(selection,choose,day);   //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Harrier" );
								System.out.println("The rental price per day	: RM "+ this.RentPrice);
								System.out.println("The total rental price 		: RM "+ totPrice);
								} //end for day less than 7
						
							else {  //start of day more than 7
								Payment Harrier = new totalRentPrice();  //2.5 Interface
								double discount = Harrier.discount();
								this.RentPrice= Harrier.Rentprice(selection,choose,day);  //new price for Harrier if rent more than 7 days 
								totPrice= Harrier.getPayment(selection,choose,day, discount); //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Harrier" );
								System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
								System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
								}  //end for day more than 7
							} //end for choose 1
				
								else if (choose==2) { //choose for CR-V
									System.out.print("Please enter number of rental days	: ");
									this.day = input.nextInt();
									System.out.println("\nInformation of Customer");
									System.out.println("=======================");
									
									if(day<=7) {  //start for day less or equal to 7
										Payment CRV = new totalRentPrice();  //2.5 Interface
										this.RentPrice= CRV.Rentprice(selection,choose,day);  // price for CR-V if rent less than or equal 7 days
										this.totPrice=CRV.getPayment(selection,choose,day);   //initialize the total price for rental
										System.out.println("\nName				: " + this.custName);
										System.out.println("Gender				: " + this.gender);
										System.out.println("Age				: " + this.age);
										System.out.println("Phone number	: " + this.phoneNum);
										System.out.println("Car				: CR-V" );
										System.out.println("The rental price per day	: RM "+ this.RentPrice);
										System.out.println("The total rental price 		: RM "+ totPrice);
										} //end for day less than 7
								
									else {  //start of day more than 7
										Payment CRV = new totalRentPrice();  //2.5 Interface
										double discount = CRV.discount();
										this.RentPrice= CRV.Rentprice(selection,choose,day);  //new price for CR-V if rent more than 7 days 
										totPrice= CRV.getPayment(selection,choose,day, discount); //initialize the total price for rental
										System.out.println("\nName				: " + this.custName);
										System.out.println("Gender				: " + this.gender);
										System.out.println("Age				: " + this.age);
										System.out.println("Phone number			: " + this.phoneNum);
										System.out.println("Car				: CR-V" );
										System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
										System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
										}  //end for day more than 7
									} //end for choose 2
				
								else if (choose==3) { //choose for Rogue
									System.out.print("Please enter number of rental days	: ");
									this.day = input.nextInt();
									System.out.println("\nInformation of Customer");
									System.out.println("=======================");
									
									if(day<=7) {  //start for day less or equal to 7
										Payment rogue = new totalRentPrice();  //2.5 Interface
										this.RentPrice= rogue.Rentprice(selection,choose,day);  // price for Rogue if rent less than or equal 7 days
										this.totPrice= rogue.getPayment(selection,choose,day);   //initialize the total price for rental
										System.out.println("\nName				: " + this.custName);
										System.out.println("Gender				: " + this.gender);
										System.out.println("Age				: " + this.age);
										System.out.println("Phone number			: " + this.phoneNum);
										System.out.println("Car				: Rogue" );
										System.out.println("The rental price per day 	: RM "+ this.RentPrice);
										System.out.println("The total rental price 		: RM "+ totPrice);
										} //end for day less than 7
								
									else {  //start of day more than 7
										Payment rogue = new totalRentPrice();  //2.5 Interface
										double discount = rogue.discount();
										this.RentPrice= rogue.Rentprice(selection,choose,day);  //new price for Rogue if rent more than 7 days 
										totPrice= rogue.getPayment(selection,choose,day, discount); //initialize the total price for rental
										System.out.println("\nName				: " + this.custName);
										System.out.println("Gender				: " + this.gender);
										System.out.println("Age				: " + this.age);
										System.out.println("Phone number			: " + this.phoneNum);
										System.out.println("Car				: Rogue" );
										System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
										System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
										}  //end for day more than 7
									} //end for choose 3
									break;   //break for switch case 2 
							
				case 3 :System.out.print("Please select the car model\n[1 for Vellfire, 2 for Odssey, 3 for Serena]: ");  //selection for car type MPV
						this.choose = input.nextInt();
					
						if (choose==1) { //choose for Vellfire
							System.out.print("Please enter number of rental days	: ");
							this.day = input.nextInt();
							System.out.println("\nInformation of Customer");
							System.out.println("=======================");
							
							if(day<=7) {  //start for day less or equal to 7
								Payment Vellfire = new totalRentPrice();  //2.5 Interface
								this.RentPrice= Vellfire.Rentprice(selection,choose,day);  // price for Vellfire if rent less than or equal 7 days
								this.totPrice= Vellfire.getPayment(selection,choose,day);  //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Vellfire" );
								System.out.println("The rental price per day 	: RM "+ this.RentPrice);
								System.out.println("The total rental price 		: RM "+ totPrice);
								} //end for day less than 7
						
							else {  //start of day more than 7
								Payment Vellfire = new totalRentPrice();  //2.5 Interface
								double discount = Vellfire.discount();
								this.RentPrice= Vellfire.Rentprice(selection,choose,day); //new price for Vellfire if rent more than 7 days 
								totPrice= Vellfire.getPayment(selection,choose,day, discount); //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Vellfire" );
								System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
								System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
								}  //end for day more than 7
							} //end for choose 1
				
								else if (choose==2) { //choose for Odssey
									System.out.print("Please enter number of rental days	: ");
									this.day = input.nextInt();
									System.out.println("\nInformation of Customer");
									System.out.println("=======================");
									
									if(day<=7) {  //start for day less or equal to 7
										Payment odssey = new totalRentPrice();  //2.5 Interface
										this.RentPrice= odssey.Rentprice(selection,choose,day);  // price for Odssey if rent less than or equal 7 days
										this.totPrice= odssey.getPayment(selection,choose,day);   //initialize the total price for rental
										System.out.println("\nName				: " + this.custName);
										System.out.println("Gender				: " + this.gender);
										System.out.println("Age				: " + this.age);
										System.out.println("Phone number			: " + this.phoneNum);
										System.out.println("Car				: Odssey" );
										System.out.println("The rental price per day 	: RM "+ this.RentPrice);
										System.out.println("The total rental price 		: RM "+ totPrice);
										} //end for day less than 7
								
									else {  //start of day more than 7
										Payment odssey = new totalRentPrice();  //2.5 Interface
										double discount = odssey.discount();
										this.RentPrice= odssey.Rentprice(selection,choose,day);  //new price for Odssey if rent more than 7 days 
										totPrice= odssey.getPayment(selection,choose,day, discount); //initialize the total price for rental
										System.out.println("\nName				: " + this.custName);
										System.out.println("Gender				: " + this.gender);
										System.out.println("Age				: " + this.age);
										System.out.println("Phone number			: " + this.phoneNum);
										System.out.println("Car				: Odssey" );
										System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
										System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
										}  //end for day more than 7
									} //end for choose 2
				
							else if (choose==3) { //choose for Serena
								System.out.print("Please enter number of rental days	: ");
								this.day = input.nextInt();
								System.out.println("\nInformation of Customer");
								System.out.println("=======================");
								
								if(day<=7) {  //start for day less or equal to 7
									Payment serena = new totalRentPrice();  //2.5 Interface
									this.RentPrice= serena.Rentprice(selection,choose,day);  // price for Serena if rent less than or equal 7 days
									this.totPrice= serena.getPayment(selection,choose,day);   //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Serena" );
									System.out.println("The rental price per day 	: RM "+ this.RentPrice);
									System.out.println("The total rental price 		: RM "+ totPrice);
									} //end for day less than 7
							
								else {  //start of day more than 7
									Payment serena = new totalRentPrice();  //2.5 Interface
									double discount = serena.discount();
									this.RentPrice= serena.Rentprice(selection,choose,day);  //new price for Serena if rent more than 7 days 
									totPrice= serena.getPayment(selection,choose,day, discount); //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Serena" );
									System.out.println("The rental price per day 	: RM "+ df2.format(this.RentPrice));
									System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
									}  //end for day more than 7
								} //end for choose 3
								break;   //break for switch case 3
					}
		}
		
		public void printInfo() {  //2.2 Polymorphism
			System.out.println("Customer Input Session");
			System.out.println("======================");
		}
		
}
