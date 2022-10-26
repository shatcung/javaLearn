public class Cone_Vol {
  public static void main(String[] args) {
    double r = 12, h = 8, V = 0;
    V = (h / 3) * Math.PI * Math.pow(r, 2);
    System.out.println("Объем конуса = " + V);
  }
}