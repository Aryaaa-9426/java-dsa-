class Solution {
    public static boolean isPowerOfTwo(int n) {
        if (n<1){
            return false;
        }else if (n==1){
            return true;
        } else {
            while(n%2==0){
                n=n/2; }

            if (n==1){ 
                return true;
            } else{
                return false;
            
            }
         }
    }

public static void main(String[] args) {
    int n=16;
    if (isPowerOfTwo(n)) {
    System.out.println("isPowerOfTwo(" + n + "): " + isPowerOfTwo(n));
} else {
    System.out.println(n + " is not a power of two.");
}
}

