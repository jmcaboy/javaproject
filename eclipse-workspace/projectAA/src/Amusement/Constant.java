package Amusement;

import java.util.Calendar;
import java.util.Scanner;

public class Constant {
	static Scanner scanner = new Scanner(System.in);
	//요금 
	//연령대별 대인/청소년/소인/경로
	//시간대별로는 주간/야간 => 총 8종류
	//static int price = 0;
	static int Day_Adult = 56000; static int Day_teen =  47000; static int Day_child = 44000; static int Day_Grand = 44000;
	static int Night_Adult = 56000; static int Night_teen =  47000; static int Night_child = 44000; static int Night_Grand = 44000;
 
	//연령대 구분
	 static Calendar cal = Calendar.getInstance();
     static int currentYear  = cal.get(Calendar.YEAR);

	
}
