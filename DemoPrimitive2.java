public class DemoPrimitive2 {
  public static void main(String[] args) {
    // overflow
    short s1 = 30000;
    short s2 = 31000;
    short s3 = (short) (s1 + s2); // short + short -> in, byte + byte -> int, byte + short -> int 61000
    System.out.println(s3); //-4536
    // 32XXX -> +1 -> 32XXX

    int i1 = 2_100_000_000;
    int i2 = 100_000_000;
    int i3 = i1 + i2;
    System.out.println(i3);// -2094967296

    // ! Promotion (upcast)
    // byte -> short -> int -> long -> float -> doubble
    byte b1 = 10;
    short s4 = b1;
    int i10 = s4;
    long l10 = i10;
    float f10 = l10;
    double d10 = f10;
    // char -> int

    // ! downcasting 
    float f11 = (float) 10.5d;
    long l12 = 2_200_000_000L;
    int i11 = (int) l12; // you confirmed the risk
    System.out.println(i11);


  }
}
