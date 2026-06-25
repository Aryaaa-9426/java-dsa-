public class removeelement { 
    public static void main ( String [] args){
        removeelement solver =new removeelement ();
        int[] nums ={ 3,2,2,3};
        int val =3;
        int k =solver.removeElement(nums , val);
        System.out.println ("the new length is :" +k);
        System.out.println("the modified array element :");
        for (int i =0 ; i<k ;i++){
            System.out.print(nums[i] + "");

        }
        System.out.println();
    }
    public int removeElement(int[] nums, int val) { 
        int ptr =0;
        for ( int i = 0 ; i< nums.length ; i++){
            if (nums [i] != val){
                nums[ptr]=nums[i];
                ptr++;
            }
        } 
        return ptr ;
        
    }
}

