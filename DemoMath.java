public class DemoMath {
  public static void main(String[] args) {
    double r = Math.pow(2, 4.0); // 16.0
    System.out.println(r); 

    System.out.println(Math.ceil(3.1));// 4.0
    System.out.println(Math.floor(3.9)); // 3.0

    System.out.println(Math.PI);// 3.141592653589793
    Math.abs(r);

    // In java, we don't have byte value and short value
    // assign int value into short varible
    short s1 = 1; //safe 尾寫死

    int x = 1;
    // short s2 = x; // unsafe, 未寫死

    long l1 = 100L; // 建議寫大階L
    long l2 = 100; // promotion int -> long

    // float f2 = 1.5; // double value -> float variable (risky)
    float f1 = 1.5f;
    double d1 = 1.5d;

    System.out.println(Math.abs(-3));// 3
    System.out.println(Math.abs(4));// 4


    int score = -4;
    System.out.println(Math.max(0, score));// 0

    score = 100;
    System.out.println(Math.min(100, score));// 100

    System.out.println(Math.round(0.134));// 0
    System.out.println(Math.round(0.534));// 1

    double d10 = 0.1235; //0.124
    System.out.println(Math.round(d10*1000)/1000.0); //0.124

    System.out.println(Math.random());// random number(0-1)
    



  }
}

