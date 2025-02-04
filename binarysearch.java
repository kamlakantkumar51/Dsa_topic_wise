public class binarysearch {
    public static void binarySearch(int arr[],int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                System.out.println("element found at index"+mid);
            }
            if(arr[mid]<target){
                start = mid+1;
            }else{
                end= mid-1;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int target = 4;

        binarySearch(arr, target);
    }
}
