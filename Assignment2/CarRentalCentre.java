package Assignment2;

public abstract class CarRentalCentre {  //2.4 Abstraction     Super Class of AdvertisingNMarketing
	
	public String CompanyName, CompanyAdd, CompanyWebsite;
	public int CompanyPhoneNum;
	
	public CarRentalCentre(String CN, String CA, int CPN, String CW) {  //Constructor with 4 arguments
		this.CompanyName = CN;
		this.CompanyAdd = CA;
		this.CompanyPhoneNum = CPN;
		this.CompanyWebsite = CW;
		
	}
	public abstract void printInfo();
}
