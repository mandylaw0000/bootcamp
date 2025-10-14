public class DemoPrimitive {
  //Raw Type
  //We have 9 primitives(byte, short, int, long, float, double, char, boolean)
  
  // short cut: main
  public static void main(String[] args) {
    // ! Integer
    // int, long, short, byte 
    int x = 3;
    System.out.println(x); // 3

    x = 10; // Re-assignment
    System.out.println(x); // 10

    //byte = -128 - 127 //沒人用 for high level
    byte b1 = 3;
    byte b2 = 127; // max value of byte
    byte b3 = -128; // min value of byte
    //byte b4 = -129; //error

    short s1 = 32767; //max //沒人用for high level
    short s2 = -32768; // min
    // short s3 = 32768;
    // short s4 = -93933;

    // ! By default, we use int for 99% scenario.
    int i1 = 2147483647; // max 2的31都次方
    int i2 = -2147483648; // min

    // 2^63 -1 (max)
    //-2^63 (min)
    long l1 = 10;
    long l2 = -21;

    // ! Decimal
    // double, float 

    //10.123456789 -> double value
    // double > float (precision)
    double d1 = 10.123456789;

    // ! Java (Assign double value to float variable --> error)
    // float f1 = 10.123456789; // error

    // 10.123456789 -> float value
    float f1 = 10.123456789f;
    double d2 = 10.123456789f;

    double d10 = 10.3;

    // ! error, not because of the actual value, but the type
    // ! float f10 = d10; // risky -> error (Step 1: risky)
    double f10 = d10;

    // float 沒人用，如有人用要小心

    // ! char (single character)
    // a is a char value
    // assign char value into char variable
    // single quote '' for char value
    char c1 = 'a';
    // char c1 = "a"; error
    String s10 = "a";

    char gender = 'F';
    char grade = 'A';

    // For primitives comparison ==, >==, <==, !==, >, <
    System.out.println(gender == grade);
    System.out.println(gender != 'm'); //true

    int score = 73;
    System.out.println(score > 70); // true

    double d11=19393.9303;
    System.out.println(x == 0);// false

    // boolean 不可＝ 0，1
    int age = 19;
    // age >= -> event
    boolean isAdult = age >=18;
    boolean b10 = false;
    



















  }
}
