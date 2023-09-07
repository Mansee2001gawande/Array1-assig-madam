//Q.17 Write a Java program to find duplicate values in an array of string values.
public class Arrayas17 {
    public static void main(String[] args) {
        int i,j;
        String name []= new String []{"peru","mansi","pranali","vaishu","mansi","peru"};
        //System.out.print("enter duplicity string");
        for(i=0; i<6-1; i++){
            for(j=i+1; j<6; j++){
                if((name[i]==(name[j]))  && (i!=j)) {
                    System.out.println(name[j]+" [dupllicasy found...] ");
                }
            }
        }
    }
          /*output peru [dupllicasy found...] 
                   mansi [dupllicasy found...] */
}
