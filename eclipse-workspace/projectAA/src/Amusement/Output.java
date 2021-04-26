package Amusement;

public class Output extends Input{
	//출력 항목 : 주,야간 여부 / 나이 / 매수 / 종류별 가격 / 할인 적용 여부<=리스트로 할까?
	public static void eachprice(Double Discount_rate,int price) {
		//Processing.CalDisc(Discount_rate, price);
		System.out.printf("가격은 %d원입니다.", price);
		//Input.Ticketing();
	}
	public static void printoutTicket() {
		System.out.printf("티켓 종류 : %s, 나이 %d\n", nameofTicket, age);
	}
	
}
