

 public class palindromenumber {
    public static void main(String[] args) {
    int x=121;
    if(isPalindrome(x)){
    System.out.println("isPalindrome");
} else {
    System.out.println("is not Palindrome");
 }}
  public static  boolean isPalindrome(int x) {


        if (x<0){ 
            return false;
        }
        int n=x;
        int  revnum=0;
        while (n>0){
            int d= n%10;
            revnum =revnum*10+d;
            n=n/10;
        }
        return x == revnum;
  }
 }

