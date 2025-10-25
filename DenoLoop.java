import java.util.Scanner;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class DenoLoop {
  public static void main(String[] args) {
    // flow -> if-else
    // loop (for-loop, while)

    int x = 3;
    x *= 3;
    x *= 3;
    System.out.println(x); // 27

    // for-loop
    // (initialization; continue, criteria; modifier)
    for (int i = 0; i < 3; i++) { // 3次
      System.out.println("Hello");

    }
    // Step 1: int i = 0
    // Step 2: i < 3 ? Yes
    // Step 3: print hello
    // Step 4: i++ , (i=1)
    // Step 5: i < 3 ? Yes
    // Step 6: print hello
    // Step 7: i++ , (i=2)
    // Step 8: i < 3 ? Yes
    // Step 9: print hello
    // Step 10: i++ (i=3)
    // Step 11: i < 3 ? No
    // Step 12: Exit loop

    // loop -> 0,1,2,3,4,5 -> total = 15
    int total = 0;
    for (int i = 0; i < 6; i++) {
      total = total + i;// total += i
    }
    System.out.println("total = " + total);


    // for loop + if (1-10, print odd number only)
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    // sum up all even numbers between 0-20
    int sum = 0;
    for (int i = 0; i < 21; i++) { // 控制範圍
      if (i % 2 == 0) { // 控制要出什麼
        sum += i;
      }
    }
    System.out.println(sum); // 110

    // 0-100, sum up all numnber this is diveided by 3
    int sum1 = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0) {
        sum1 += i;

      }
    }
    System.out.println(sum1);

    // 0-50, difference between the sum of all even number and the sum of all odd number
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < 51; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    System.out.println(evenSum - oddSum);

    // 0-20, sum up all even number; 21-50 sum up odd number
    // find the product of both total number
    evenSum = 0;
    oddSum = 0;
    for (int i = 0; i < 51; i++) {// non-business meaning(the number of time)
      if (i <= 20) { // business meaning, explicit aligns the requirements
        if (i % 2 == 0) {
          evenSum += i;
        }
      } else if (i >= 21 && i <= 50) {
        if (i % 2 == 1) {
          oddSum += i;
        }
      }
    }
    System.out.println(evenSum * oddSum);

    // loop + if + break/continue
    // 1. break
    // searching
    String[] names =
        new String[] {"John", "Peter", "Sally", "Vincent", "Steven"}; // fixed-length = 4
    // Find the first names that length > 5
    String targetName = null;
    for (int i = 0; i < names.length; i++) {
      System.out.println("i = " + i);
      if (names[i].length() > 5) {
        targetName = names[i];
        break; // break the loop

      }
    }
    System.out.println("targetName = " + targetName);


    // Scanner collect input
    // Scanner s = new Scanner(System.in);
    // System.out.println("Please input an integer");
    // int input = s.nextInt();
    // int result = input * 3;
    // System.out.println("result = " + result);



  }
}
