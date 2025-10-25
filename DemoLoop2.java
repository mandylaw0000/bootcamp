import java.math.BigDecimal;

public class DemoLoop2 {
  public static void main(String[] args) {
    // basic
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // while loop
    int counter = 0;
    while (counter < 5) {
      System.out.println(counter);
      counter++;
    }

    // Array
    double[] amounts = new double[4];
    amounts[0] = 10.5;
    amounts[1] = 100.9;
    amounts[2] = 24.222;
    amounts[3] = 1010.9;

    // for-each loop // (a simply persentatio of loop)
    for (double x : amounts) { // ! x is a copy of the amount
      System.out.println(x);// read operation
      // x = 100 // ! wrong idea of write operation

    }
    // basic // write array (萬能)
    for (int i = 0; i < amounts.length; i++) {
      System.out.println(amounts[i]);// read operation
      // amounts[i] = 100; ok
      // System.out.println(amounts[i]);
    }
    // ! sum up values (Important)
    double total = 0.0;
    for (double amount : amounts) {
      total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(amount))
          .doubleValue();
    }
    System.out.println("total = " + total);
  }
}
