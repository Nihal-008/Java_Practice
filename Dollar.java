import java.util.Scanner;

class Dollar {  
    public static void main(String args[]) {  
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the money in dollar");
     double dollar = sc.nextDouble();
       double rupee = 82.65 * dollar;
      System.out.println("Rupees are: " + rupee);
    }
}
