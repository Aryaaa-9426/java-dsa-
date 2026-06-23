public class array_multiplication { 
    public static void main(String args[]) {
           int [] nums={ 4, 5, 7, 9, 10 } ;// example array
           array_multiplication obj =new array_multiplication();
           int result =obj.maxProduct(nums); 
           System.out.println ("result"+ result);
    }
    public int maxProduct(int[] nums) {
        int smax =-1;
        int max =-1;
    
        for (int i =0; i<nums.length; i++){
            if (max<nums [i]){ 
                smax=max;
                max=nums[i];

            }else if (smax< nums[i]){
                smax=nums[i];
            }
        }

        int ans = (max-1)*(smax-1);
        return ans;
    }
} 
    

