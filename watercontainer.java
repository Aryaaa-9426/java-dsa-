public class watercontainer { 

    public static void main (String args[]){
        watercontainer solver = new watercontainer();
        int[] testHeight ={1,8,6,2,5,4,8,3,7};
        int result = solver.maxArea(testHeight);
        System.out.println("maximum water container: "+ result);
    }
    
     public int maxArea(int[] height) { 
         int st =0;
         int end = height.length -1 ;
         int maxCap = 0;
         while (st<end){
            int h  = Math.min(height[st],height[end]);
            int width =end -st ;
            int currCap=h*width;
            maxCap = Math.max(currCap,maxCap);
            if(height [st]<height[end]){
                st++;
            } else {
                end --;}

            }
            
         
        return maxCap;
    }
}

