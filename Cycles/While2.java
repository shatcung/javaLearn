public class While2 {
  public static void main(String[] args) {
    int i = 1, n = 6, f = 1;
    while (i <= n) {
      f = f * i;
      i++;
    }
    System.out.print(f);
  }
}