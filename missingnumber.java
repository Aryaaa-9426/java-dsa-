public class missingnumber {  
    public static void main (String[] args){
        missingnumber solver =new missingnumber();
        int [] testArray ={ 3,0,1};
        int missing = solver.missingNumber (testArray);
        System.out.println(" the missing number is " + missing);
    }
     public int missingNumber(int[] nums) { 
        int range =nums.length ;
        int actualsum=(range*(range+1))/2 ;
        int currsum=0 ; 
        for (int i=0 ; i< nums.length ; i++){
            currsum = currsum + nums[i];

        }
        int ans = actualsum-currsum;
        return ans ;
        
    }
}
    

