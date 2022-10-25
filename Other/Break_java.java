public class Break_java {
  public static void main(String[] args) {
    int sum = 0, count = 0;
    for (int i = sum; i >= -99; i -= 5) {
      sum = i;
      ++count;
      if (count == 11)
        break;
      System.out.print(sum + " ");
    }
  }
}