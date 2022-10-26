public class Arr_Div_by_3_6 {
  public static void main(String[] args) {
    int[] myArray = new int[61];
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = i;
    }
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] % 3 == 0 && myArray[i] % 6 == 0)
        System.out.print(myArray[i] + " ");
    }
  }
}