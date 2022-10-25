public class Dog {
  private int weight; // вес собаки
  private String name; // кличка собаки
  private String color; // окрас собаки
  // собака гуляет

  public void walk() {
    System.out.print("Walk...\n");
  }

  // собака играет
  public void plays() {
    System.out.print("Awwwww\n");
  }

  // собака лает
  public String barking(String words) {
    String phrase = words + "woof-woof\n";
    return phrase;
  }
}
