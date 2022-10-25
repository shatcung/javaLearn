import java.util.Arrays;

public class Array2 {

  public static void main(String[] args) {
    searchingMin(15);
  }

  static void searchingMin(int num) {
    int[] arr = new int[num];
    for (int i = 0; i < arr.length; i++)
      arr[i] = (int) (Math.random() * 10);
    int min = arr[0];
    System.out.println("Массив: " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++)
      if (arr[i] <= min)
        min = arr[i];
    System.out.println("Наименьшие элементы массива: ");
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == min)
        System.out.println((i + 1) + "-й элемент = " + arr[i]);
  }
}