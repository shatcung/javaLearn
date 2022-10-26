public class Arr_AVG {
  public static void main(String[] args) {
    int a = 0;
    double av;
    int[] myArray = new int[15];
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = i;
      System.out.print(myArray[i] + " ");
    }
    System.out.println();
    System.out.println();
    for (int i = 0; i < myArray.length; i++) {
      a += myArray[i];
    }
    av = a / myArray.length;
    System.out.print(av);
  }
}