3.2)import java.util.Scanner;
public class Main { 
 
  public static void main(String args[]){
    int array[] = new int[]{11,100,85,74,66,-7,45};
    int max = getMax(array);
    System.out.println("Max:"+max);
    int min = getMin(array);
    System.out.println("Min:"+min);
  }
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}
