class water_bottle {
    public static void main(String[] args) {
        water_bottle wb = new water_bottle();
        int numBottles = 9;
        int numExchange =3;
    int result =wb.numWaterBottles(numBottles, numExchange);
    System.out.println(" total water bottles consumed" +result);
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while (numBottles >= numExchange){
        int newbottles =numBottles/numExchange;
        int remaining = numBottles%numExchange;
        ans=ans + newbottles;
        numBottles =newbottles + remaining;
        }
         return ans ;
        }
    }

    
