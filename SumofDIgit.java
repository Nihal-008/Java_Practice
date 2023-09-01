import java.util.Scanner;

class SumofDigit {  
    public static void main(String args[]) {  
        int sum=0;int reverse=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
int num=sc.nextInt();  
while(num!=0){
int rem=num%10;
sum=(sum)+rem;
reverse = reverse*10+rem;
num=num/10;
}
System.out.println("the sum is "+sum);
System.out.println("the reverse is "+reverse);
}  
}  
 