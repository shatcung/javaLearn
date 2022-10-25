public class Months {
  public static void main(String[] args) {
   
    String month;
    int value = 2;
    switch (value) {
      case 1:
        month = "Зима";
        break;
      case 2:
        month = "Весна";
        break;
      case 3:
        month = "Лето";
        break;
      case 4:
        month = "Осень";
        break;
      default:
        month = "Ошибка";
        break;
    }
    System.out.print(month);
  }
}