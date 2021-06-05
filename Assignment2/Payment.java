package Assignment2;

public interface Payment {  //2.5 Interface
	
	double discount();
	double Rentprice(int selection,int choose, int day);
	double getPayment(int selection,int choose,int day);
	double getPayment(int selection,int choose, int day, double discount);
}
