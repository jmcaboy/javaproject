package Exchange;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ConstValue {
	static Scanner scanner = new Scanner(System.in);
	static int a, b;	//입력받을 값
	static double result, result1, change;	//계산 결과값
	static int change1;		//거스름돈 소수점 자른 값
	final static int [] dollars = {100,50,20,10,5,2,1};	//달러(유로)로 내줄 값
	final static int [] kowon = {1000,500,100,50,10};	//원화(엔화)로 내줄 값
	final static double [] ex_rate = {1133.40, 1349.23, 1019.95};	//환율
	final static String [] country = {"USD","EUR","JPY"};	//입력받을 환전국가
	static ArrayList<Integer>results = new ArrayList<Integer>();	//환전 결과 저장용
	static ArrayList<Integer>changes = new ArrayList<Integer>();	//거스름돈 결과 저장용
	static ArrayList<String>output = new ArrayList<String>();		//파일에 넣을 결과 저장용
	static Calendar cal = Calendar.getInstance();	//날짜 출력
	static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//날짜 출력 형태 지정
	static String date = df.format(cal.getTime());	//날짜 출력 형태로 입력한 문자열
	static FileWriter fw;	//파일에 쓰기 위해 만들었음
	static boolean isFileExist;		//파일이 있는지 없는지 판단
}
