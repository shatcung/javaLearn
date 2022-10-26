public class M_Arrays_SUM {
  public static void main(String[] args) {
    int[][] array = new int[3][3];
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        array[i][j] = (int) (Math.random() * 99);
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        sum += array[i][j];
      }
    }
    System.out.println("Сумма всех элементов двумерного массива = " + sum);
  }
}