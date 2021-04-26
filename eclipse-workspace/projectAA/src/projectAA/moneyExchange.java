package projectAA;


public class moneyExchange extends InputMoney {
	
	public static void exdol(int a, int b) {
		output.add(date);output.add(country[b-1]);
		output.add(Integer.toString(a));
		//result = a/ex_rate[b-1];
		output.add(Double.toString(result));
		result1 = a/ex_rate[b-1];
		if(b == 3) {//엔화일 때
			result = result*100;
			result1 = result1*100;
			for(int i = 0;i<kowon.length;i++) {
				results.add((int) result/kowon[i]);
				result = result%kowon[i];
			}
		} else {
			for(int i = 0;i<dollars.length;i++) {
				results.add((int) result/dollars[i]);
				result = result%dollars[i];
			}
		}
	
		
		
	}
	
	public static void change(int a, int b) {
		change = a%ex_rate[b-1];
		output.add(Double.toString(change));
		change1 = (int)((change)/10)*10;
		for(int i = 0;i<kowon.length;i++) {
			changes.add(change1/kowon[i]);
			change1 = change1%kowon[i];
		}
		/*잔돈		
		System.out.println("원래 거스름돈 :" + (int)(change) +"원" );//원래 가격
		System.out.println("반올림 거스름돈 :" + (int)((change)+5)/10*10 +"원" );//반올림 함
		System.out.println("올림 거스름돈 :" + (int)((change)+9)/10*10 +"원" );//올림
		*/
		//기준은 내림으로 함
		
	}
	
	
}
