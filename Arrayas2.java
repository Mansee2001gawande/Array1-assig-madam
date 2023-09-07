// 2 wap to ask 5 no from user and check if particular name exists in array or not .
import java.util.Scanner;
public class Arrayas2 {
    public static void main(String[] args) {
        int no [] = new int [5]; 
        int i,found = 0,x;
        Scanner sc =new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.print("enter any number");
            no[i]=sc.nextInt();
        }
         for(i=0;i<5;i++){
        System.out.println(" "+no[i]);
         }
         System.out.println("enter search no");
          x=sc.nextInt();
        for(i=0;i<5;i++){
            if(x == no[i]){
                found=1;
                break;
            } }
            if(found==1){
                System.out.print("found");
            } else
            System.out.print(" not found");
             }
    }
/*         output enter any number 3 4 5 6 7    
            enter search no 5
            found
*/

