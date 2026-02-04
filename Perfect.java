import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args){
      System.out.print("Enter the number :");
      Scanner s=new Scanner(System.in);
   int x=s.nextInt();
   if (x>0){


   int num=(int) Math.sqrt(x);
   if((num*num)==x){
    System.out.println("Perfect square");
   }
   else{
     System.out.println("not a Perfect square");
   }
   }

    }
    }