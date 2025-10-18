public class Exercise {
  public static void main(String[] args) {

    // ! 練習方法，先整理目前學習的不同command，再依照不同command的作用再練習

    System.out.print("My name: ");// print () 打完後留在原地
    System.out.println("Mandy"); // prntln() 打完後另起到行
    System.out.print("My hobby: ");// print () 打完後留在原地
    System.out.println("Swimming");// prntln() 打完後另起到行
    System.out.println("5 +3 = " + (5 + 3));// prntln() 打完後另起到行
    System.out.println("7 * 3 = " + 7 * 3);
    System.out.println(5 + 5); // 10
    System.out.println("10" + 5); // 105

    /*
     * This is a multi-linr comment
     */

    // JAVA Variables
    // 練習 1：基本變數宣告
    System.out.println("練習 1：基本變數宣告");
    int age = 17; // 一個整數變數表示年齡
    System.out.println("My age is " + age);
    double height = 155.9; // 一個浮點數變數表示身高（米）
    System.out.println("My heigh is " + height);

    boolean isStudent = true; // 一個布林變數表示是否為學生, true必須為細階
    System.out.println("You are student " + isStudent);

    String name = "Mandy"; // String 要記得打 ""
    System.out.println("My name is " + name);

    // 練習 2：變數運算
    /*
     * 計算一個矩形的面積和周長： 數學公式： 面積 = 長 × 寬 周長 = 2 × (長 + 寬)
     */
    System.out.println("練習 2：變數運算");
    double length = 8;
    double width = 3;
    System.out.println("Rectangle Calculations");
    System.out.println("Length " + length + " cm");
    System.out.println("Width " + width + " cm");
    System.out.println("The area of a rectangle is " + length * width);
    System.err
        .println("The Perimeter of a rectangle is " + (length + width) * 2);

    // 練習 3：資料型別轉換
    System.out.println("練習 3：資料型別轉換");
    int score = 88;
    double average = score;
    System.out.println("Original Score " + score);
    System.out.println("Average Score " + average);

    // 練習 4：變數交換
    System.out.println("練習 4：變數交換");
    /*
     * 寫一個程式交換兩個變數的值： 宣告兩個整數變數 a 和 b 不使用第三個變數的情況下交換它們的值 顯示交換前和交換後的值
     */

    int a = 4, b = 1; // 可以同一行寫
    System.out.println("交換前");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("交換後");
    System.out.println("a = " + (a - 3));
    System.out.println("b = " + (b + 3));

    /*
     * 練習 5：溫度轉換 建立溫度轉換程式： 宣告一個攝氏溫度變數 轉換為華氏溫度（公式：F = C × 9/5 + 32） 顯示兩種溫度的值
     */
    System.out.println("練習 5：溫度轉換");
    double celsius = 37.0;
    double fahrenheit = celsius * 9 / 5 + 32;
    System.out.println("The Celsius temperature is " + celsius);
    System.out.println("The Fahrenheit temperature is " + fahrenheit);

    // Java String 練習題
    System.out.println("練習 1: 字串基本操作");
    // - String declaration and initialization
    String s1 = "mandy";
    System.out.println(s1);
    // - String concatenation
    System.out.println("hello " + s1);
    // - Get string length
    System.out.println(s1.length());
    // - Convert case (upper/lower)
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());

    System.out.println("練習 2: 字串比較");
    // Compare two strings for equality, ignoring case
    // Use equals() and equalsIgnoreCase() methods
    String s2 = "MANDY";
    System.out.println("Is mandy and MANDY are same: " + s1.equals(s2));
    System.out
        .println("Is mandy abd MANDY the same " + s1.equalsIgnoreCase(s2));

    System.out.println("練習 3: 字串提取");
    // Extract specific parts from a complete sentence
    // ! 輸入位置找 英文字/多個中文字：Use substring(), 英文字母/單個中文字：charAt() method
    System.out.println("Mandy的第四個英文字母是" + (s1.charAt(3)));
    // System.out.println(s1.charAt(9)); 不可拎超過字本身的長度
    String s3 = "How are you";
    System.out.println(s3 + "的第一個字是" + s3.substring(0, 4)); // 位置0到3 → "How"
    String s4 = "你好嗎";
    System.out.println(s4 + "中的第一個字是" + s4.charAt(0));
    System.out.println(s4 + "中的所有字是" + s4.substring(0, 3));
    System.out.println(s4.substring(1));

    /*
     * 重點總結 charAt (int index) 取得指定位置的字元，你好嗎.charAt(0) ->你 substring (int start) 從開始位置到結尾，你好嗎.substring(1) ->好嗎 substring (int start, int end) 從開始位置到結的位置，你好嗎.substring(0, 3) -> 你好嗎
     */

    System.out.println("練習 4: 字串搜尋");
    // 在字串中搜尋特定字詞或字元
    // 使用 indexOf(), contains() 方法
    // 計算某字元出現的次數

    // ! indexOf = 搜尋字串或字元的位置 -> 只能找到最自出現的一個？？！

    String s5 = "Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.";
    System.out.println("e的位置" + s5.indexOf('e')); // 找字元位置
    System.out.println("e的位置" + s5.indexOf("Hubert")); // 找字串位置



  }
}
