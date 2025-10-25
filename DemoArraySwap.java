import java.util.Arrays;

public class DemoArraySwap {
  public static void main(String[] args) {
    int x = 10;
    int y = 7;

    // x = 7;
    // y = 10;

    // System.out.println("x = " + x);
    // System.out.println("y = " + y);

    // swap the values between x and y
    int temp = x; // backup x
    x = y; // backup y
    y = temp;
    System.out.println("x = " + x);
    System.out.println("y = " + y);

    // given int[]
    int[] arr1 = new int[5];
    arr1[0] = 17;
    arr1[1] = 5;
    arr1[2] = -8;
    arr1[3] = 20;
    arr1[4] = 2;

    // sorting in ascending order
    // 17, 5, -8, 20, 2
    // find the max value and put it at the tail of the array
    // 5, 17, -8, 20, 2
    // 5, -8, 17, 20, 2
    // 5, -18, 17, 20, 2
    // 5, -8, 17, 2, 20

    for (int j = 0; j < arr1.length - 1; j++) { // 0, 1, 2, 3
      for (int i = 0; i < arr1.length - j - 1; i++) {
        if (arr1[i] > arr1[i + 1]) {
          temp = arr1[i];
          arr1[i] = arr1[i + 1];
          arr1[i + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr1)); // [-8, 2, 5, 17, 20]

    // swap
    String name = "Steven";
    char[] name2 = name.toCharArray();// [S, t, e, v, e, n]
    // nevets
    // round 1: swap s and n
    // round 2: swap t and e
    // round 3: swap e and v
    char backup;
    for (int i = 0; i < name2.length / 2; i++) { // 5/2 -> 2
      backup = name2[i];
      name2[i] = name2[name2.length - 1 - i];
      name2[name2.length - 1 - i] = backup;
    }
    System.out.println(Arrays.toString(name2)); // [n, e, v, e, t, S]
    // ! char[] -> String
    System.out.println(String.valueOf(name2));

  }
}
