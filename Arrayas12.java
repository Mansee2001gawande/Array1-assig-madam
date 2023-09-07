/*Q.12 a) Write a statement that declares a string array initialized with the followin
g strings:"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and 
"Saturday".b) Write a loop that displays the contents of each element in the array 
that you declared.*/
public class Arrayas12 {
   public static void main(String[] args) {
    System.out.println("enter days");
    String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};      
           for (String day : days){
       System.out.println(day);
        } 
    }
}
   /* enter days
     Sunday
     Monday
     Tuesday
     Wednesday
     Thursday
     Friday
     Saturday
    */


