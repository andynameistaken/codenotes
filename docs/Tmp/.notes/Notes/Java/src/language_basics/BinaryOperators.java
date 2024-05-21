package language_basics;

@SuppressWarnings("Duplicates")


public class BinaryOperators {
    /*Source: https://www.programiz.com/java-programming/bitwise-operators*/
    public static void main(String[] args) {

        int a = 0b111;
        int b = 0b110;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Bitwise OR");
        /*
    Bitwise OR
    Bitwise OR is a binary operator (operates on two operands). It's denoted by |.

    The | operator compares corresponding bits of two operands. If either of the bits is 1, it gives 1.
    If not, it gives 0. For example,

    12 = 00001100 (In Binary)
    25 = 00011001 (In Binary)

    Bitwise OR Operation of 12 and 25
            00001100
          | 00011001
            ________
            00011101  = 29 (In decimal)
  */
        int number1 = 12, number2 = 25, result;

        result = number1 | number2;
        System.out.println("12 | 25 " + result);

        System.out.println("Bitwise AND");
        /*
            Bitwise AND
            Bitwise AND is a binary operator (operates on two operands). It's denoted by &.

            The & operator compares corresponding bits of two operands. If both bits are 1, it gives 1. 
            :qIf either of the bits is not 1, it gives 0. For example,

            12 = 00001100 (In Binary)
            25 = 00011001 (In Binary)

            Bit Operation of 12 and 25
              00001100
            & 00011001
              ________
              00001000  = 8 (In decimal)
         */
        int number3 = 12, number4 = 25, result2;

        result2 = number3 & number4;
        System.out.println(result2);

        int x = 1;
        System.out.println("Integer.toBinaryString(1)): " + Integer.toBinaryString(x));
        x <<= 3;
        System.out.println("Integer.toBinaryString(1 << 3 )): " + Integer.toBinaryString(x));
        x >>= 3;
        System.out.println("Integer.toBinaryString(last >> 3)): " + Integer.toBinaryString(x));

        System.out.println("Bitwise Complement: ~");
        /*
        Bitwise Complement
        Bitwise complement is an unary operator (works on only one operand). It is denoted by ~.
        The ~ operator inverts the bit pattern. It makes every 0 to 1, and every 1 to 0.
        35 = 00100011 (In Binary)

        Bitwise complement Operation of 35
        ~ 00100011
        ________
        11011100  = 220 (In decimal)
        */

        int number5 = 35;
        int result3 = ~number5;
        System.out.println("35 in binary: " + Integer.toBinaryString(number5));
        System.out.println("Result of ~35 = " + result3);
        /*
        Why are we getting output -36 instead of 220?
        It's because the compiler is showing 2's complement of that number; negative notation of the binary number.

        For any integer n, 2's complement of n will be -(n+1).

         Decimal         Binary                      2's complement
        ---------       ---------          ---------------------------------------
        0             00000000          -(11111111+1) = -00000000 = -0(decimal)
        1             00000001          -(11111110+1) = -11111111 = -256(decimal)
        12            00001100          -(11110011+1) = -11110100 = -244(decimal)
        220           11011100          -(00100011+1) = -00100100 = -36(decimal)

        --my addition:
        So, prescription for negative number (starting from positive 7 for example <in bin: 111>) is:
            invert all bits
                ~(...000111) = ...111000
            add 1
                000 + 1 = ...111000 + 1 = ...111001
            result = -7
        Note: Overflow is ignored while computing 2's complement.
        */
        int seven = 7;
        System.out.println("Integer.toBinaryString(seven) = " + Integer.toBinaryString(seven));
        System.out.println("Integer.toBinaryString((~seven)) = " + Integer.toBinaryString((~seven)));
        int twocomplement = ~seven + 1;
        System.out.println("twocomplement = " + twocomplement);
        System.out.println("Integer.toBinaryString(twocomplement) = " + Integer.toBinaryString(twocomplement));

        /*
            BITWISE XOR

            Bitwise XOR is a binary operator (operates on two operands). It's denoted by ^.

            The ^ operator compares corresponding bits of two operands.
            fIf corresponding bits are different, it gives 1. If corresponding bits are same, it gives 0. For example,

            12 = 00001100 (In Binary)
            25 = 00011001 (In Binary)

            Bitwise XOR Operation of 12 and 25
              00001100
            ^ 00011001
              ________
              00010101  = 21 (In decimal)
        */

        /*
        SIGNED LEFT SHIFT
            The left shift operator << shifts a bit pattern to the left by certain number of specified bits, and zero
            bits are shifted into the low-order positions
        */
        System.out.println("Signed Left Shift Example '<<'");
        int leftSigned = 0b111000111;
        System.out.println("Integer.toBinaryString(leftSigned) = " + Integer.toBinaryString(leftSigned));
        leftSigned <<= 1;
        System.out.println("leftSigned <<= 1;");
        System.out.println("Integer.toBinaryString(leftSigned) = " + Integer.toBinaryString(leftSigned));
        leftSigned <<= 1;
        System.out.println("leftSigned <<= 1;");
        System.out.println("Integer.toBinaryString(leftSigned) = " + Integer.toBinaryString(leftSigned));

        int oneLeft = 1;
        System.out.println("oneLeft = " + oneLeft);
        oneLeft <<= 1;
        System.out.println("oneLeft <<= 1;");
        System.out.println("oneLeft = " + oneLeft);
        oneLeft <<= 1;
        System.out.println("oneLeft <<= 1;");
        System.out.println("oneLeft = " + oneLeft);

        /*
        SIGNED RIGHT SHIFT
            The right shift operator >> shifts a bit pattern to the right by certain number of specified bits.
        */
        System.out.println("\nSigned Right Shift\n");
        int twoRight  = 2;
        System.out.println("twoRight = " + twoRight);
        System.out.println("Integer.toBinaryString(twoRight) = " + Integer.toBinaryString(twoRight));
        twoRight >>= 1;
        System.out.println("twoRight >>= 1;");
        System.out.println("twoRight = " + twoRight);
        System.out.println("Integer.toBinaryString(twoRight) = " + Integer.toBinaryString(twoRight));
        twoRight >>= 1;
        System.out.println("twoRight >>= 1;");
        System.out.println("twoRight = " + twoRight);
        System.out.println("Integer.toBinaryString(twoRight) = " + Integer.toBinaryString(twoRight));
        twoRight >>= 1;
        System.out.println("twoRight >>= 1;");
        System.out.println("twoRight = " + twoRight);
        System.out.println("Integer.toBinaryString(twoRight) = " + Integer.toBinaryString(twoRight));

        int minusThousand = -1000;
        System.out.println("Integer.toBinaryString(minusThousand) = " + Integer.toBinaryString(minusThousand));
        minusThousand >>= 1;
        System.out.println("minusThousand >>= 1");
        System.out.println("minusThousand = " + minusThousand);
        System.out.println("Integer.toBinaryString(minusThousand) = " + Integer.toBinaryString(minusThousand));
        minusThousand >>= 1;
        System.out.println("minusThousand >>= 1");
        System.out.println("minusThousand = " + minusThousand);
        System.out.println("Integer.toBinaryString(minusThousand) = " + Integer.toBinaryString(minusThousand));

        /*UNSIGNED RIGHT SHIFT >>>

        >> is arithmetic shift right, >>> is logical shift right.
        In an arithmetic shift, the sign bit is extended to preserve the signedness of the number.

        For example: -2 represented in 8 bits would be 11111110 (because the most significant bit has negative weight).
        Shifting it right one bit using arithmetic shift would give you 11111111, or -1.
        Logical right shift, however, does not care that the value could possibly represent a signed number;
        it simply moves everything to the right and fills in from the left with 0s.
        Shifting our -2 right one bit using logical shift would give 0111111
        */
        System.out.println("UNSIGNED RIGHT SHIFT '>>>'");
        int unsignedRight = 0b111000111;
        System.out.println("int unsignedRight = 0b111000111");
        System.out.println("unsignedRight = " + unsignedRight);
        unsignedRight = unsignedRight >>> 1;
        System.out.println("unsignedRight = unsignedRight >>> 1;");
        System.out.println("Integer.toBinaryString(unsignedRight) = " + Integer.toBinaryString(unsignedRight));
        System.out.println("unsignedRight = " + unsignedRight);

        System.out.println("Better example of >> and >>>");
        int number = -8;
        System.out.println("number = " + number);
        System.out.println("Integer.toBinaryString(number) = \n" + Integer.toBinaryString(number));
        System.out.println("Integer.toBinaryString(number >> 1) = \n" + Integer.toBinaryString(number >> 1));
        System.out.println("(number >> 1) = " + (number >> 1));
        System.out.println();
        System.out.println("Integer.toBinaryString(number >>> 1) = \n" + Integer.toBinaryString(number >>> 1));
        System.out.println("(number >>> 1 = " + (number >>> 1));

        System.out.println("So how it looks in bits?");
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(number >> 1));
        System.out.println(Integer.toBinaryString(number >>> 1));
    }
}

