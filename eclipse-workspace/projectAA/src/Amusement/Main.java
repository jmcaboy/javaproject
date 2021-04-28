package Amusement;

public class Main extends Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			Input.Day_Night();
			Input.InputAge();
			Input.amountTicket();
			Input.Disc();
			Processing.CalAge(ID, currentYear);
			Processing.Choice_Ticket(age);
			Processing.CalDisc(Discount_rate, price);
			Output.eachprice(price);		
			will = Input.Ticketing();
		} while(will != 0);
	
		
	}
}
