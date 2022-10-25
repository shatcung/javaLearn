import java.util.Arrays;
import java.util.Collections;

public class Sort_by_ascending_descending {
    public static void main(String[] args){
      String[] car = new String[] {"BMW", "AUDI", "VOLKSWAGEN", "MAZDA", "RENAULT", "SKODA"}; 
      System.out.print("\nSort by ascending\n");
      ascending(car);
      System.out.print("\nSort by descending\n");
      descending(car);
    }
  
    public static void ascending(String[] car){  
      Arrays.sort(car);
        for(int i = 0; i <  car.length; i++) 
        System.out.print(car[i] + "  ");
    }
  
   public static void descending(String[] car){
      Arrays.sort(car, Collections.reverseOrder());
        for(int i = 0; i <  car.length; i++) 
        System.out.print(car[i] + "  "); 
  }
}


