import java.util.Scanner;

public class Harshad{
    public static void main(String []args){
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num=s.nextInt();
       int sum=0,n=num;
       while(n!=0){
        sum+=(n%10);
        n/=10;
       }
       if ((num%sum)==0){
        System.out.println("Harshad number");
       }
       else{
        System.out.println("Not a Harshad number");
       }

    }
}