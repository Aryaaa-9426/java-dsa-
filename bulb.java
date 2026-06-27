public class bulb { 
    public static void main(String[] args) {
        bulb obj =new bulb();
        System.out.println(obj.bulbSwitch( 8));
    }
     public int bulbSwitch(int n) { 
        int count =0 ;
        int i =1;
        while ( i*i<=n){
            count ++;
            i++;


        }
        return count ;
    }
}
