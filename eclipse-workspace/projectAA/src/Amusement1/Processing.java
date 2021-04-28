package Amusement1;

public class Processing extends Input{
	//주민번호로 나이 처리를 하는 메소드
	public static int CalAge(String ID, int currentYear) {
		age = Integer.parseInt(ID.substring(0,2));
		if ( ID.charAt(6) == '3'|| ID.charAt(6) == '4') {
			age = currentYear-(2000+age)+1;
		} else {
			age = currentYear-(1900+age)+1;
		}
		return age;
	}
	//처리한 주민번호와 주, 야간 선택을 통해 금액 선택 메소드
	public static int Choice_Ticket(int age) {
		if (age >= 19 && age < 65) {
			switch(Day_Night) {
			case 1:
				price = Day_Adult;
				nameofTicket = "주간권 대인";
				break;
			case 2:
				price = Night_Adult;
				nameofTicket = "야간권 대인";
				break;
			}
		} else if (age >= 13 && age < 19) {
			switch(Day_Night) {
			case 1:
				price = Day_teen;
				nameofTicket = "주간권 청소년";
				break;
			case 2:
				price = Night_teen;
				nameofTicket = "야간권 청소년";
				break;
			}
		} else if(age >= 3 && age <13) {
			switch(Day_Night) {
			case 1:
				price = Day_child;
				nameofTicket = "주간권 소인";
				break;
			case 2:
				price = Night_child;
				nameofTicket = "야간권 소인";
				break;
			}
		} else if(age >= 65) {
			switch(Day_Night) {
			case 1:
				price = Day_Grand;
				nameofTicket = "주간권 경로";
				break;
			case 2:
				price = Night_Grand;
				nameofTicket = "야간권 경로";
				break;
			}
		} else if(age<3) {
			price = 0;
			nameofTicket = "영유아";
		}
		return price;
	}
	//할인 여부를 입력받아 할인 가격 계산 메소드
	public static double CalDisc(double Discount_rate, int price) {
		price1 = (1-Discount_rate)*price;
		return price1;
	}
	//수량*할인가
	public static int CalTicket(double price1, int amount) {
		amountprice = (int)price1*amount;
		return amountprice;
	}
}