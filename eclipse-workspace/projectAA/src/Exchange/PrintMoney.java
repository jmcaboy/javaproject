package Exchange;

import java.io.IOException;

public class PrintMoney extends moneyExchange {
	public static void printout(int b) throws IOException {
		System.out.printf("%s 환전 결과 : %.2f%s\n",country[b-1], result1, country[b-1]); 
		System.out.printf("%s 줄 돈 : %d%s\n",country[b-1],(int)(result1),country[b-1]);
		if(b == 3) {
			for(int i = 0;i<kowon.length;i++) {
				System.out.printf("%d - %d장 ",kowon[i],results.get(i));
			}
		} else {
			for(int i = 0;i<dollars.length;i++) {
				System.out.printf("%d - %d장 ",dollars[i],results.get(i));
			}
		}
		
		System.out.println();
		
		
		System.out.printf("거스름돈 : %d원\n",(int)(change/10)*10);//내림
		for(int i = 0;i<kowon.length;i++) {
			System.out.printf("%d원 거스름돈 : %d장 ",kowon[i],changes.get(i));
		}
		System.out.println();
		fileOut1.dataWrite1(output);
		results.clear();changes.clear();
		fw.close();
	
	}
}
