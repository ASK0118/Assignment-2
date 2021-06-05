package Assignment2;

public class vehicleType {   //Super class of Customer
	
	public String name, type, model;
	
	public vehicleType() { //Constructor with no argument
		setType("Sedan, SUV, MPV");
	}
	
	public String printInfoToyota(){  //method to print out the info of toyota
		setName("Toyota");
		setModel("Vios, Harrier, Vellfire");
		return "Brand				: "+ this.getName()+ "\n"
				+ "Model				: "+ this.getModel()
				+ "\nType				: "+ this.getType() 
				+ "\nNumber of seats			: 5, 5, 7\n"
				+ "Full tank capacity in Liter	: 40, 55, 75\n"
				+ "Rent price per day		: RM 113, RM 153, RM 533";
	}
	
	public String printInfoHonda(){  //method to print out the info of honda
		setName("Honda");
		setModel("Civic, CR-V, Odssey");
		return "Brand				: "+ this.getName()+ "\n"
				+ "Model				: "+ this.getModel()
				+ "\nType				: "+ this.getType() 
				+ "\nNumber of seats			: 5, 5, 7\n"
				+ "Full tank capacity in Liter	: 40, 55, 75\n"
				+ "Rent price per day		: RM 103, RM 143, RM 523";
	}
	
	public String printInfoNissan(){  //method to print out the info of nissan
		setName("Nissan");
		setModel("Almera, Rogue, Serena");
		return "Brand				: "+ this.getName() + "\n"
				+ "Model				: "+ this.getModel()
				+ "\nType				: "+ this.getType() 
				+ "\nNumber of seats			: 5, 5, 7\n"
				+ "Full tank capacity in Liter	: 40, 55, 75\n"
				+ "Rent price per day		: RM 93, RM 133, RM 513";
	}
	
	public void printInfo() {  //2.2 Polymorphism
		System.out.println("Information of Vehicles");
		System.out.println("===================");
	}
	
	//2.3 Encapsulation
	
	//Create Setter Method
	public void setName(String name) {
		this.name=name;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	//Create Getter Method
	public String getName() {
		return this.name;
	}
	public String getModel() {
		return this.model;
	}
	
	public String getType() {
		return this.type;
	}
}
