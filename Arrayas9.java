//9.Initialize and print all elements of a 2D array.
class Arrayas9{
    public static void main(String[] args) {
        int s=2,c=2,i,j;
        int a[][] =new int[s][c];

        for(i=0;i<s;i++){
            for(j=0;j<c;j++){
                a[i][j]=i+j;
            }
        }
        System.out.println("1st three s are");
        for(i=0;i<2;i++){
            for(j=0;j<c;j++){
                System.out.printf(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
      /*output 1st three s are
             0 1 2 3 4 
             1 2 3 4 5 */