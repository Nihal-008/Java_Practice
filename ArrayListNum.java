import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNum {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        System.out.println("the numbers before reverse"+numbers);
        System.out.println("the numbers after reverse");
        for(int i=numbers.size()-1;i>=0;i--){
            System.out.print(numbers.get(i));
        }
        scanner.close();
    }
}
