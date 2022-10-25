public class Namesake {
  public static void main(String[] args) {
    String str1 = new String("Anton");
    String str2 = new String("Anton");
    boolean b = str1.equals(str2);
    if (b == true)
      System.out.print("Люди являются тезками");
    else
      System.out.print("Люди не являются тезками");
  }

}