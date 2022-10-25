public class Array1  {
  public static void main(String[] args) {
    int[] myArray = new int[20];
    for (int i = 0; i < 20; i++) {
      myArray[i] = i;
    }
    for (int i = 0; i < 20; i++) {
      if (myArray[i] % 2 != 0)
        System.out.print(myArray[i] + ", ");
    }
  }
}