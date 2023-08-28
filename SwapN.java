class SwapN {
    public static void main(String[] args) {
        int num1=3;
       int num2=6;

  System.out.println("the two numbers before swapping are" + "num1="+num1+"and" + "num2="+num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
 System.out.println("the two numbers after swapping are" +  "num1="+num1+"and" + "num2="+num2);
    }
}