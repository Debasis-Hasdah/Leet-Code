public class FractionTrouble{
    class Solution {
    
        private int gcd(int a, int b){
            return b== 0 ? a : gcd(b, a%b);
        }
        public int[] LargestFraction(int n, int d) {
            // code here
            int bestNum=-1, bestDen=1;
            int k=10000;
            
            for(int q=1; q<=k; q++){
                int p= (n * q - 1)/d;
                if(p>=0){
                if((long)p*bestDen > (long)bestNum*q){
                    bestNum=p;
                    bestDen=q;
                }
            }
            }
            int g= gcd(bestNum,bestDen);
            return new int[]{bestNum/g ,bestDen/g };
        }
    }
    
}