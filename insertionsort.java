public class insertionsort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //to finding the correct position ofd an element
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //inserting..
            arr[prev+1]=curr;
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
