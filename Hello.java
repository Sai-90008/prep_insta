
class Hello
{
    public static int isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return 0;
            }

        }
        return 1;
    }
    public static void primeFactor(int num)
    {  for(int i=2;i<=num;i++){
        if(isPrime(i)==1)
        
        {  int x=num;
          while(x%i==0){
            System.out.print(i+" ");
            x/=i;
          }
        }
    }
       
    }
    public static void main(String[] args) {
       int n=50;
       primeFactor(n); 
    }
    
    
    }

