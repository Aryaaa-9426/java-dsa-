public class twosum {  
    public static void main(String[] args) { 
        twosum solver =new twosum();
        int[]numbers ={ 2,7,11,15};
        int target =13;
        int [] result =solver.twoSum(numbers , target );
        System.out.println ("indices found ; " + java.util.Arrays.toString(result));
    }
    public int[] twoSum(int[] numbers, int target) {  
        int [] ans = new int [2];
        int st = 0;
        int end = numbers.length  - 1;
        while (st<end){
            int sum = numbers [st]+ numbers [end];
            if (sum==target){
                ans [0] =st+ 1;
                ans [1] =end +1;
                return ans ;
            } else if ( sum> target){
                end -- ;
            } else {
                st++;
            }
        }
        return ans;
    }
    
}
