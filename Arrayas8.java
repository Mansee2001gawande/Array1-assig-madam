//8.Write a program to find the sum and product of all elements of an array.
public class Arrayas8 {
    public static void main(String[] args) {
        int a[]= new int []{1,2,3,4,5,6};
        int i, sum=0;
        for(i=0;i<6;i++){
            sum=sum+a[i];
        }
         System.out.print("sum="+sum);
    }
}
    /*output sum=21 */
