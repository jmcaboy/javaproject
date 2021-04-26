package Software;

import java.util.Scanner;

public class k32if {

	public static void main(String[] args) {
		int [] k32iLMD ={31,28,31,30,31,30,31,31,30,31,30,31}; 
		int index = 1;
		for(int i = 1;i<13;i++) {
			System.out.printf("\n\n		%d월\n", i);
			for(int j = 1;j<=k32iLMD[i-1];j++) {
				System.out.printf("%3d",j);
				index++;
				if(index%7 == 0) {
					System.out.println();
				}
			}
		}
		
	}
}