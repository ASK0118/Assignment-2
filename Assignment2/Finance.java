package Assignment2;

import java.text.DecimalFormat;  

public class Finance extends Sales{   //2.1 Inheritance  Subclass of Sales
	
	private double employSalary, inventExp, utilitiesFee, maintenanceFee, advertiseFee;
	
	    Finance(double sales ,double eS, double iE, double uF, double mF, double aF) {  //Constructor with 7 arguments
		
		super(sales);
		this.employSalary = eS;
		this.inventExp = iE;
		this.utilitiesFee = uF;
		this.maintenanceFee = mF;
		this.advertiseFee = aF;
		
		DecimalFormat df2 = new DecimalFormat("#.##") ;
		super.printInfo();
		System.out.println();
		printInfo();
		System.out.println("Total employees salary		: RM " + this.employSalary);
		System.out.println("Total inventory fee		: RM " + this.inventExp);
		System.out.println("Total utilities fee		: RM " + this.utilitiesFee);
		System.out.println("Total maintenance fee		: RM " + this.maintenanceFee);
		System.out.println("Total advertisement fee		: RM " + this.advertiseFee);
		System.out.println("Total expenses			: RM " + df2.format(totalExpenses()));
		System.out.println("Total sales			: RM " + super.totalSalesMonth());
		System.out.println("Net profit			: RM " + df2.format(netProfit()));
		System.out.println();
	}
	
	public double totalExpenses() {  //method to calculate total expenses
		return employSalary + inventExp + utilitiesFee + maintenanceFee + advertiseFee ;
	}
	
	public double netProfit() {  //method to calculate net profit
		return super.totalSalesMonth() - totalExpenses();
	}
	
	public void printInfo() {  //2.2 Polymorphism
		System.out.println("Financial Statement of One Month");
		System.out.println("================================");
	}
}
