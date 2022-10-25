public class MaxValue {
  public static void main(String[] args) {
    int a = 1, b = 8, c = 8, d = 5;
    int min = a, max = a, kol = 0;

    if (min >= d)
      min = d;
    if (max <= b) {
      max = b;
      kol = kol + 1;
    }
    if (max <= c) {
      max = c;
      kol = kol + 1;
    }
    if (max <= d) {
      max = d;
      kol = kol + 1;
    }
    System.out.println("Количество максимальных чисел = " + kol);
  }

}