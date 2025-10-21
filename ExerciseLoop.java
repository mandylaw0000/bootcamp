public class ExerciseLoop {
  public static void main(String[] args) {
    System.out.println("問題1：loop -> 0,1,2,3,4,5 -> total = 15");
    int total = 0;
    for (int i = 0; i < 6; i++) {
      total += i;
    }
    System.out.println("total = " + total); // 15

    System.out.println("問題2：for loop + if (1-10, print odd number only)");
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }


    System.out.println("問題3：sum up all even numbers between 0-20");
    int evenSum = 0;
    for (int i = 0; i < 21; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      }
    }
    System.out.println(evenSum); // 110

    System.out.println("問題4：0-100, sum up all numnber this is diveided by 3");
    int sum = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0) {
        sum += i;
      }
    }
    System.out.println(sum); // 1683


    System.out.println(
        "問題5：0-50, difference between the sum of all even number and the sum of all odd number");
    evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < 51; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else { // ! 因為此情況只有奇數及內數，因此可以用else，不用else if
        oddSum += i;
      }
    }
    System.out.println(evenSum - oddSum); // 25



    System.out.println(
        "問題6:0-20, sum up all even number; 21-50 sum up odd number and find the product of both total number");
    evenSum = 0;
    oddSum = 0;
    for (int i = 0; i < 51; i++) {
      if (i >= 0 && i <= 20 && i % 2 == 0) {
        evenSum += i;
      } else if (i >= 21 && i <= 50 && i % 2 == 1) {
        /*
         * ! 用else if 因為有3個不同場景， 情況 1：0-20 的偶數 → 加到 evenSum， 情況 2：21-50 的奇數 → 加到 oddSum 情況 3：其他所有數字 → 忽略
         */
        oddSum += i;
      }
    }
    System.out.println(evenSum * oddSum); // 57750


    System.out.println("練習 1：數字序列與總和");
    // loop -> 2,4,6,8,10 -> total = 30
    // 計算 2-10 偶數的總和
    evenSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i >= 2 && i <= 10) {
        if (i % 2 == 0) {
          evenSum += i;
        }
      }
    }
    System.out.println("2-10 偶數的總和是" + evenSum); // 30

    // ! 做題步驟
    // 步驟一 範圍 //
    // 步驟二 條件篩選 //
    // 步驟三 場景//

    System.out.println("練習 2：條件打印");
    // for loop + if (1-15, print even number only)
    // 1-15 範圍內，只打印偶數
    for (int i = 0; i < 16; i++) {
      if (i >= 1 && i <= 15 && i % 2 == 0) {
        System.out.println(i);
      }
    }

    System.out.println("練習 3：特定範圍求和");
    // sum up all odd numbers between 0-30
    // 計算 0-30 所有奇數的總和
    oddSum = 0;
    for (int i = 0; i < 31; i++) {
      if (i % 2 == 1) {
        oddSum += i;
      }
    }
    System.out.println(oddSum);

    System.out.println("練習 4：整除條件求和");
    // 0-50, sum up all number that is divided by 4
    // 計算 0-50 所有能被 4 整除的數字總和
    sum = 0;
    for (int i = 0; i < 51; i++) {
      if (i % 4 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);

    System.out.println("練習 5：差值計算");
    // 0-40, difference between the sum of all even number and the sum of all odd number
    // 計算 0-40 偶數總和與奇數總和的差值
    evenSum = 0;
    oddSum = 0;
    for (int i = 0; i < 41; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    System.out.println(evenSum - oddSum);

    System.out.println("練習 6：雙重條件");
    // 0-60, sum up all numbers that are divided by 2 and 3
    // 計算 0-60 所有能同時被 2 和 3 整除的數字總和
    sum = 0;
    for (int i = 0; i < 61; i++) {
      if (i % 2 == 0 && i % 3 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);

    System.out.println("練習 7：乘積計算");
    // find the product of all numbers from 1 to 5
    // 計算 1-5 所有數字的乘積（1×2×3×4×5）
    int product = 1; // !不可以是0 0 *咩＝0
    for (int i = 0; i < 6; i++) {
      if (i >= 1 && i <= 5) {
        product *= i;
      }
    }
    System.out.println(product);

    System.out.println("練習 8：階乘計算");
    // calculate factorial of 6 (6! = 6×5×4×3×2×1)
    // 計算 6 的階乘
    product = 1; // !不可以是0 0 *咩＝0
    for (int i = 0; i < 7; i++) {
      if (i >= 1 && i <= 6) {
        product *= i;
      }
    }
    System.out.println(product);

    System.out.println("練習 9：複合條件");
    // 0-25, sum up all numbers that are divided by 2 //!or 3
    // 計算 0-25 所有能被 2 或 3 整除的數字總和
    sum = 0;
    for (int i = 0; i < 26; i++) {
      if (i % 2 == 0 || i % 3 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);

    System.out.println("練習 10：數字模式");
    // print pattern: 5,10,15,20,25,30 -> total = ?
    // 打印 5-30 的 5 的倍數序列並計算總和
    sum = 0;
    for (int i = 0; i < 31; i++) {
      if (i % 5 == 0) {
        System.out.println(i);
        sum += i;
      }
    }
    System.out.println("total = " + sum);


    System.out.println("練習 11：反向序列");
    // loop -> 10,9,8,7,6,5,4,3,2,1 -> product of first 3 numbers = ?
    // ! 10-1 反向序列，計算前 3 個數字的乘積

    System.out.print("反方向序列(1-10)");
    int count = 0;
    product = 1;
    for (int i = 0; i < 11; i++) {
      int number = 10 - i;
      // i = 0 --> 10 - 0 = 10
      // i = 0 + 1 = 1 --> 10 - 1 = 9
      if (number >= 1) { // 排除 0
        System.out.print(number);
        if (number > 1)
          // 顯示逗號分隔，但只在數字 > 1 時顯示, 因為最後一個數字（1）後面不需要逗號
          // 數字 10 → 顯示 10,
          System.out.print(",");
        if (count < 3) {
          product *= number;
          count++;
          /*
           * 數字序列: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 ✓ ✓ ✓ ✗ ✗ ✗ ✗ ✗ ✗ ✗ ↑ ↑ ↑ 前3個數字 (計算乘積) 後7個數字 (忽略)
           */
        }
      }
    }
    System.out.println();
    System.out.println(product);


    System.out.println("練習 12：交替序列");
    // 1-20, sum up numbers at even positions (2nd,4th,6th...)
    // 計算 1-20 中在偶數位置（第2、4、6...個）的數字總和
    evenSum = 0;
    for (int i = 0; i < 21; i++) {
      if (i >= 1 && i % 2 == 0) {
        evenSum += i;
      }
    }
    System.out.println(evenSum);

    System.out.println("練習 13：質數檢查");
    // 1-20, print prime numbers only
    // 在 1-20 範圍內，只打印質數
    // 在 1-20 範圍內，只打印質數
    System.out.print("1-20 的質數: ");
    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
    for (int prime : primes) {
      System.out.print(prime + " ");
    }
    System.out.println();

    System.out.println("練習 14：斐波那契序列");
    // print first 8 Fibonacci numbers and calculate their sum
    // 打印前 8 個斐波那契數並計算總和
    System.out.println("練習 15：數學常數");
    // calculate the sum of reciprocal numbers: 1/1 + 1/2 + 1/3 + ... + 1/10
    // 計算倒數總和：1/1 + 1/2 + 1/3 + ... + 1/10



  }
}
