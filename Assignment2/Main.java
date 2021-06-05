package Assignment2;

public class Main {

	public static void main(String[] args) {
	
		/*CarRentalCentre CRB = new CarRentalCentre("Paling Best Car Rental", "20, Jalan Besar,12345, Kulim, Kedah", 01234567, "https://carsearchdirect.com");
		System.out.println();*/
		
		AdvertisingNMarketing adMrk = new AdvertisingNMarketing("Paling Best Car Rental", "20, Jalan Besar,12345, Kulim, Kedah", 01234567, "https://carsearchdirect.com");
		System.out.println();
		

		vehicleType toyota = new vehicleType();
		toyota.printInfo();
		System.out.println(toyota.printInfoToyota());
		System.out.println();
		vehicleType honda = new vehicleType();
		System.out.println(honda.printInfoHonda());
		System.out.println();
		vehicleType nissan = new vehicleType();
		System.out.println(nissan.printInfoNissan());
		System.out.println();
		
		Customer cust = new Customer();
		System.out.println();
		
		Employees emp = new Employees();
		System.out.println();
		
		Sales s = new Sales(7000);
		System.out.println();
		
		Finance fin = new Finance(5690.60, 888.99, 400.40, 780.00, 450.49, 31300.73);
		System.out.println();
		
		
		
	}


}
