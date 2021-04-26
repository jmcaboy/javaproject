package Amusement;

public class Main extends Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main main = new Main();
		do {
			Input.Day_Night();
			Input.InputAge();
			Input.amountTicket();
			Input.Disc();
			Processing.Choice_Ticket(age);
			Processing.CalDisc(Discount_rate, price);
			Output.printoutTicket();
			Output.eachprice(Discount_rate,price);		
			Input.Ticketing();
		} while(will != 0);
	
		
	}
}
