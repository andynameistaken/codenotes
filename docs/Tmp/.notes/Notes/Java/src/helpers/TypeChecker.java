package helpers;

public class TypeChecker
{
	public static <T> String typeCheck(T ToTest)
	{
		
		if (ToTest instanceof Integer) return ("Integer");
		else if (ToTest instanceof Double) return ("Double");
		else if (ToTest instanceof Float) return ("Float");
		else if (ToTest instanceof String) return ("String");
		else if (ToTest.getClass().isArray()) return ("Array");
		else return ("Unsure");
	}
}
