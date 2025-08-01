// Last updated: 8/1/2025, 2:41:20 PM
class Solution {
    public int fib(int n) {
        int ans = fibo(n);
        System.out.println(ans);
        return ans;        
    }
        private static int fibo(int n){
            if (n==0|| n==1){
                return n;
            }
            int sp1= fibo(n-1);
            int sp2= fibo(n-2);
            int bp = sp1+sp2;
            return bp;
   }
}

//public class Recursion{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int ans = fibo(n);
//        System.out.println(ans);
//    }
//        private static int fibo(int n){
//        if (n==0|| n==1){
//            return n;
//        }
//        int sp1= fibo(n-1);
//        int sp2= fibo(n-2);
//        int bp = sp1+sp2;
//        return bp;
//    }
//}