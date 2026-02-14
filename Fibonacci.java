class Fibonacci {
public static void main(String[] args) {
    int n=3;
      int a=0;
        int b=1;
        int sum=0;
        int i=1;
        if(n==1){
            System.out.println(sum);
        }
        else if(n==2){
            System.out.println(sum);
        }

        else{
            while(i<n){
            sum=a+b;
            a=b;
            b=sum;
            i++;
            }
        }
        System.out.println( sum);
}
    
}