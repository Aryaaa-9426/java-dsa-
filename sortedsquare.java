public class sortedsquare { 
    public static void main(String[] args) {
        sortedsquare solver = new sortedsquare();
        int []nums ={ -4,-1,0,3,10};
        int [] result =solver.sortedSquares(nums);
        System.out.println("sorted squares: " + java.util.Arrays.toString(result));
    }
    public int[] sortedSquares(int[] nums) {  
        int [] ans = new int [nums.length ];
        int st =0;
        int end = nums.length -1;
        int ptr = nums.length -1;
        while(st<=end){
            int ss =nums[st]*nums[st];
            int es=nums[end]*nums[end];
            if (ss>es){
                ans[ptr]=ss;
                st++;
            }else {
                ans[ptr]=es;
                end-- ;
                
            }
            ptr--;


            } 
            return ans;
            
         }    
    }

    

