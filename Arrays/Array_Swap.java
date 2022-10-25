import java.util.Random;

public class Array_Swap {
  public static void main(String[] args) {

    int[] A = new int[10];

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int imax = 0, imin = 0, swap;

    Random random = new Random();

    System.out.print("Исходный массив: ");
    for (int i = 0; i < A.length; i++) {
      A[i] = random.nextInt() % 100;
      System.out.print(A[i] + " ");
      if (A[i] < min) {
        min = A[i];
        imin = i;
      }
      if (A[i] > max) {
        max = A[i];
        imax = i;
      }
    }
    System.out.println("\nмаксимальный элемент" + " = " + A[imax]);
    System.out.println("минимальный элемент" + " = " + A[imin]);
    swap = A[imin];
    A[imin] = A[imax];
    A[imax] = swap;
    System.out.print("Массив после обмена: ");
    for (int i = 0; i < A.length; i++)
      System.out.print(A[i] + " ");
  }
}
