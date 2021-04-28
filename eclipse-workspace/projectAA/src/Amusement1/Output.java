package Amusement1;

import java.io.IOException;

public class Output extends Input{
	public static void printouteachTicket() throws IOException {
		System.out.printf("가격은 %d원입니다.\n", amountprice);
		String amount1 = Integer.toString(amount);
		String pricestring = Integer.toString(amountprice);
		output.add(nameofTicket);output.add(amount1);output.add(pricestring);output.add(Discountname);		
	}
	public static void Totalprice() throws IOException{
		System.out.println("================에버랜드=================");
		for(int i = 0;i<output.size();i+=5) {
			System.out.printf("%s X %s %s원 *%s\n", output.get(i+1), output.get(i+2), output.get(i+3), output.get(i+4));
			total_price += Integer.parseInt(output.get(i+3));
		}
		System.out.println();
		System.out.printf("입장료 총액은 %d원 입니다\n", total_price);
		System.out.println("===============================");
	}
	
}