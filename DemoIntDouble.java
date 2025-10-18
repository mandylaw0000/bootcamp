public class DemoIntDouble {
  public static void main(String[] args) {
    // ! 變量
    // ! Variable and Date Type

    int x = 3;
    // ! int x (declaration) 聲明x可以接受整數
    // x is a varabnle name
    // = 3 (assignmemt, assign value 3 to variable x)
    // ! 暫存記憶
    System.out.println(x); // 3
    // ! x can be anything, variable!

    int y = 10;
    System.out.println(y);

    // declaration 要先聲明！
    int a;
    int k;

    // Assignment
    a = 100;
    k = 20;

    int total = x + y;
    System.out.println(total); // 13

    int baseSalary = 20000;
    int bonus = 5000;
    int totalSalary = baseSalary + bonus;
    System.out.println(totalSalary);
    System.out.println(bonus);


    // discount
    int price = 150;
    // Naming convenion (camel case)

    // ! 用double去裝小數位
    double discountRate = 0.8;

    // ! Match Operation:
    // int + int = int
    // int + double = double
    // ! 任何東西加double都會＝dounle
    // i.e 1.0 + 4 = 5.0

    // int * double = double
    // ! we cannot assign double value to an int variable
    // java不允許天然地損失
    // java 非常嚴謹！！
    // 120 not equal to 120.0


    double finalPrice = price * discountRate;
    System.out.println(finalPrice);// 120.0

    int finalPrice2 = price * 80 / 100;
    System.out.println(finalPrice2); // 120

    int englishScore = 82;
    int mathScore = 91;
    int historyScore = 83;

    // ！ (int + int + int)/ int = int
    int averageScore = (englishScore + mathScore + historyScore) / 3;
    System.out.println(averageScore);// 85

    // solution 3變成為3.0
    double averageScore2 = (englishScore + mathScore + historyScore) / 3.0;
    System.out.println(averageScore2);// 85.33333333

    // declaration時把int改為double
    double englishScore1 = 82;
    double mathScore1 = 91;
    double historyScore1 = 83;
    double averageScore3 = (englishScore1 + mathScore1 + historyScore1) / 3;
    System.out.println(averageScore3);// 85.333333333

    int appleCount = 9;
    double applePrice = 5.5;
    int orangeCount = 4;
    double orangePrice = 6.5;

    double discount = 0.95;

    // finalAmount
    // (int * double + int * double) * double
    double finalAmount =
        (appleCount * applePrice + orangeCount * orangePrice) * discount;
    System.out.println(finalAmount); // 7.725



  }
}
