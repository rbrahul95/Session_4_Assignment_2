


//Assignment – Sort an array and insert an element inside it.



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


class Sortedarray {
// this will print the array
public static void printArray( int array[]) {
		   
		     System.out.println("length of array " + array.length );
		      for (int i = 0; i < array.length; i++) {
		         if (i != 0){
		            System.out.print(", ");
		         }
		         System.out.print(array[i]);         
		      }
		      System.out.println();
		   }

// this will insert element in array
		   public static int[] insertElement(int original[],
		   int element, int index) {
		      int length = original.length;
		      int destination[] = new int[length + 1];
		      System.arraycopy(original, 0, destination, 0, index);
		      destination[index] = element;
		      System.arraycopy(original, index, destination, index
		      + 1, length - index);
		      return destination;
		   }
                   

}
public class Session_4_Assignment_2 {
  
		      public static void main(String args[]) {
                        
		      int array[] = { -11,5,-8,-15,3,10,-5,5 }; // array  
                     
                      Sortedarray obj=new Sortedarray(); //class object
		      Arrays.sort(array);         // sort the given array
		      obj.printArray(array);System.out.println("Given array sorted \n");      // printing sorted given array  
		      int pos = 3;                 // position where we want to add element into the array
		      int newpos = pos - 1;
		      array = obj.insertElement(array, 99, newpos);  // element inserted 
                       obj.printArray(array);  System.out.println(" element inserted array \n");   // printing array after edited
                       Arrays.sort(array);         // again sorting edited array
                        obj.printArray(array);    System.out.println("edited array sorted \n");   // printing sorted edited array
		   }
                   
                                     
		}
		
		
/* Output : 
length of array 8
-15, -11, -8, -5, 3, 5, 5, 10
Given array sorted 

length of array 9
-15, -11, 99, -8, -5, 3, 5, 5, 10
 element inserted array 

length of array 9
-15, -11, -8, -5, 3, 5, 5, 10, 99
edited array sorted    */
