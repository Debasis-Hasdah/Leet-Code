public class practic {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] brr=new int[arr.length]; 
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            brr[j]=arr[i];
            j++;
        }

        for(int a:brr){
            System.out.print(a+" ");
        }
    }
}
