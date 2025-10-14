public class DemoOperator {
  public static void main(String[] args) {
    // ++, --
    int x = 3;
    x++; // 是加1
    System.out.println(x); // 4
    x += 1;
    System.out.println(x); // 5
    x = x + 1;
    System.out.println(x); // 6

    x--;
    System.out.println(x);


    // +=, -=, *=, /=
    int y =8;
    y += 2;
    System.out.println(y); // 10
    y = y + 2; 
    System.out.println(y); //12

    int a = 3;
    a *= 5;
    System.out.println(a); // 15
    a = a * 5;
    System.out.println(a); // 75

    double b = 20;
    b /= 10;
    System.out.println(b); // 2
    b = b / 10;
    System.out.println(b); // 0.2


    // % -> remainder
    int r = 10 % 3;
    System.err.println(r); //1 

    // ++, --
    int k = 6;
    //k = ++k + 3; // k + 1 before + 3
    int a1 = ++k + 3;
    System.out.println(a1); // 10
    System.out.println(k); // 7

    int j = 6;
    int a2 = j++ +3;
    System.out.println(a2); //9
    System.out.println(j); //7

    //k = k++ +3; // k + 3 --> assign --> k + 1


    // post
    int o = 9;
    o++;
    int result = o + 2;
    

    System.out.println(result);

    int h = 3;
    int m = (h++ + 3) * h++;
// what is m?
    System.out.println(m);
    // h + 3 = 6
    // h ++ = 4
    // 6 * 4
    // h++ = h because 5
}
}