public class binarysearc {
    //recursive binary search method
    int binarysearch(int arr[],int left, int right, int target)
    {
        if(right>=left)
        {
            int mid=left+(right-left)/2;
            // if the element is present at the middle itself

            if (arr[mid]==target)
            return mid;
            // if the element is smaller than than the middle element , then it can only be present in the left subarray

            if(arr[mid]>target)
            return binarysearch(arr, left,mid-1, right);

            return binarysearch(arr, left,mid+1 ,right);
        }
            return-1;
            

        

        
    }

    public static void main(String[] args) {
        binarysearc bs=new binarysearc();
        int arr[]={2,3,4,10,40};
        int target=10;
        int result=bs.binarysearch(arr,0,arr.length-1,target);
        if(result==-1)

        System.out.println("element not present in array");
        else
        System.out.println("element found at index"+ result);

    }
}
