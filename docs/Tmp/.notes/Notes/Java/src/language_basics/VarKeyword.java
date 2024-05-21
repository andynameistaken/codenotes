package language_basics;

import helpers.OutToFile;
import static helpers.TypeChecker.*;

public class VarKeyword
{
	public static void main(String[] args)
	{
		new OutToFile("var_out");
		// var can be used to declare a local variable
		var value_1 = 1;
		// This method inside will check type of variable, explaining it is currently out of scope
		System.out.println("typeCheck(value_1) = " + typeCheck(value_1));
		var value_2 = 5f;
		System.out.println("typeCheck(value_2) = " + typeCheck(value_2));
	}
}
