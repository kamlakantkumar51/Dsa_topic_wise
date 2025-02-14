public class sellandbuystock {
    public static int stock(int prices[]){
        int bp= Integer.MAX_VALUE;//bp=buying price,let be assume that prices is selling price
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(bp<prices[i]){
                int profit = prices[i]-bp;
                maxprofit= Math.max(maxprofit,profit);
            }else{
                bp=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={ 7,1,5,3,6,4};
        System.out.println(stock(prices));
    }
}
