//3 wap to define an array of integer and assign value in program and print sum 
//of all values
import java.util.Scanner;
public class Arrayas3 {
  public static void main(String[] args) {
    int a[]=new int[5];
    int i,sum=0;
    Scanner sc=new Scanner(System.in);
    for(i=0;i<5;i++){
        System.out.print("enter any 5 no");
        a[i]=sc.nextInt();
    }
    for(i=0;i<5;i++){
    System.out.println("" +a[i]);
    }
     for(i=0;i<5;i++){
        sum=sum+a[i];
     }
        System.out.println("sum"+sum);
      }  
}      /*output enter any 5 no 1 2 3 4 5
               sum=15           */ 
