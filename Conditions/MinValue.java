public class MinValue {
  public static void main(String[] args) {
    int a = 1, b = 8, c = 8, d = 5;
    int rez;

    if (a < b && a < c && a < d)
      rez = a;
    else if (b < a && b < c && b < d)
      rez = b;
    else if (c < a && c < b && c < d)
      rez = c;
    else
      rez = d;
    System.out.println(rez);
  }

}