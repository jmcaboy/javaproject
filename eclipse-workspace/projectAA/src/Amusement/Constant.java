package Amusement;

import java.util.Calendar;
import java.util.Scanner;

public class Constant {
	static Scanner scanner = new Scanner(System.in);
	//요금 
	//연령대별 대인/청소년/소인/경로
	//시간대별로는 주간/야간 => 총 8종류
	static int Day_Night;
	static int price = 0;
	static int Day_Adult = 56000; static int Day_teen =  47000; static int Day_child = 44000; static int Day_Grand = 44000;
	static int Night_Adult = 56000; static int Night_teen =  47000; static int Night_child = 44000; static int Night_Grand = 44000;
	static String nameofTicket = "";
	//연령대 구분
	static int age;
	int Adult; int Teen; int Child; int Grand;
	 static Calendar cal = Calendar.getInstance();
     static int currentYear  = cal.get(Calendar.YEAR);
     

	//할인율
	//static double Disabled_Dis = 0.4; static double Country_Dis = 0.5; static double Sib_Dis = 0.2;	static double Preg_Dis = 0.15;
	static double Discount_rate;
	
	static int will;
	
}
