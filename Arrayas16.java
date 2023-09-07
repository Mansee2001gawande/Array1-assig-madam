//Q.16 Write a Java program to calculate the average value of array elements.
import java.util.Scanner;
public class Arrayas16 {
    public static void main(String[] args) {
        int size,sum=0,i;
        float ave;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the all elements");
        for(i=0;i<size;i++){
        a[i]=sc.nextInt();
        sum=sum+a[i];
        }
        System.out.print("sum = "+sum);
        ave=(float)sum/size;
        System.out.println("average"+ave);
    }
}
 /*output enter elements 4 
        enter the all elements 5,6,7
        sum = 26average6.5
        */