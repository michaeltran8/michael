

package examples;
import java.util.Scanner;
import practice.Student;
/**
 * This class is +++ Insert Description +++
*
 * @Michael Tran
 */
public class StudList {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         Student[] s =  new Student[5];
         
         for (int i = 0; i < s.length; i++)
         {
             s[i] = new Student();
             System.out.println("Enter Id");
             s[i].setId(input.nextInt());
             System.out.println("enter name");
             s[i].setName(input.next());
             
         }
         
    }
   
}
