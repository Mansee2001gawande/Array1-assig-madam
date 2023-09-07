//5 wap to find and print even numbers in given array
import java.util.Scanner;
public class Arrayas5 {
    public static void main(String[] args) {
    int a[]=new int[2];

    int i,c=0;
    Scanner sc=new Scanner(System.in);
    for(i=0;i<2;i++) {
    System.out.print ("enter a no =");
    a[i]=sc.nextInt(); 
    }

    for(i=0;i<2;i++) {
    if (a[i]%2!=0){
    System.out.println(a[i]+"odd numbers");
     } 
    }       

    for(i=0;i<2;i++) {
        if(a[i]%2==0) {
    System.out.print(a[i]+"even no ");
    }
}
}
}
/*output enter a no =5
        enter a no =6
        5odd numbers
        6even no */