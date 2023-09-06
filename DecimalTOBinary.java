import java.util.Scanner;

 class DecimalTOBinary {
    public static void main(String args[]){
        int rem;int reverse=0;int binary=0;;
        Scanner sc = new Scanner(System.in);    
     System.out.println("Enter the number");
     int num=sc.nextInt();  
while(num!=0){
rem=num%2;
reverse=reverse*10+rem;
num=num/2;
}
while(reverse!=0){
    int remn=reverse%10;
   
    binary = binary*10+remn;
    reverse=reverse/10;
    }
System.out.println("the number is binary is"+binary);
}
 }