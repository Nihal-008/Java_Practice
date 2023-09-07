import java.util.Scanner;

 class BinarySearchArray {
  
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in); 
            System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] numArray=new int[size];

    System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
    
        numArray[i]=sc.nextInt();
        }
       System.out.println("Enter element to search for");
       int numFind= sc.nextInt();
       int index = linearSearch(numArray,numFind);
       if(index!=-1){
        System.out.println("Element "+numFind+" found and its index is "+ index);
       }else{
        System.out.println("Element"+numFind+"not found");
       }
       sc.close();
    }
   
    public static int linearSearch(int[] numArray,int numFind){
        for(int i=0;i<numArray.length;i++)
        {
        if(numArray[i]==numFind){
            return i;

        }
    }
    return -1;
    
}

 }