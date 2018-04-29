package Lab3;

public class DataTypesTester {
    
    public static void testInt(int a_, int b_) {
        
        int a = a_, b = b_, c;
        System.out.println("=====Type int test=====");
        
        System.out.println("\n***** Arithmetical Operators *****");
        
        //addition
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        
        //subtraction
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        
        //multiplication
        System.out.printf("%d * %d = %d\n", a, b, a*b);
         
        //division
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        
        //modulus
        System.out.printf("%d %% %d = %d\n", a, b, a%b);
        
        //c = a / 0; --> Arithmetical Exception
        //c = a % 0 --> Arithmetical Exception

        //unary minus
        a= a_;
        System.out.printf("-%d = %d\n", a, -a);
        
         //unary plus
        c= a_;
        System.out.printf("+%d = %d\n", a, +a);
        
        //prefix increment
        a = a_;
        System.out.printf("++%d = %d\n", a, ++a);
        
         //postfix increment
        a = a_;
        System.out.printf("%d++ = %d\n", a, a++);
        
        //prefix decrement
        a = a_;
        System.out.printf("--%d = %d\n", a, --a);
        
         //postfix decrement
        a = a_;
        System.out.printf("%d-- = %d\n", a, a--);
        
        System.out.println("\n***** Bitwise Operators *****");
        
        // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, a & b);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, a | b);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(a | b));
        
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, a ^ b);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(a ^ b));
        
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, ~a);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(~a));
        
        // left shift
        System.out.printf("%d << 1 = %d\n", a, a << 1);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a << 1));
        
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, a >> 1);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >> 1));
        a = -a_;
        
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >> 1));
        a = a_;
        
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >>> 1));
        a = -a_;
        
        // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, a >>> 1);
        System.out.println("in binary form:");

        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >>> 1));
        System.out.println("\n***** Assignment Operators *****");
        a = a_;
        c = a + b;
        System.out.printf("%d+= %d --> c = %d\n", c, a, c += a);
        System.out.printf("-= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("*= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("/= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%%= %d --> c = %d\n", c, a, c %= a);
        
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (int)bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = (int)sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = (int)ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
        System.out.println("========================================\n");
        

    }
    

    public static void testChar(char a_,char b_) { 
        
        char a = a_, b = b_, c;
        System.out.println("=====Type char test====");
        System.out.println("\n***** Arithmetical Operators *****");
        
        //addition
        System.out.printf("%c + %c = %c\n", a, b, (char)(a+b));
        
        //subtraction
        System.out.printf("%c - %c = %c\n", a, b, (char)(a-b));
        
        //multiplication
        System.out.printf("%c * %c = %c\n", a, b, (char)(a*b));
         
        //division
        System.out.printf("%c / %c = %c\n", a, b, (char)(a/b));
        
        //modulus
        System.out.printf("%c %% %c = %c\n", a, b, (char)(a%b));
        
        a = a_;
        
        //unary minus
        System.out.printf("-%c = %c\n", a, (char)-a);
        
        //unary plus
        System.out.printf("+%c = %c\n", a, (char)+a);
        
        //prefix increment
        a = a_;
        System.out.printf("++%c = %c\n", a, (char)++a);
        
         //postfix increment
        a = a_;
        System.out.printf("%c++ = %c\n", a, (char)a++);
        
        //prefix decrement
        a = a_;
        System.out.printf("--%c = %c\n", a, (char)--a);
        
         //postfix decrement
        a = a_;
        System.out.printf("%c-- = %c\n", a, (char)a--);
        a=a_;
        System.out.println("\n***** Bitwise Operators *****");
        
        // bitwise AND
        System.out.printf("%c & %c = %c\n", a, b, (char)(a & b));
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((char)(a & b)));
        
        // bitwise OR
        System.out.printf("%c | %c = %c\n", a, b, (char)(a | b));
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((char)(a | b)));
        
        // bitwise XOR
        System.out.printf("%c ^ %c = %c\n", a, b, (char)(a ^ b));
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((char)(a ^ b)));
        
        // bitwise unary compliment
        System.out.printf("~%c = %c\n", a, (char)~a);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((char)~a));
        
        // left shift
        System.out.printf("%c << 1 = %c\n", a, (char)(a << 1));
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((char)(a << 1)));
        
        // right shift
        System.out.printf("%c >> 1 = %c\n", a, (char)(a >> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((char)(a >> 1)));
        a = (char)-a_;
        
        // right shift
        System.out.printf("%c >> 1 = %c\n", a, (char)(a >> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((char)(a >> 1)));
        a = a_;
        
        // zero fill right shift
        System.out.printf("%c >>> 1 = %c\n", a, (char)(a >>> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((char)(a >>> 1)));
        a = (char)-a_;
        
        // zero fill right shift
        System.out.printf("%c >>> 1 = %c\n", a, (char)(a >>> 1));
        System.out.println("in binary form:");

        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((char)(a >>> 1)));
        System.out.println("\n***** Assignment Operators *****");
        c = (char)(a + b);
        System.out.printf("%c+= %c --> c = %c\n", c, a, (char)(c += a));
        System.out.printf("-= %c --> c = %c\n", c, a, (char)(c -= a));
        System.out.printf("*= %c --> c = %c\n", c, a, (char)(c *= a));

        System.out.println("\n***** Relational Operators *****");
        
        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        
        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        
        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        
        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        
        // logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        
        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        
        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        
        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        
        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (char)bt;
        System.out.printf("char = byte: c = %d --> c = %c\n", bt, c);
        c = (char)sh;
        System.out.printf("char = short: c = %d --> c = %c\n", sh, c);
        c = (char)ch;
        System.out.printf("char = char: c = '%c' --> c = %c\n", ch, c);
        c = (char) l;
        System.out.printf("char = long: c = (int)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (int)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (int)%f --> c = %c\n", d, c);
        // c = (int)bool;
        System.out.printf("char = boolean: c = (int)%b --> Compile Error\n", bool);
        System.out.println("========================================\n");
        
        
    }
   
    
    public static void testBoolean(boolean a_, boolean b_) {
        
        System.out.println("=====Type boolean test====");
        boolean a = a_, b = b_, c;
        System.out.println("\n***** Arithmetical Operators *****");
        
        System.out.println("Any arithmetical operations cannot be done to boolean data type!");
        System.out.println("\n***** Bitwise Operators *****");
        // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, a & b);
        // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, a | b);
        // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, a ^ b);
       
        c = a & b;
        System.out.println("\n***** Assignment Operators *****");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
        
        System.out.println("\n***** Relational Operators *****");
        // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("%b && %b = %b\n", a, b, a && b);
        // logical OR
        System.out.printf("%b || %b = %b\n", a, b, a || b);
        // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, a ^ b);
        // logical NOT
        System.out.printf("!%b --> %b\n", a, !a);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");
        System.out.println("any type = boolean: c = (any type)%b --> Compile Error\n");
        System.out.println("========================================\n");
}
    
    public static void testLong(long a_, long b_) {
        
        System.out.println("=====Type long test=====");
        long a = a_, b = b_, c;
        System.out.println("\n***** Arithmetical Operators *****");
        
        //addition
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        
        //subtraction
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        
        //multiplication
        System.out.printf("%d * %d = %d\n", a, b, a * b);
         
        //division
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        
        //modulus
        System.out.printf("%d %% %d = %d\n", a, b, a % b);
        
        //unary minus
        a = a_;
        System.out.printf("-%d = %d\n", a, -a);
        
        //unary plus
        a = a_;
        System.out.printf("+%d = %d\n", a, +a);
        
        //prefix increment
        a = a_;
        System.out.printf("++%d = %d\n", a, ++a);
        
         //postfix increment
        a = a_;
        System.out.printf("%d++ = %d\n", a, a++);
        
        //prefix decrement
        a = a_;
        System.out.printf("--%d = %d\n", a, --a);
        
         //postfix decrement
        a = a_;
        System.out.printf("%d-- = %d\n", a, a--);
        
        System.out.println("\n***** Bitwise Operators *****");
        
        // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, a & b);
        System.out.println("in binary form:");
        
        
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(b), Long.toBinaryString(a & b));
        
        // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, a | b);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(b), Long.toBinaryString(a | b));
        
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, a ^ b);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(b), Long.toBinaryString(a ^ b));
        
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, ~a);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(~a));
        
        // left shift
        System.out.printf("%d << 1 = %d\n", a, a << 1);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(a << 1));
        
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, a >> 1);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(a >> 1));
        a = -a_;
        
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, a >> 1);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(a >> 1));
        a = a_;
        
        // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, a >>> 1);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(a >>> 1));
        a = -a_;
        
        // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, a >>> 1);
        System.out.println("in binary form:");

        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(a >>> 1));
        System.out.println("\n***** Assignment Operators *****");
        a = a_;
        c = a + b;
        System.out.printf("%d+= %d --> c = %d\n", c, a, c += a);
        System.out.printf("-= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("*= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("/= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 127; 
        short sh = -32000; 
        char ch = '\u0002';
        int i=32767;
        float f = 1.9f; 
        double d = 123456789.625; 
        boolean bool = true;
        //convertion to different types
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c); 
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c); 
        c = ch; 
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c); 
        c = i; 
        System.out.printf("long = int: c = (long)%d --> c = %d\n", i, c);
        c = (long)f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long)d; 
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c); 
        //c = (long)bool;
        System.out.println("long = boolean: c = (long)%b --> Compile Error\n"); 
        System.out.println("========================================\n");
        

    }
    
     public static void testByte(byte a_,byte b_) { 
        
        byte a = a_, b = b_, c;
        System.out.println("=====Type byte test====");
        System.out.println("\n***** Arithmetical Operators *****");
        
        //addition
        System.out.printf("%d + %d = %d\n", a, b, (byte)(a+b));
        
        //subtraction
        System.out.printf("%d - %d = %d\n", a, b, (byte)(a-b));
        
        //multiplication
        System.out.printf("%d * %d = %d\n", a, b, (byte)(a*b));
         
        //division
        System.out.printf("%d / %d = %d\n", a, b, (byte)(a/b));
        
        //modulus
        System.out.printf("%d %% %d = %d\n", a, b, (byte)(a%b));
        
        a = a_;
        
        //unary minus
        System.out.printf("-%d = %d\n", a, (byte)-a);
        
        //unary plus
        System.out.printf("+%d = %d\n", a, (byte)+a);
        
        //prefix increment
        a = a_;
        System.out.printf("++%d = %d\n", a, (byte)++a);
        
         //postfix increment
        a = a_;
        System.out.printf("%d++ = %d\n", a, (byte)a++);
        
        //prefix decrement
        a = a_;
        System.out.printf("--%d = %d\n", a, (byte)--a);
        
         //postfix decrement
        a = a_;
        System.out.printf("%d-- = %d\n", a, (byte)a--);
        a=a_;
        System.out.println("\n***** Bitwise Operators *****");
        
        // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, (byte)(a & b));
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((byte)(a & b)));
        
        // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, (byte)(a | b));
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((byte)(a | b)));
        
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, (byte)(a ^ b));
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((byte)(a ^ b)));
        
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, (byte)~a);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((byte)~a));
        
        // left shift
        System.out.printf("%d << 1 = %d\n", a, (byte)(a << 1));
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((byte)(a << 1)));
        
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, (byte)(a >> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((byte)(a >> 1)));
        a = (byte)-a_;
        
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, (byte)(a >> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((byte)(a >> 1)));
        a = a_;
        
        // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, (byte)(a >>> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((byte)(a >>> 1)));
        a = (byte)-a_;
        
        // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, (byte)(a >>> 1));
        System.out.println("in binary form:");

        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((byte)(a >>> 1)));
        System.out.println("\n***** Assignment Operators *****");
        c = (byte)(a + b);
        System.out.printf("%d+= %d --> c = %d\n", c, a, (byte)(c += a));
        System.out.printf("-= %d --> c = %d\n", c, a, (byte)(c -= a));
        System.out.printf("*= %d --> c = %d\n", c, a, (byte)(c *= a));

        System.out.println("\n***** Relational Operators *****");
        
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d: %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        
        c = (byte)sh;
        System.out.printf("byte = short: c = %d --> c = %d\n", sh, c);
        c = (byte)ch;
        System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (int)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (int)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (int)%f --> c = %d\n", d, c);
        // c = (byet)bool;
        System.out.printf("byte = boolean: c = (int)%b --> Compile Error\n", bool);
        System.out.println("========================================\n");
        
        
    }
    
    public static void testShort(short a_,short b_) { 
        
        short a = a_, b = b_, c;
        System.out.println("=====Type short test====");
        System.out.println("\n***** Arithmetical Operators *****");
        
        //addition
        System.out.printf("%d + %d = %d\n", a, b, (short)(a+b));
        
        //subtraction
        System.out.printf("%d - %d = %d\n", a, b, (short)(a-b));
        
        //multiplication
        System.out.printf("%d * %d = %d\n", a, b, (short)(a*b));
         
        //division
        System.out.printf("%d / %d = %d\n", a, b, (short)(a/b));
        
        //modulus
        System.out.printf("%d %% %d = %d\n", a, b, (short)(a%b));
        
        a = a_;
        
        //unary minus
        System.out.printf("-%d = %d\n", a, (short)-a);
        
        //unary plus
        System.out.printf("+%d = %d\n", a, (short)+a);
        
        //prefix increment
        a = a_;
        System.out.printf("++%d = %d\n", a, (short)++a);
        
         //postfix increment
        a = a_;
        System.out.printf("%d++ = %d\n", a, (short)a++);
        
        //prefix decrement
        a = a_;
        System.out.printf("--%d = %d\n", a, (short)--a);
        
         //postfix decrement
        a = a_;
        System.out.printf("%d-- = %d\n", a, (short)a--);
        a=a_;
        System.out.println("\n***** Bitwise Operators *****");
        
        // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, (short)(a & b));
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((short)(a & b)));
        
        // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, (short)(a | b));
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((short)(a | b)));
        
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, (short)(a ^ b));
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString((short)(a ^ b)));
        
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, (short)~a);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((short)~a));
        
        // left shift
        System.out.printf("%d << 1 = %d\n", a, (short)(a << 1));
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((short)(a << 1)));
        
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, (short)(a >> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((short)(a >> 1)));
        a = (short)-a_;
        
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, (short)(a >> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((short)(a >> 1)));
        a = a_;
        
        // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, (short)(a >>> 1));
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((short)(a >>> 1)));
        a = (short)-a_;
        
        // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, (short)(a >>> 1));
        System.out.println("in binary form:");

        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString((short)(a >>> 1)));
        System.out.println("\n***** Assignment Operators *****");
        c = (short)(a + b);
        System.out.printf("%d+= %d --> c = %d\n", c, a, (short)(c += a));
        System.out.printf("-= %d --> c = %d\n", c, a, (short)(c -= a));
        System.out.printf("*= %d --> c = %d\n", c, a, (short)(c *= a));

        System.out.println("\n***** Relational Operators *****");
        
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d: %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        
        byte bt = 127; 
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        
        c = (short)bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = (short)ch;
        System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (int)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (int)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (int)%f --> c = %d\n", d, c);
        // c = (byet)bool;
        System.out.printf("short = boolean: c = (int)%b --> Compile Error\n", bool);
        System.out.println("========================================\n");
        
        
    }
 
    public static void testFloat(float a_, float b_) {
        
        System.out.println("=====Type long test=====");
        float a = a_, b = b_, c;
        System.out.println("\n***** Arithmetical Operators *****");
        
        //addition
        System.out.printf("%f + %f = %f\n", a, b, a + b);
        
        //subtraction
        System.out.printf("%f - %f = %f\n", a, b, a - b);
        
        //multiplication
        System.out.printf("%f * %f = %f\n", a, b, a * b);
         
        //division
        System.out.printf("%f / %f = %f\n", a, b, a / b);
        
        //modulus
        System.out.printf("%f %% %f = %f\n", a, b, a % b);
        
        //unary minus
        a = a_;
        System.out.printf("-%f = %f\n", a, -a);
        
        //unary plus
        a = a_;
        System.out.printf("+%f = %f\n", a, +a);
        
        //prefix increment
        a = a_;
        System.out.printf("++%f = %f\n", a, ++a);
        
         //postfix increment
        a = a_;
        System.out.printf("%f++ = %f\n", a, a++);
        
        //prefix decrement
        a = a_;
        System.out.printf("--%f = %f\n", a, --a);
        
         //postfix decrement
        a = a_;
        System.out.printf("%f-- = %f\n", a, a--);
        
        System.out.println("\n***** Bitwise Operators *****");
        
        System.out.println("Bitwise operators cannot be used for float data type!");
       
        System.out.println("\n***** Assignment Operators *****");
        a = a_;
        c = a + b;
        System.out.printf("%f+= %f --> c = %f\n", c, a, c += a);
        System.out.printf("-= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("*= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("/= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%%= %f --> c = %f\n", c, a, c %= a);

        System.out.println("\n***** Relational Operators *****");
        
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 127; 
        short sh = -32000; 
        char ch = '\u0002';
        int i=32767;
        double d = 123456789.625; 
        boolean bool = true;
        //convertion to different types
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c); 
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c); 
        c = ch; 
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c); 
        c = i; 
        System.out.printf("float = int: c = (float)%d --> c = %f\n", i, c);
        c = (float)d; 
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c); 
        //c = (long)bool;
        System.out.println("float = boolean: c = (float)%b --> Compile Error\n"); 
        System.out.println("========================================\n");
        

    }
    
    
      public static void testDouble(double a_, double b_) {
        
        System.out.println("=====Type double test=====");
        double a = a_, b = b_, c;
        System.out.println("\n***** Arithmetical Operators *****");
        
        //addition
        System.out.printf("%f + %f = %f\n", a, b, a + b);
        
        //subtraction
        System.out.printf("%f - %f = %f\n", a, b, a - b);
        
        //multiplication
        System.out.printf("%f * %f = %f\n", a, b, a * b);
         
        //division
        System.out.printf("%f / %f = %f\n", a, b, a / b);
        
        //modulus
        System.out.printf("%f %% %f = %f\n", a, b, a % b);
        
        //unary minus
        a = a_;
        System.out.printf("-%f = %f\n", a, -a);
        
        //unary plus
        a = a_;
        System.out.printf("+%f = %f\n", a, +a);
        
        //prefix increment
        a = a_;
        System.out.printf("++%f = %f\n", a, ++a);
        
         //postfix increment
        a = a_;
        System.out.printf("%f++ = %f\n", a, a++);
        
        //prefix decrement
        a = a_;
        System.out.printf("--%f = %f\n", a, --a);
        
         //postfix decrement
        a = a_;
        System.out.printf("%f-- = %f\n", a, a--);
        
        System.out.println("\n***** Bitwise Operators *****");
        
        System.out.println("Bitwise operators cannot be used for double data type!");
       
        System.out.println("\n***** Assignment Operators *****");
        a = a_;
        c = a + b;
        System.out.printf("%f+= %f --> c = %f\n", c, a, c += a);
        System.out.printf("-= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("*= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("/= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%%= %f --> c = %f\n", c, a, c %= a);

        System.out.println("\n***** Relational Operators *****");
        
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 127; 
        short sh = -32000; 
        char ch = '\u0002';
        int i=32767;
        float f = 1.9f;
        boolean bool = true;
        //convertion to different types
        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c); 
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c); 
        c = ch; 
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c); 
        c = i; 
        System.out.printf("double = int: c = (float)%d --> c = %f\n", i, c);
        c = (double)f; 
        System.out.printf("double = float: c = (float)%f --> c = %f\n", f, c); 
        //c = (long)bool;
        System.out.println("double = boolean: c = (float)%b --> Compile Error\n"); 
        System.out.println("========================================\n");
        

    }
    
    public static void testString(String a_,String b_) {     //method for testing two string type objects
  String a=a_, b=b_, c;
  System.out.println("=====Type String test=====");
  // concatenation a + b
  System.out.printf("Concatenation : %s + %s = %s\n", a, b, a + b); 
  // concatenation a += b
  System.out.printf("Concatenation : %s += %s = %s\n", a, b, a += b); 
  a=a_;
  System.out.printf("Comparison %s and %s --> %b\n",a,b, a.equals(b)); //comparison of two strings 
  System.out.println("\nType Cast Operator:"); 
  byte bt = 1; 
  short sh = -32000; 
  char ch = 'A';
  int i=32767;
  long l = 100000000000000000L;
  float f = 1.9f; 
  double d = 123456789.625; 
  boolean bool = true;
  
   //using method .valueOf 
   //convertion to different types
  c = String.valueOf(bt);
  System.out.printf("string = byte: c = %d --> c = %s\n", bt, c);
  c = String.valueOf(sh);
  System.out.printf("string = short: c = %d --> c = %s\n", sh, c);  
  c = String.valueOf(ch);
  System.out.printf("string = char: c = %c --> c = %s\n", ch, c);
  c = String.valueOf(i);
  System.out.printf("string = int: c = %d --> c = %s\n", i, c);  
  c = String.valueOf(l);
  System.out.printf("string = long: c = %d --> c = %s\n", l, c);  
  c = String.valueOf(f);
  System.out.printf("string = float: c = %f --> c = %s\n", f, c);
  c = String.valueOf(d);
  System.out.printf("string = double: c = %f --> c = %s\n", d, c);
  c = String.valueOf(bool);
  System.out.printf("string = boolean: c = %b --> c = %s\n", bool, c);
  
  System.out.println("========================================\n");

 }  
    
    
    public static void testSong(Song song1, Song song2) {
        System.out.println("=========Type Song test=========");
        System.out.println("Song list: ");
        song1.outputData();
        song2.outputData();
        System.out.println();
        System.out.println("Sorting two song's titles "
                + "in alphabetic order: ");
        Song.sortSongsTitles(song1, song2);
        System.out.println("========================================\n");
    }
    
}
    
    

