public class ExerciseArray {
  public static void main(String[] args) {
    System.out.println("練習 1：陣列總和");
    // 給定一個整數陣列，計算所有元素的總和
    // Given an integer array, calculate the sum of all elements
    // int[] numbers = {5, 10, 15, 20};
    int[] arr = new int[4]; // 建立一個整數陣列，長度為 4：
    arr[0] = 5; // 設定索引 0 的值為 5：
    arr[1] = 10; // 設定索引 1 的值為 10：
    arr[2] = 15; // 設定索引 2 的值為 15：
    arr[3] = 20; // 設定索引 3 的值為 20：

    int sum = 0; // 建立變數 sum 來儲存總和，初始化為 0
    for (int i = 0; i < 4; i++) { // 開始 for 迴圈：
      sum += arr[i]; // 將陣列元素加到總和中：
      // arr[0] = 5; 0 + 5 = 5
      // arr[1] = 10; 5 + 10 = 15
      // arr[2] = 15; 15 + 15 = 30
      // arr[3] = 20; 30 + 20 = 50
    }
    System.out.println(sum);

    System.out.println("練習 2：尋找最小值");
    // 在陣列中尋找並顯示最小值
    // Find and display the minimum value in an array
    // int[] data = {34, 12, 67, 23, 45};
    int[] arr2 = new int[5];
    arr2[0] = 34;
    arr2[1] = 12;
    arr2[2] = 67;
    arr2[3] = 23;
    arr2[4] = 45;

    int min = arr2[0];
    for (int i = 0; i < 5; i++) {
      if (arr2[i] < min) {
        min = arr2[i];
      }
    }
    System.out.println(min);

    System.out.println("練習 3：陣列反轉");
    // 將陣列元素順序反轉並顯示結果
    // Reverse the order of array elements and display the result
    int[] original = {1, 2, 3, 4, 5};
    System.out.println("練習 4：奇數篩選");
    // 從陣列中找出所有奇數並顯示
    // Find and display all odd numbers from an array
    int[] values = {11, 22, 33, 44, 55, 66};
    System.out.println("練習 5：倍數檢查");
    // 找出陣列中所有能被 3 整除的數字
    // Find all numbers in array that are divisible by 3
    int[] nums = {7, 12, 18, 25, 30, 42};
    System.out.println("練習 6：範圍篩選");
    // 顯示陣列中所有在 20-50 範圍內的數字
    // Display all numbers in array that are between 20 and 50
    int[] array = {15, 25, 35, 45, 55, 65};
    System.out.println("練習 7：布林陣列計數");
    // 計算布林陣列中 true 的數量
    // Count the number of true values in a boolean array
    boolean[] flags = {true, false, true, true, false};
    System.out.println("練習 8：條件布林陣列");
    // 建立布林陣列，標記哪些數字大於 30
    // Create boolean array marking which numbers are greater than 30
    int[] numbers = {25, 35, 15, 45, 55};
    System.out.println("練習 9：布林邏輯操作");
    // 對兩個布林陣列進行 AND 運算
    // Perform AND operation on two boolean arrays
    boolean[] arr1 = {true, false, true, false};
    boolean[] arr2 = {true, true, false, false};
    System.out.println("練習 10：尋找索引位置");

  }
}
