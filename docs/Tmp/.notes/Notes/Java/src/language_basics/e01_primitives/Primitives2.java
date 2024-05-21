package language_basics.e01_primitives;

import static java.lang.String.format;

public class Primitives2
{
	static byte default_byte;
	static int default_int;
	static short default_short;
	static long default_long;
	static float default_float;
	static double default_double;
	static char default_char;
	static String default_String_or_any_object;
	static boolean default_boolean;

	enum Size
	{SMALL, MEDIUM, LARGE, HUGE}

	public static void main(String[] args)
	{
		char cc = '西';
		System.out.println(Character.BYTES);
		/*
        The Java programming language is statically-typed  which means:
        - all variables must first be declared before they can be used. This involves stating the variable's type and
         name.
        - types are not dynamic - you can not change the type of a variable once it has
		been created.

		What is Static VS Dynamic type?
		In programming, programmer define static typing and dynamic typing with respect to the point at which the
		variable types are checked. Static typed languages are those in which type checking is done at compile-time,
		whereas dynamic typed languages are those in which type checking is done at run-time.
		- Static: Types checked before run-time
		- Dynamic: Types checked on the fly, during execution

        Strongly typed means:
        - there are restrictions between conversions between types.
		 it contains compile-time checks for type constraint violations.
         */




		/*
        byte: The byte data type is an 8-bit signed two's complement integer.
        */
		byte b_max = Byte.MAX_VALUE;
		System.out.println("b_max = " + b_max);
		System.out.println("bytePrintBits(b_max) = " + getByteBits(b_max));
		byte b_min = Byte.MIN_VALUE;
		System.out.println("b_min = " + b_min);
		System.out.println("bytePrintBits(b_min) = " + getByteBits(b_min) + "+\n");

		/*    ======== short ========
		short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768
		and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to
		save memory in large arrays, in situations where the memory savings actually matters.
		*/

		System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
		System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
		short s_1 = -1025;
		System.out.println("getShortBits(s_1) = " + getShortBits(s_1) + "\n");

		/*  ======== int ========
		 * int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value
		 * of -2^31 and a maximum value of 2^31-1.
		 */

		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("Integer.toBinaryString(Integer.MAX_VALUE) = " + Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Integer.toBinaryString(Integer.MIN_VALUE) = " + Integer.toBinaryString(Integer.MIN_VALUE));

		/*
		 * In Java SE 8 and later, you can use the int data type to represent an
		 *  unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 2^32-1. Use the Integer
		 * class to use int data type as an unsigned integer. See the section The Number Classes for more information.
		 *  Static methods like compareUnsigned, divideUnsigned etc have been added to the Integer class to support
		 * the arithmetic operations for unsigned integers.*\
		 *
		 * https://blogs.oracle.com/darcy/unsigned-integer-arithmetic-api-now-in-jdk-8
		 *
		 * there's no difference when declaring the primitive between an unsigned int/long and a signed one. The "new
		 * support" is the addition of the static methods in the Integer and Long classes, e.g. Integer.divideUnsigned
		 * . If you're not using those methods, your "unsigned" long above 2^63-1 is just a plain old long with a
		 * negative value.
		 *
		 * https://stackoverflow.com/questions/25556017/how-to-use-the-unsigned-integer-in-java-8-and-java-9
		 */

//		  ======== long ========
		/*
			 The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -2^63 and
			 a maximum value of 2^63-1. In Java SE 8 and later, you can use the long data type to represent an unsigned
			  64-bit long, which has a minimum value of 0 and a maximum value of 2^64-1. Use this data type when you
			  need a range of values wider than those provided by int. The Long class also contains methods like
			  compareUnsigned, divideUnsigned etc to support arithmetic operations for unsigned long.
		*/

//		Long integer numbers have a sufﬁx L or l
//		without l/L: java: integer number too large
		long l_num = 99999999999999L;
		System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
		System.out.println("Long.toBinaryString(Long.MAX_VALUE) = " + Long.toBinaryString(Long.MAX_VALUE));
		System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
		System.out.println("Long.toBinaryString(Long.MIN_VALUE) = " + Long.toBinaryString(Long.MIN_VALUE));

//						===============================================
//						==========	FLOATING POINT NUMBERS ============
//						===============================================

		/*
		All ﬂoating-point computations follow the IEEE 754 speciﬁcation.
		In particular, there are three special ﬂoating-point values to denote overﬂows and errors:
		* Positive inﬁnity
		* Negative inﬁnity
		* NaN (not a number)
        For example
		 */
		double inf = Double.POSITIVE_INFINITY;
		System.out.println("inf = " + inf);
		System.out.println("inf + 5 = " + inf + 5);
		System.out.println("inf - inf = " + (inf - inf)); // same as Double.NaN
		System.out.println("inf * -1 = " + inf * -1); // same as Double.NEGATIVE_INFINITY

		/*
		    ========= float =========

		    float: The float data type is a single-precision 32-bit IEEE 754 floating point.
		     IEEE 754 explanation: https://en.wikipedia.org/wiki/Single-precision_floating-point_format

		    Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types,
			Formats, and Values
		    section of the Java Language Specification. As with the recommendations for byte and short, use a float
		    (instead of double) if you need to save memory in large arrays of floating point numbers. This data type
		    should never be used for precise values, such as currency. For that, you will need to use the java.math
		    .BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the
		    Java platform.

			Use float values only when you work with a library that requires them, or when you need to store a very
			large number of them.
		 */
		System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
		System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);

//		Numbers of type float have a sufﬁx F or f (for example, 3.14F).
//		Floating-point numbers without an F sufﬁx (such as 3.14) are always considered to be of type double.

		// without F:
//		                java: incompatible types: possible lossy conversion from double to float
		float f_value = 3.14F;
//		System.out.println("(d_value == f_value) = " + (d_value == f_value));

		
		/*
			================= double =======================
			The double data type is a double-precision 64-bit IEEE 754 floating point.

			For decimal values, this data type is generally the default choice. As mentioned above, this data type
			should never be used for precise values, such as currency.
		 */

		// Why is it not the best idea to use it for precision format
//		There is no precise binary representation of the fraction 1/10, just as there is no accurate representation of
//		the fraction 1/3 in the decimal system
		System.out.println(2.0 - 1.1);


		// ### The char type
		// char: In Java, the char type describes a code unit in the UTF-16 encoding.
		// character. Values of type char can be expressed as hexadecimal values: minimum value of '\u0000' (or 0) and
		// a maximum value of '\uffff' (or 65,535 inclusive).
		char c = '\u03C0';
		System.out.println("c = " + c);

		/*In the Unicode standard, code points are written in hexadecimal and preﬁxed with U+, such as U+0041 for
		the code point of the Latin letter A. Unicode has code points that are grouped into 17 code planes.
		 The ﬁrst code plane, called the basic multilingual
		 plane, consists of the “classic” Unicode characters with code points U+0000 to U+FFFF.
		 Sixteen additional planes, with code points U+10000 to U+10FFFF, hold the supplementary characters

		 The UTF-16 encoding represents all Unicode code points in a variable-length code.
		  The characters in the basic multilingual plane are represented as 16-bit values, called code units

		  The supplementary characters are encoded as consecutive pairs of code units. Each of the values in such an
		  encoding pair falls into a range of 2048 unused values of the basic multilingual plane, called the
		  surrogates area (U+D800 to U+DBFF for the ﬁrst code unit, U+DC00 to U+DFFF for the second code unit). This
		  is rather clever, because you can immediately tell whether a code unit encodes a single character or it is
		  the ﬁrst or second part of a supplementary character. For example, (the mathematical symbol for the set of
		  octonions, http://math.ucr.edu/home/baez/octonions) has code point U+1D546 and is encoded by the two code
		  units U+D835 and U+DD46. (See https://tools.ietf.org/html/rfc2781 for a description of the encoding
		  algorithm.)

		 */

		// ====================== Default Values ===========================
		// Those are default values of global fields:
		System.out.println("default_byte = " + default_byte);
		System.out.println("default_short = " + default_short);
		System.out.println("default_int = " + default_int);
		System.out.println("default_long = " + default_long);
		System.out.println("default_float = " + default_float);
		System.out.println("default_double = " + default_double);
		System.out.println("default_char = " + default_char);
		System.out.println("default_String_or_any_object = " + default_String_or_any_object);
		System.out.println("default_boolean = " + default_boolean);

		// Local variables are slightly different; the compiler never assigns a default value to an uninitialized 
		// local variable. If you cannot initialize your local variable where it is declared, make sure to assign it a
		// value before you attempt to use it. Accessing an uninitialized local variable will result in a compile-time
		// error.

		int local_int;
		// System.out.println("local_int = " + local_int); // java: variable local_int might not have been initialized


		// ================== Literals =============================================================================
		/*
			You may have noticed that the new keyword isn't used when initializing a variable of a primitive type.
			Primitive types are special data types built into the language; they are not objects created from a class.
			 A literal is the source code representation of a fixed value; literals are represented directly in your
			 code without requiring computation. As shown below, it's possible to assign a literal to a variable of a
			 primitive type:
		 */
		int literal_ten = 10;

		 /*
		    In Java there are three ways of representing integer literal:
		  */

		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		int binVal = 0b11010;

		/*
			Floating-Point Literals
			A floating-point literal is of type float if it ends with the letter F or f; otherwise its type is double
			and it can optionally end with the letter D or d.

			The floating point types (float and double) can also be expressed using EnhancedSwitch or e (for scientific notation),
			F or f (32-bit float literal) and D or d (64-bit double literal; this is the default and by convention is
			omitted).
		 */

		double d_1 = 123.4;
		// d_2 = 1.234 * 10^2
		double d_2 = 1.234E2;
		if (d_1 == d_2)
			System.out.println("d1 equals d2");
		float f_1 = 123.4f;



		// =================== Declaring Variables ====================
		/*
			In Java, every variable has a type. You declare a variable by placing the type ﬁrst, followed by
			 the name of the variable. Here are some examples:
		 */
		int age;
		double height;
		boolean is_task_done;

		/*After you declare a variable, you must explicitly initialize it by means
		 of an assignment statement—you can never use the value of an uninitialized variable:
		  		System.out.println(height);
		  		Leads to compilation error:  java: variable height might not have been initialized

		In Java, it is considered good style to declare variables as closely as possible to the point where they are
		ﬁrst used.

		Starting with Java 10, you do not need to declare the types of local variables if
		 they can be inferred from the initial value. Simply use the keyword var instead of the type:

		 */

		var temperature = 36.6;
		System.out.println("tester(temperature) = " + tester(temperature));

		// ===================== Initializing Varialbies

		// ====================== Constants ===========================

		/*
			In Java, you use the keyword final to denote a constant.
			The keyword final indicates that you can assign to the variable once, and then its value is set
			once and for all. It is customary to name constants in all uppercase.
		 */
		final double PI = 3.14;
//		PI += 1; not possible!

		/*
		It is probably more common in Java to create a constant so it’s available to multiple methods inside a single
		class. These are usually called class constants. Set up a class constant with the keywords 'static final'. Here
		is an example of using a class constant:
		 */
		new Object()
		{
			public static final double CM_PER_INCH = 2.54;

			void printCentimeters(double inch)
			{
				System.out.println(inch * CM_PER_INCH);
			}
		}.printCentimeters(5);


//		 =============== Enumerated Types =================
		/*
			Sometimes, a variable should only hold a restricted set of values. For example, you may sell clothes or
			pizza in four sizes: small, medium, large, and extra large. Of course, you could encode these sizes as
			integers 1, 2, 3, 4 or characters S, M, L, and X. But that is an error-prone setup. It is too easy for a
			variable to hold a wrong value (such as 0 or m).
			You can deﬁne your own enumerated type whenever such a situation arises. An enumerated type has a ﬁnite
			number of named values. For example:

			enum Size {SMALL, MEDIUM, LARGE, HUGE}
		 */


		Size size = Size.HUGE;
		System.out.println("size = " + size);

	}


	public static String getByteBits(byte b)
	{
//        %8s - minimal String width = 8
//        255 = 0b11111111
		return String.format("%8s",
				Integer.toBinaryString(b & 255))
				.replace(' ', '0');
	}

	public static String getByteBits2(byte b)
	{
//        %8s - minimal String width = 8
//        255 = 0b11111111
		return String.format("%8s",
				Integer.toBinaryString(b & 255))
				.replace(' ', '0');
	}

	public static String getShortBits(short s_1)
	{
		return String.format("%16s",
				Integer.toBinaryString(
						s_1 & (Short.MAX_VALUE - Short.MIN_VALUE))).replace(' ', '0'
		);
	}

	public static <T> String tester(T ToTest)
	{

		if (ToTest instanceof Integer) return ("Integer");
		else if (ToTest instanceof Double) return ("Double");
		else if (ToTest instanceof Float) return ("Float");
		else if (ToTest instanceof String) return ("String");
		else if (ToTest.getClass().isArray()) return ("Array");
		else return ("Unsure");
	}


}
