import java.util.Arrays;

public class AVG {
  public static void main(String[] args) {
    int[] mas = new int[5];
    for (int i = 0; i < 5; i++) {
      mas[i] = (int) (Math.random() * 6);
    }
    System.out.println("Массив: " + Arrays.toString(mas));
    double av = 0;
    for (int i = 0; i < 5; i++) {
      av += mas[i];
    }
    av /= 5;
    System.out.println("Среднее арифметическое всех элементов массива = " + av);
  }
}
