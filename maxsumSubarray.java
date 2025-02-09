public class maximumsubarray {
    public static void maxsubarray(int arr[]){
        int currsum =0;;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){ 
                currsum =0;
                for(int k=i;k<=j;k++){
                    currsum+= arr[k];
                }
                System.out.println("currsum = "+currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("maximum subarray sum =  "+maxsum);
    }
    public static void main(String args[]){
        int arr[]= {1,-2,6,-1,3};
        maxsubarray(arr);
    }
}

// output:8
//Time complexity:0(n^3)
// in the place of printing subarray ,print the sum of subarray and compare it with maxsum and update maxsum if it is greater than maxsum.
