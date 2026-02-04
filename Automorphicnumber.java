import java.util.Scanner;

class Automorphicnumber{
    
    public static void main(String []args){
 System.out.print("Enter the number :");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sqr=n*n;
    
    if((sqr%10)==(n%10)){
        System.out.println("NUM:"+n+" Square: "+sqr+" - is automorphic ");

    }else{
    System.out.println("NUM:"+n+" Square: "+sqr+" - is not automorphic ");
    }
    }
    

}