public class M_Arr_Asc_Sort {
  public static void main(String[] args) {
    int b;
    int[][] array = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        array[i][j] = (int) (Math.random() * (200 + 1)) - 100;
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = j + 1; k < 3; k++) {
          if (array[i][j] > array[i][k]) {
            b = array[i][j];
            array[i][j] = array[i][k];
            array[i][k] = b;
          }
        }
      }
    }
    System.out.println();
    System.out.println("Отсортированные строки массива:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
