import java.util.Scanner;
class StrongNumber{
   public static int strong(int num){
    int sum=0,rem;
    while(num!=0){
        rem=num%10;
        int fact=1;
        for(int i=1;i<=rem;i++){
             fact*=i;
            
        }
        sum+=fact;
        num=num/10;
      
    }
    return sum;
}
   public static void main(String [] args){
    System.out.print("Enter the number: ");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int result=strong(num);
     
    if (result==num){
        System.out.println("Yes,It's a strong number");
        
    }
    else{
        System.out.println("No,It's not a strong number");
    }


   }

}