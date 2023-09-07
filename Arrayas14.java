//Q.14 Write a program in to array size to be user input print it
import java.util.Scanner;
public class Arrayas14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("enter an element string");
        int a=sc.nextInt();
        String faltu[]=new String[a];
        System.out.println("enetr special element");
        for(i=0;i<a;i++){
            faltu[i]= sc.next();
        }
        for(i=0;i<a;i++){
            System.out.println("Special name is="+faltu[i]);
        }
    }
    }        /* enter an element string
            3
            enetr special element
             4
             5
             6
             Special name is=4
             Special name is=5
             Special name is=6*/
