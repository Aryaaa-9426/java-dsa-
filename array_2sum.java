import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class array_2sum { 
    public static void main(String[] args) { 
        array_2sum obj =new array_2sum();
        int[]num ={ 1,2,0,0} ;
        int k =64;
        List <Integer>result=obj.addToArrayForm(num,k);
        System.out.println(result);
        
    } 
    public List<Integer> addToArrayForm(int[] num, int k) { 
        List <Integer>ans = new ArrayList<>();
        int p =num.length-1;
        int carry = 0 ;
        while (p>=0||k>0){
            int numval = 0;
            if (p>=0){
                numval=num[p];
            }
            int d = k%10 ;
            int sum = numval + d +carry;
            int digit =sum%10;
            carry=sum/10;
            ans.add(digit);
            p--;
            k=k/10; 
            } 
            if (carry>0){
                ans.add(carry);
            
            }
            Collections.reverse(ans);
          return ans;  
        }
       
        
    }


