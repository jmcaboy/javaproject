package projectAA;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ConstValue {
	static Scanner scanner = new Scanner(System.in);
	static int a, b;
	static double result, result1, change;
	static int change1;
	final static int [] dollars = {100,50,20,10,5,2,1};
	final static int [] kowon = {1000,500,100,50,10};
	final static double [] ex_rate = {1133.40, 1349.23, 1019.95};
	final static String [] country = {"USD","EUR","JPY"};	
	static ArrayList<Integer>results = new ArrayList<Integer>();
	static ArrayList<Integer>changes = new ArrayList<Integer>();
	static String [] output_name = {"날짜", "환전대상", "금액", "환전결과", "거스름돈"};
	static ArrayList<String>output = new ArrayList<String>();
	static Calendar cal = Calendar.getInstance();
	static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static String date = df.format(cal.getTime());
	static FileWriter fw;
	static boolean isFileExist;
}
