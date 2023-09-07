/*10.Take 20 integer inputs from user and print the following:
 number of positive numbers
 number of negative numbers
 number of odd numbers
 number of even numbers */

import java.util.Scanner;
public class Arrayas10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //int no[]=new int[20] ;
      int i,pos=0,neg=0,even=0,odd=0,j,no;
      for(i=1;i<=20;i++){
        System.out.println("enter a no");
        no=sc.nextInt();
        if(no>0)
        pos++;
        if(no<0)
        neg++;
        if(no%2==0)
        even++;
        if(no%2!=0)
        odd++; }
        System.out.println("no positive="+pos);
        System.out.println("no negative="+neg);
        System.out.println("no even="+even);
        System.out.println("no odd="+odd);
    }
  }
/*output enter 20  no
        1,2,3,4,5,6,7,8,9,10
        11,12,13,14,15,16,17,19,20
         no positive=20
         no negative=0
         no even=10
         no odd=10
 */