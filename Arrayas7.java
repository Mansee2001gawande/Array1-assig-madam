//7 wap to search a particular number in given array and print its position
import java.util.Scanner;
public class Arrayas7 {
    public static void main(String[] args) {
        int i,j,f=0;
        int a[] = new int []{1,2,3,4,5,6};
        Scanner Sc = new Scanner (System.in);

           for( i=0; i<=4; i++){
            System.out.println("enter a no for search");
            a[i]=Sc.nextInt(); }

            for(j=0;j<5;j++){
                if(a[i]==a[j]){
                f=1;
                break;
                }
            }
            if(f==0)
                System.out.println("element is found");
                else 
                    System.out.println("element is not found");
                 }
                }
          /* output enter a no for search
                    1
                    enter a no for search
                    2
                    enter a no for search
                    3
                    enter a no for search
                    4
                    enter a no for search
                    5
                    element is found */

