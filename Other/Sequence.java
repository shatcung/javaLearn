public class Sequence {
  public static void main(String[] args) {
    int i = 0, ch = 1;
    do {
      System.out.print(i + " ");
      i = i - 4;
      i--;
      ++ch;
    } while (ch <= 10);
  }
}