package Amusement1;

import java.io.IOException;

import Exchange.fileOut1;

public class Main extends Output {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int go;
		do {
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
				
			} while(will != 0);
			fileOut.dataWrite();
			System.out.println(output);
			Output.Totalprice();
			fileOut.fileClose();
			//fw.flush();
			//fw.close();
			total_price = 0;
			output.clear();
			System.out.println("계속 진행(1 : 새로운 주문, 2: 프로그램 종료)");
			go = scanner.nextInt();
		} while(go != 2);
		
		
	}
}