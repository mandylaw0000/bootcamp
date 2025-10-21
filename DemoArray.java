public class DemoArray {
  public static void main(String[] args) {
    // The way to store value: Primitives, Wrapper Class, String total 17 type

    // New way to store a set of same type of values

    // new int[4] -> array object
    int[] arr = new int[4];
    // assign values into an array
    arr[0] = 100;
    arr[1] = 70;
    arr[2] = 2_100_000_000;
    arr[3] = -200;

    // ! ArrayIndexOutOf Bound
    // arr[-1] = -200;
    // arr[4] = -200;
    // System.out.println(arr);

    // for loop to read array
    for (int i = 0; i < 4; i++) {
      System.out.println(arr[i]);
    }

    // long array, with length 3
    // 99
    // 5
    // 45

    long[] arr1 = new long[3];
    arr1[0] = 99L;
    arr1[1] = 5L;
    arr1[2] = 40L;

    // print even number in arr1
    for (int i = 0; i < 3; i++) {
      if (arr1[i] % 2 == 0) {
        System.out.println(arr1[i]);
      }
    }
    System.out.println(arr1.length); // 3

    // boolean array, with length 4
    // false
    // true
    // false
    // true

    boolean[] arr2 = new boolean[4];
    arr2[0] = false;
    arr2[1] = true;
    arr2[2] = false;
    arr2[3] = true;

    int sum = 0; // int falseCounter = 0;
    for (int i = 0; i < 4; i++) {
      if (arr2[i] == false) {
        sum += i; // falseCounter ++;
      }
    }
    System.out.println("False count = " + sum); // 2

    int[] arr3 = new int[5];
    arr3[0] = 10;
    arr3[1] = -4;
    arr3[2] = 90;
    arr3[3] = 100;
    arr3[4] = -20;

    // for loop -> find the max value in arr 4
    int max = arr3[0];
    int min = arr3[0];
    int idMaxValue = 0;
    sum = 0;

    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
        idMaxValue = i;
      }
      if (arr3[i] < min) {
        min = arr3[i];
      }sum += arr3[i];
      }

    System.out.println("max = " + max); // 100
    System.out.println("min = " + min); // -20
    System.out.println("Index of Max value = " + idMaxValue);// 3
    System.out.println("sum = " + sum);
    // find the index of the max value

    // find the min


  }
  }

