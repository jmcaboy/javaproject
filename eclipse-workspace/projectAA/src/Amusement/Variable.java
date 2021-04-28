package Amusement;

public class Variable extends Constant{
	static int will;
	static String ID = Input.InputAge();
	static int age = Processing.CalAge(ID, currentYear);
	static double Discount_rate = Input.Disc();
	static int price = Processing.Choice_Ticket(age);
}
