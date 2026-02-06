import java.util.Scanner;
public class Abundant{
    public  int SumFactor(int num){
        int sum=0;
        for(int i=1;i<num;i++){
                  if((num%i)==0){
                    sum+=i;
                  }
         
        }
        return sum;
    }
    public static void main(String []args){
         System.out.print("Enter the number : ");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    Abundant ab=new Abundant();
    int result =ab.SumFactor(num);
    if (num<result) {
        System.out.println(num+" Abundant number");
        
    }
    else{
        System.out.println(num+" Is not a abundant number");

    }

    }
}