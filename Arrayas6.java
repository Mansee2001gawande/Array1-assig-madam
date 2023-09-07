//6 wap to find and print prime numbers in given array
import java.util.Scanner;
public class Arrayas6{
public static void main (String[] args){
    int[] array = new int [5];
    Scanner Sc = new Scanner (System.in);
    
    System.out.print("Enter the 5 elements of the array: ");
    for(int i=0; i<5; i++)
    {
        array[i] = Sc.nextInt();
    }
    //loop through the numbers one by one
    for(int i=0; i<array.length; i++){
        boolean isPrime = true;
        
        //check to see if the numbers are prime
        for (int j=2; j<array[i]; j++){
            
            if(array[i]%j==0){
                isPrime = false;
                break;
            }
        }
        //print the number
        if(isPrime)
        System.out.println(array[i] + " are the prime numbers in the array ");
    }
}
}
      /*output Enter the 5 elements of the array: 1 2 3 4 5 6 7 8 9 10 11 12 13
       1 are the prime numbers in the array 
       2 are the prime numbers in the array 
       3 are the prime numbers in the array
       5 are the prime numbers in the array  
       */
