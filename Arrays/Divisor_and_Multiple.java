public class Divisor_and_Multiple {
  public static void main(String[] args) {
    int a = 12, b = 8, x, y;
    x = a;
    y = b;
    while (a != 0 && b != 0) {
      if (a > b)
        a = a % b;
      else
        b = b % a;
    }
    System.out.println("Div = " + (a + b));
    System.out.println("Mul = " + (((x * y) / (a + b))));
  }
}