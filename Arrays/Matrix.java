import java.util.Arrays;
import java.util.Random;

public class Matrix {
  public static void main(String[] args) {
    int[][] matrixC = new int[3][3];
    int[][] matrixD = new int[3][3];
    int[][] matrixAddCD = new int[3][3];
    int[][] matrixMulCD = new int[3][3];

    int i = 0, j = 0, u = 0;

    System.out.println("Матрица С:");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        matrixC[i][j] = (int) (Math.random() * 99);
        System.out.print(matrixC[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Матрица D:");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        matrixD[i][j] = (int) (Math.random() * 99);
        System.out.print(matrixD[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Сумма матриц C и D:");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        matrixAddCD[i][j] = matrixC[i][j] + matrixD[i][j];
        System.out.print(matrixAddCD[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Умножение матриц C и D:");
    for (i = 0; i < 3; i++) {
      for (u = 0; u < 3; u++) {
        for (j = 0; j < 3; j++) {
          matrixMulCD[i][u] += matrixC[i][j] * matrixD[j][u];
        }
      }
    }
    for (i = 0; i < 3; i++)// Вывод 3й матрицы
    {
      for (j = 0; j < 3; j++) {
        System.out.print(matrixMulCD[i][j] + "\t");
      }
      System.out.println();
    }
  }
}