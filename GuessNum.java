import java.util.Random;
import java.util.Scanner;

class GuessNum {
    public static void main(String args[]){
        Random random=new Random();
        int num =random.nextInt(100);
        System.out.println(num);
        int attempt=1;int max_tries=5;
Scanner sc = new Scanner(System.in);
while(attempt<=max_tries){
System.out.println("attempt no "+attempt+" Enter the number in 1 to 100 to guess");

int gnum=sc.nextInt();

if(gnum>num && gnum<100){
System.out.println("number is higher,try again");
}
else if(gnum<num && gnum>0){
System.out.println("the number is lesser,try again");
}
else if(gnum==num){
System.out.println("Suceess,you guessed the number correctly ");

break;

}
 else {
    
    System.out.println("Invalid input. Enter a number between 1 and 100.");
}
attempt++;
}
if(attempt ==max_tries)
System.out.println("better luck next time");
sc.close();
    }
}
