package Amusement1;

import java.io.IOException;

import Exchange.fileOut;

public class Main extends Processing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Main main = new Main();
		do {
			output.add(date);
			Input.Day_Night();
			Input.InputAge();
			Input.amountTicket();
			Input.Disc();
			Processing.Choice_Ticket(age);
			Processing.CalDisc(Discount_rate, price);
			Processing.CalTicket(price1, amount);
			Output.printouteachTicket();		
			Input.Ticketing();
			fileOut.dataWrite(output);
			fileOut.fileClose();
		} while(will != 0);
		System.out.println(output);
		Output.Totalprice();
		total_price = 0;
		
	}
}