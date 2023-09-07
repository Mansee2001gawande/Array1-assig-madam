/*Q.11 There are two arrays object one containing 100 elements and another
containing 50 elements. Both are of same data type. Can we assign one Array to 
another Array */
import java.util.Scanner;
public class Arrayas11 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter A element");
    int i,j;
    int []a =new int[100];
    int []b=new int[50];
    a=b;
for( i=0;i<100;i++){
   a[i]=sc.nextInt();
   }
   System.out.println("enter B element");
   for( j=0;j<50;j++){
      b[j]=sc.nextInt();
   }
   System.out.print(" "+a[i]);
   System.out.print(" "+b[j]);
   System.out.println();
   b=a;
   System.out.print(" "+a[i]);
   System.out.print(" "+b[i]);
   System.out.println();
}

 }   

