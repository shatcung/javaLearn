public class M_Arr_Neg_Pos {
  public static void main(String[] args) {
    int[][] array = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        array[i][j] = (int) (Math.random() * (200 + 1)) - 100;
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Номера ячеек, которые содержат отрицательные числа:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (array[i][j] < 0) {
          System.out.print("  " + i + j);
        }
      }
    }
    System.out.println();
  }
}