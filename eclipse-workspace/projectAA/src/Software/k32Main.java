package Software;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class k32Main {
	static int k32iStatic;//������ �������� ����
	//void�� �޼ҵ� ����
	public static void add(int k32i) {
		k32iStatic++;
		k32i++;
		System.out.printf("add�޼ҵ忡�� -> k32iStatic=[%d]\n", k32iStatic);
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n",k32i);
	}
	//int�� �޼ҵ� ����
	public static int add2(int k32i) {
		k32iStatic++;
		k32i++;
		System.out.printf("add�޼ҵ忡�� -> k32iStatic=[%d]\n", k32iStatic);
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n",k32i);
		return k32i;
	}
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		int k32iMain;
		
		k32iMain = 1;
		k32iStatic=1;
		System.out.printf("******************************\n", args);
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k32iStatic=[%d]\n", k32iStatic);
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k32iMain=[%d]\n",k32iMain);
		System.out.printf("******************************\n", args);
		
		add(k32iMain);
		
		System.out.printf("******************************\n", args);
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k32iStatic=[%d]\n", k32iStatic);
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> k32iMain=[%d]\n",k32iMain);
		System.out.printf("******************************\n", args);
		
		k32iMain=add2(k32iMain);
		
		System.out.printf("******************************\n", args);
		System.out.printf("�޼ҵ� add2 ȣ�� �� ���ο��� -> k32iStatic=[%d]\n", k32iStatic);
		System.out.printf("�޼ҵ� add2 ȣ�� �� ���ο��� -> k32iMain=[%d]\n",k32iMain);
		System.out.printf("******************************\n", args);
	}
}