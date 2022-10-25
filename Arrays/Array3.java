import java.util.Arrays;

public class Array3 {

  public static void main(String[] args) {
    searchingMax(15);
  }

  static void searchingMax(int num) {
    int[] arr = new int[num];
    for (int i = 0; i < arr.length; i++)
      arr[i] = (int) (Math.random() * 10);
    int max = arr[0];
    System.out.println("Массив: " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++)
      if (arr[i] >= max)
        max = arr[i];
    System.out.println("Наибольшие элементы массива: ");
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == max)
        System.out.println((i + 1) + "-й элемент = " + arr[i]);
  }
}
