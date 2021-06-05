package Assignment2;

public class AdvertisingNMarketing extends CarRentalCentre {  //2.1 Inheritance  Subclass of CarRentalCentre
	
	private double price,discount;
	
	AdvertisingNMarketing(String CN, String CA, int CPN, String CW){  //Constructor with no arguments 4
		
		super(CN, CA, CPN, CW);
		price=113;
		discount=0.2;
		
		printInfo();
		System.out.println();
		Adv(price, discount);
	}

public void printInfo() {  //2.2 Polymorphism
	System.out.println("Information of Company");
	System.out.println("===================");
	System.out.println("Company Name		: " + super.CompanyName);
	System.out.println("Company Address		: " + super.CompanyAdd);
	System.out.println("Company Phone Number	: " + super.CompanyPhoneNum);
	System.out.println("Company Website		: " + super.CompanyWebsite);
}

public void Adv(double price, double discount) {  //method with 2 parameters
	System.out.println("AFFORDABLE CAR RENTAL!!!");
	System.out.println("Rent at the price as low as RM " + price + " !!!");
	System.out.println("You will get a " + discount*100 + " % discount if rent more than 7 days !!!");
	}
}