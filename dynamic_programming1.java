class dynamic_programming1 {
    public static void main(String[] args) {
        dynamic_programming1 obj =new dynamic_programming1();
        int n=8;
        System.out.println("tribonacci of "+n+" is" + obj.tribonacci(n));
        
    }
    public int tribonacci(int n) { 
        if (n==0){
            return 0;
        }else if (n==1 || n==2){
            return 1;
        
        }else {
            int ft=0;
            int st=1;
            int tt=1;
            for (int i=1 ; i<= n; i++){
                int fot =ft+st+tt;
                ft=st;
                st=tt;
                tt=fot;
            }
            return  ft;
        }
        
    }
} 