import java.util.Scanner;
public class Friendly{
    public static  int Factors(int num){
        int sum=0;
        for (int i=1;i<num;i++){
            if((num%i)==0){
                sum+=i;
            }
        }
     return sum;
        
    }
    public static void main(String []args){ 
    System.out.print("Enter the number :");
    Scanner s=new Scanner(System.in);
    int num1=s.nextInt();
    System.out.print("Enter the number :");
    int num2=s.nextInt();
    int result1=( (Factors(num1)/ num1));
    int result2=((Factors(num2)/num2));
    if(result1==result2){
        System.out.println("friendly pair ");

    }else{
         System.out.println("Not a friendly pair");
    }

    }
}