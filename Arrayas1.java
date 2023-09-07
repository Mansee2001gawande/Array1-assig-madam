//wap to define an array of integer of size 6 .Take input from user and display it 
//in reverse 
import java.util.Scanner;
public class Arrayas1 { 
public static void main(String[] args) {
    int a[] =new int[10];
    int i;
   Scanner sc=new Scanner(System.in);
   for(i=0;i<6;i++){
    System.out.print("enter a no:=");
    a[i]=sc.nextInt(); 
   }
   for(i=6;i>=0;i--){
    System.out.println (" "+a[i]);
   }
}  
}
