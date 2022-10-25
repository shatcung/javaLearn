public class Bubble {
  public static void bubbleSort(int[] arr) {
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] < arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = new int[20];
    System.out.print("\nBefore Bubble sort\n");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 1000);
      System.out.print(arr[i] + "  ");
    }
    System.out.print("\nAfter Bubble sort\n");
    bubbleSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
  }
}
