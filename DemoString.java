public class DemoString {
  public static void main(String [] arge) {
    // int double
    // ! String can save 中文及英文及符號

    String name = "Mandy";
    String tutor = "Vincent";

    
    // ! String has + operation
    String firstName = "Jennie";
    String lastName = "Wong";
    String fullName = firstName + " " + lastName;

    //short cut: sysout
    System.out.println(fullName); // Jenny Wong

    String emptyString = "";
    System.out.println(emptyString);

   // @ String has no -, *, / operations

   // @ For + operation in String, it becomes String no matter what they are.

   // ! String Value + double value -> String Value
   // Assign String value into String variable
   String s3 = "Sally" + 0.3;
   System.out.println(s3); //Sally0.3
   String s4 = "Leo" +102;
   System.out.println(s4);// Leo102

   // double result = "Vincent" + 8.4; // error 

   // 大階英文字母是class
   // 小階英文字母是原始format

   // ! Methods (functions)
   // 1. length
   String teacher = "Steven";
   System.out.println(teacher.length()); //6

   //2. isEmpty
   System.out.println(teacher.isEmpty()); //false
   System.out.println(emptyString.isEmpty()); // true

   // 3. equals
   String s6 = "abc";
   String s7 = "abc";
   System.out.println(s6.equals(s7)); // true

   String s8 = "abcd";
   System.out.println(s8.equals(s7));// false

   //4. charAt 找String中第幾個字母
   // ! Indec begins at 0
   System.out.println(s8.charAt(0));// a
   System.out.println(s8.charAt(1));// b
   System.out.println(s8.charAt(2));// c
   System.out.println(s8.charAt(3));// d
   // System.out.println(s8.charAt(4));// error
   // System.out.println(s8.charAt(-1)); // error

  }
  
}
