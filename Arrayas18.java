//.18 Write a Java program to add two matrices of the same size. 
  class Arrayas18{
    public static void main(String[] args) {
        int no1[][]=new int[][]{{4,5,6},{6,4,5},{5,6,4}};
        int no2[][]=new int[][]{{4,5,6},{6,4,5},{5,6,4}};
        int no3[][]=new int [3][3];
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
            no3[i][j]= no1[i][j]+no2[i][j];
            System.out.println("addition same size array"+(no3[i][j]));
          }
        }
    }
  }   /*output addition same size array8  
               addition same size array10
              addition same size array12
              addition same size array12
              addition same size array8
              addition same size array10
              addition same size array10
              addition same size array12
              addition same size array8     */

