public class DemoString {
  public static void main(String[] arge) {
    // int double
    // ! String can save 中文及英文及符號

    String name = "Mandy";
    String tutor = "Vincent";


    // ! String has + operation
    String firstName = "Jennie";
    String lastName = "Wong";
    String fullName = firstName + " " + lastName;

    // short cut: sysout
    System.out.println(fullName); // Jenny Wong

    String emptyString = "";
    System.out.println(emptyString);

    // @ String has no -, *, / operations

    // @ For + operation in String, it becomes String no matter what they are.

    // ! String Value + double value -> String Value
    // Assign String value into String variable
    String s3 = "Sally" + 0.3;
    System.out.println(s3); // Sally0.3
    String s4 = "Leo" + 102;
    System.out.println(s4);// Leo102

    // double result = "Vincent" + 8.4; // error

    // 大階英文字母是class
    // 小階英文字母是原始format

    // ! Methods (functions)
    // 1. length
    String teacher = "Steven";
    System.out.println(teacher.length()); // 6

    // 2. isEmpty
    System.out.println(teacher.isEmpty()); // false
    System.out.println(emptyString.isEmpty()); // true

    // 3. equals
    String s6 = "abc";
    String s7 = "abc";
    System.out.println(s6.equals(s7)); // true

    String s8 = "abcd";
    System.out.println(s8.equals(s7));// false

    // 4. charAt 找String中第幾個字母
    // ! Indec begins at 0
    System.out.println(s8.charAt(0));// a
    System.out.println(s8.charAt(1));// b
    System.out.println(s8.charAt(2));// c
    System.out.println(s8.charAt(3));// d
    // System.out.println(s8.charAt(4));// error
    // System.out.println(s8.charAt(-1)); // error

    // null (non-primitive/ class)
    String s5 = "";
    System.out.println(s5.length()); // 0

    String s10 = null;
    // System.out.println(s10.length()); //! error
    // s10.charAt(0); //! error

    // 5. isBlank
    String s11 = "";
    String s12 = "    ";
    String s13 = "Tommy";
    System.out.println(s11.isEmpty()); // true
    System.out.println(s12.isEmpty()); // false
    System.out.println(s13.isEmpty()); // false

    System.out.println(s11.isBlank()); // true
    System.out.println(s12.isBlank()); // true
    System.out.println(s13.isBlank()); // false

    // 6. substring()
    String s14 = "Hello World!!!";
    // index = length -1
    System.out.println(s14.substring(6, 11)); // world, 不包含11位！
    System.out.println(s14.substring(0)); // Hello World!!!

    // 7.toLowerCase(), toUpperCase()
    System.out.println(s14.toLowerCase());// hello world!!!
    System.out.println(s14.toUpperCase());// HELLO WORLD!!!

    // Java -> Type
    // ! chain method
    System.out.println(s14.toUpperCase().charAt(1)); // E
    System.out.println(s14.substring(4).length()); // 10

    // 8. replace 改用戶資料
    String s17 = "Python";
    String s18 = s17.replace("y", "x");
    System.out.println(s18); // Pxthon

    System.out.println(s17.replace("y", "x").toUpperCase()); // PXTHON

    String s19 = s17.replace("th", "!!!");
    System.out.println(s19); // Py!!!on

    // 9. contains
    System.out.println(s17.contains("Py")); // true
    System.out.println(s17.contains("py"));// false
    System.out.println(s17.contains("t"));// true
    System.out.println(s17.contains(""));// true empty string是無處不在


    // 10. startsWith(), endsWith()
    System.out.println(s17.startsWith("Pyt")); // true
    System.out.println(s17.startsWith("P")); // true
    System.out.println(s17.startsWith("Pyl")); // false

    System.out.println(s17.endsWith("Pyt")); // false
    System.out.println(s17.endsWith("on")); // true
    System.out.println(s17.endsWith("")); // true

    // 11. indexOf()
    System.out.println(s17.indexOf("th")); // 2
    System.out.println(s17.indexOf("tha")); // -1 找不到
    System.out.println(s17.indexOf("e")); // -1
    System.out.println(s17.indexOf("")); // 0
    System.out.println(s17.indexOf(" ")); // -1
    System.out.println(s17.indexOf('o', 3)); // 4
    System.err.println(s17.indexOf('n', 3, 4)); // -1

    // lastIndexOf()
    String s20 = "hello world";
    System.out.println(s20.indexOf('l')); // 2
    System.out.println(s20.lastIndexOf('l')); // 9

    // 12. concat()
    String combined = "abc" + "def";
    System.out.println(combined); // abcdef

    String s21 = "abc".concat("def");
    System.out.println(s21); // abcdef
    System.out.println("abcd".concat("ijk").concat("xyz")); // abcdijkxyz

    // 13. equalsISIgnoreCase()
    String student1 = "John";
    String student2 = "john";
    System.out.println(student1.equals(student2)); // false
    System.out.println(student1.equalsIgnoreCase(student2)); // true

    // 14. trim()
    String username = "vincentlau";
    String username2 = "vincentlau ";
    String username3 = "vincent lau ";
    System.out.println(username2.trim());

    System.out.println(username2.trim().length());// 10
    System.out.println(username.trim().length());// 10
    System.out.println(username3.trim().length());// 11

    // 15. compareTo()
    String apple = "apple";
    String banana = "banana";
    System.out.println(apple.compareTo(banana)); // -1 (b-a)

    String cat = "cat";
    System.out.println(cat.compareTo(apple)); // 2 (c-a)

    String boy = "boy";
    System.out.println(boy.compareTo(banana)); // 14 (o-a)
    System.out.println(boy.compareTo(boy)); // 0
    



  }

}
