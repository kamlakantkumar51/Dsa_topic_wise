public class printsubarray {
    public static void printSubarray(int numbers[]){
        //start ko pehle print kra do fir lasst ko uske baad uske bichh ka saare elemnts print kra do !!
        int ts = 0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total subarray = "+ts);
    }
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10};
        
        printSubarray(numbers);
    }
}
