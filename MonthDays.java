import java.util.Scanner;

class MonthDays{
    public static void main(String args[]) {  

   Scanner sc = new Scanner(System.in);

System.out.println("Enter the year");
int year = sc.nextInt();
sc.nextLine();
System.out.println("Enter the month");
String month= sc.nextLine();   
int days;

switch(month){
case "jan": days=31;
break;
case "feb":
if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
days=29;
else
days=28;
break;
case "mar":days=31;
break;
case "april":days=30;
break;
case "may":days=31;
break;
case "june":days=30;
break;
case "july":days=31;
break;
case "aug":days=31;
break;
case "sept":days=30;
break;
case "oct":days=31;
break;
case "nov":days=30;
break;
case "dec":days=31;
break;
default:
    System.out.println("Invalid month input");
      return;
}
System.out.println("the days for the"+ month +"are" + days);

    }
}