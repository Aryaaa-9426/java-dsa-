class dynamic_programming2 {
    public static void main (String [] args){
        int n=10;
        System.out.println("fibnocci number "+n+ "is" +fib(n));
    }

    public static int fib(int n) { 
        if(n==0){
            return 0;
        } else if (n==1){
            return 1;
        }
        int firstterm=0;
        int secondterm=1;
        for (int i=1; i<=n; i++){
            int thirdterm=firstterm +secondterm;
            firstterm=secondterm;
            secondterm=thirdterm;

        }
        return firstterm;
        
    }
}