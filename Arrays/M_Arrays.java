import java.util.Arrays;
import java.util.Random;

public class M_Arrays {
  public static void main(String[] args){
    int[][] multiDimArray = new int[5][6];
    int i=0,j=0;
    for (i=0;i<5;i++){
      for(j=0;j<6;j++){
        multiDimArray[i][j] =(int) (Math.random()*99);
        if (i==2) 
        System.out.print(multiDimArray[i][j] + "\t"); }
      }
    System.out.println(); 
    }
}