//Q13. Write a program to array elements to print sum of Cubic Values
import java.util.Scanner;
public class Arrayas13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter an element");
            int f = sc.nextInt();
        int num[] = new int[f];
        int i, sum = 0;
    System.out.println("Enter numbers");
    for(i=0; i<f; i++){
    num[i]=sc.nextInt();
    }
    for(int c:num){
    sum = sum + (c*c*c);
    }
    System.out.println("Sum Cubic Elements"+sum);
    }
}
/* output enter an element
           1
           enter an element
           2
           Sum Cubic Elements8
*/
    
    

