public class ExerciseLoop {
  public static void main(String[] args) {
    // loop -> 0,1,2,3,4,5 -> total = 15

    // for loop + if (1-10, print odd number only)

    // sum up all even numbers between 0-20

    // 0-100, sum up all numnber this is diveided by 3

    // 0-50, difference between the sum of all even number and the sum of all odd number

    // 0-50, difference between the sum of all even number and the sum of all odd number

    // find the product of both total number

    System.out.println("練習 1：數字序列與總和");
    // loop -> 2,4,6,8,10 -> total = 30
    // 計算 2-10 偶數的總和
    int evenSum = 0;
    for (int i = 0; i < 9; i++){
      if (i > 2){
        if (i % 2 == 0);
        evenSum += i;
      }
    }
    System.out.println(evenSum);
  }
}
