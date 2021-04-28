package Amusement1;

public class Output extends Input{
	//출력 항목 : 주,야간 여부 / 나이 / 매수 / 종류별 가격 / 할인 적용 여부<=리스트로 할까?
	public static void printouteachTicket() {
		//Processing.CalDisc(Discount_rate, price1);
		System.out.printf("가격은 %d원입니다.", total_price);
		String amount1 = Integer.toString(amount);
		String pricestring = Integer.toString((int)total_price);
		output.add(nameofTicket);output.add(amount1);output.add(pricestring);output.add(Discountname);
		//Input.Ticketing();
	}
	public static void Totalprice() {
		//System.out.printf(" %s X %d, 가격 %d 나이 %d, *%s,\n", nameofTicket, amount, (int)price1, age, Discountname);
		
		System.out.println("================에버랜드=================");
		for(int i = 0;i<output.size();i+=5) {
			System.out.printf("%s X %s %s원 *%s\n", output.get(i+1), output.get(i+2), output.get(i+3), output.get(i+4));
			total_price += total_price;
		}
		System.out.printf("입장료 총액은 %d원 입니다\n", total_price);
		System.out.println("===============================");
	}
	
}