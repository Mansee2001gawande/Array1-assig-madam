/*Q.15 Write a Java program to print the following grid.
Expected Output :
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
*/public class Arrayas15 {
    public static void main(String[] args) {
        int i,j;
        int a[][]=new int[8][8];
        for( i=0;i<8;i++){
            for(j=0;j<8;j++){
                System.out.printf(" - ",a[i][j]);
            }
            System.out.println();
        }
    }
    }/* output  -  -  -  -  -  -  -  - 
                -  -  -  -  -  -  -  -
                -  -  -  -  -  -  -  -
                -  -  -  -  -  -  -  -
                -  -  -  -  -  -  -  -
                -  -  -  -  -  -  -  -
                -  -  -  -  -  -  -  -
                -  -  -  -  -  -  -  -  
                  
                    */
