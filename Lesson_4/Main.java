
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    /*
     * 
     * Sytax of the id statments:
     * 
     * if (boolean expersion True ot False ){
     * //do this if True
     * }else{
     * // do this if False
     * }
     * 
     */
    Scanner scanner = new Scanner(System.in);
    boolean goal = true;
    if (goal) {
      System.out.println("Well done rest soldier");
    } else {
      System.out.println("What ya waiting for hustel hard boy.");
    }

    int salary = 23000;

    if (salary > 10000) {
      salary += 2000;
    } else {
      salary += 4000;
    }

    System.out.println(salary);
  }
}
