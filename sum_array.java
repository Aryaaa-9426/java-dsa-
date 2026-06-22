public class sum_array { 
    public static void main(String[] args) { 
        sum_array sol =new sum_array();
        int[]nums = {2,7,11,15}; 
        int target =9;
        int[]result =sol.twoSum(nums , target);
        System.out.println(result [0] + "" + result[1]);
        
    } 
    public int[] twoSum(int[] nums, int target) {
       int [] ans = new int [2];
       for (  int i =0 ; i < nums.length ; i++){
        for ( int j =i +1 ; j< nums.length ; j++){
            if (nums [i] + nums [j]==target ){
                ans[0] =i;
                ans[1]=j;
                break;
            }
        }
       }

       
       return ans;

        
    }
}

