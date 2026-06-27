public class largestnumber { 
    public static void main(String[] args) {
         largestnumber obj = new largestnumber();
         int [] testArray={3,6,1,0} ;
         int result = obj.dominantIndex(testArray);
         System.out.println("the dominant index is :" + result);
       }
    
    public int dominantIndex(int[] nums) {
       int smax=-1;
       int max=-1;
       int maxIdx=0;
        for (int i =0; i<nums.length ; i++){
            if (max < nums[i]){
                smax=max;
                max=nums[i];
                maxIdx=i;
            }else if (smax<nums[i]){
                smax=nums[i];
            }
        } 
        if (smax*2<=max){
            return maxIdx;

        } else{
            return -1;
        }
    }
}
