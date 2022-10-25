public class MinMaxValue {
  public static void main(String[] args) {
    int a = 4, b = 10, c = 8, d = 2, e = 5;
    int min, max;

    if (a < b && a < c && a < d && a < e)
      min = a;
    else if (b < a && b < c && b < d && b < e)
      min = b;
    else if (c < a && c < b && c < d && c < e)
      min = c;
    else if (d < a && d < b && d < c && d < e)
      min = d;
    else
      min = e;
    System.out.println("min = " + min);

    if (a > b && a > c && a > d && a > e)
      max = a;
    else if (b > a && b > c && b > d && b > e)
      max = b;
    else if (c > a && c > b && c > d && c > e)
      max = c;
    else if (d > a && d > b && d > c && d > e)
      max = d;
    else
      max = e;
    System.out.println("max = " + max);
  }
}