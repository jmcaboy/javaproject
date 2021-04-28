package Amusement;


public class Input extends Constant {
	//발권여부 메소드
	public static int Ticketing() {
		System.out.println("계속 발권하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("0. 종료");
		
		int will = scanner.nextInt();
		if(will == 0) {
			System.out.println("티켓 발권을 종료합니다. 갑사합니다");
		}
		return will;
	}
	
	//주간 야간 선택 메소드
	public static int Day_Night() {
		System.out.printf("권종을 선택하세요");
		int Day_Night = scanner.nextInt();
		switch(Day_Night) {
		case 1:
			Day_Night = 1;
			break;
		case 2:
			Day_Night = 2;
			break;
		default:
			break;
		}
		return Day_Night;
	}
	//나이 입력 메소드
	public static String InputAge() {
		System.out.printf("주민번호를 입력하세요");
		String ID = scanner.next();
		return ID;
	}
	
	//매수 입력 메소드
	public static int amountTicket() {
		System.out.println("몇개를 주문하시겠습니까?");
		int amount = scanner.nextInt();
		return amount;
	}
	
	//할인 여부 입력 메소드
	public static double Disc() {
		System.out.println("우대사항을 선택하세요");
		System.out.println("1. 장애인");
		System.out.println("2. 국가유공자");
		System.out.println("3. 다자녀");
		System.out.println("4. 임산부");
		System.out.println("0. 없음");
		double Discount_rate = 0;
		String kindofDiscount = "";
		int Disc_abled = scanner.nextInt();
		switch(Disc_abled) {
		case 1:
			Discount_rate = 0.4;
			kindofDiscount = "장애인";
			break;
		case 2:
			Discount_rate = 0.5;
			kindofDiscount = "국가유공자";
			break;
		case 3:
			Discount_rate = 0.2;
			kindofDiscount = "다자녀";
			break;	
		case 4:
			Discount_rate = 0.15;
			kindofDiscount = "임산부";
			break;
		case 0:
			Discount_rate = 1;
			kindofDiscount = "없음";
			break;
		default:
			break;
		
		}
		System.out.printf("Discount_rate, %f, kind of Discount, %s\n", Discount_rate, kindofDiscount);
		
		return Discount_rate;
	}
	
}
