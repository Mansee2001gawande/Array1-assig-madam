//4 wap to print max and minimum value in given array.
import java.util.Scanner;
public class Arrayas4 {
    public static void main(String[] args) {
        int a[]={4,6,8,9,2};
        int max,min,i;
        Scanner Sc=new Scanner(System.in);
        for(i=0;i>5;i++){
            System.out.println((a[i]));
        }
            min= a[0];
            max =a[0];
   
        for(i=0;i<5;i++){
           if(a[i]>max){
            max=a[i]; 
           }
           else if (a[i]>min){
            min=a[i];
        }
         }
        
        {
    System.out.print ("min=" +min);
    System.out.print ("max=" +max);
        }
    }
}            
            /*output min=4max=9*/