package projectAA;

public class InputMoney extends ConstValue {
	
	public void Menu() {		
			System.out.println("바꿀 돈을 입력하세요");
			a = scanner.nextInt();
			System.out.printf("받은 원화 : %d\n", a);			
			System.out.print("환전할 종류 선택(1:USD, 2:EUR, 3:JPY)?");
			fileOut fo = new fileOut();
			try {
				b = scanner.nextInt();								
				moneyExchange.exdol(a,b);	
				moneyExchange.change(a,b);	
				PrintMoney.printout(b);	
			} catch (Exception e){
				System.out.println("잘못된 입력입니다");
				e.printStackTrace();
				((fileOut) fo).fileClose();
			}
		
		
	}
}
