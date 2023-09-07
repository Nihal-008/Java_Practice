import java.util.ArrayList;
import java.util.Scanner;
public class StringCombine {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
ArrayList <String> firstNames = new ArrayList<String>();
System.out.println("Enter the first names");


for(int i=0;i<5;i++){
String fname=sc.nextLine();
firstNames.add(fname);
}
System.out.println("the first names are"+firstNames);
ArrayList <String> lastNames=new ArrayList<String>();
System.out.println("Enter the last names");

for(int j=0;j<5;j++){
  String lname=sc.nextLine();
lastNames.add(lname);
} 
System.out.println("the last names are"+lastNames); 
ArrayList<String> combinedNames = new ArrayList<String>();
for (int i = 0; i < firstNames.size(); i++) {
  String combinedName = firstNames.get(i) + " " + lastNames.get(i);
  combinedNames.add(combinedName);

    System.out.println(firstNames.get(i) + " " + lastNames.get(i));
}


sc.close();
}

    }


