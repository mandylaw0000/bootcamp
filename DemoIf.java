public class DemoIf {
  public static void main(String[] args) {
    int x = 3;
    if (x > 10) {
      System.out.println("Hello");
    } else {
      System.out.println("Goodbye");
    }

    if (x >= 4) {
      System.out.println("x is larger than 4");// skip
    }

    // AND OR
    int y = 10;
    if (x > 2 && y < 20) { // true && true --> true
      System.out.println("hello");
    }

    if (x > 20 && y > 20) {
      System.out.println("Yes");
    } else {
      System.out.println("no");
    }

    // Example: max, min
    int num1 = 100;
    int num2 = 12;
    int max = num1;
    int min = num2;
    if (num1 > num2) {
      max = num1;
      min = num2;
    } else {
      max = num2;
      min = num1;
    }
    System.out.println("max = " + max + ", min = " + min);
   
    // if-else, if-else
    // score >= 90, Grade A
    // score >= 80, Grade B
    // score >= 70, Grade C
    // score < 70, Fail

    int score = 73;
    char grade = 'F';
    if (score >= 90){
      grade = 'A';
    }else if (score >=80 && score < 90){ 
      // else if (score >=80){ over lapped //! 新手不要重疊
      grade = 'B';
    }else if (score >= 70 ){
       grade = 'C';
    }else  {
      grade = 'F';
    }
    System.out.println("Grade = " + grade);
  }
}
