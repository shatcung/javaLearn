public class HelloWorld {
  public static void main(String[] args) {
    Dog ourdog = new Dog();
    ourdog.walk();
    ourdog.plays();
    String say = ourdog.barking("Play with me ");
    System.out.println(say);
  }
}
