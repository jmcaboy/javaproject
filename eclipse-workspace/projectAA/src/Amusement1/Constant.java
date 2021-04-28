package Amusement1;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
	static int Night_Adult = 46000; static int Night_teen =  40000; static int Night_child = 37000; static int Night_Grand = 37000;
	static String nameofTicket = "";
	static String Discountname = "";
	static double price1;
	static int amount;
	static int amountprice;
	static int total_price = 0;
	//연령대 구분
	static int age;
	//날짜와 형식 지정
	static Calendar cal = Calendar.getInstance();
    static int currentYear  = cal.get(Calendar.YEAR);
    static SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    static String date = df.format(cal.getTime());
    //결과 출력 저장용
    static ArrayList<String>output = new ArrayList<String>();
  
	//할인율
	static double Discount_rate;
	
	static int will;
	//파일
	static FileWriter fw;	//파일에 쓰기 위해 만들었음
	static boolean isFileExist;		//파일이 있는지 없는지 판단
	static File file = new File("amusement.csv");
}
