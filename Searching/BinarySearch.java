// Use binary searh to determine if an element exists in an array
// Time complexity O(log n)

class BinarySearch{
    // Returns index of x if it is present in arr[l..r], else return -1
    int binarySearch(int arr[], int x, int l, int r ) {
        if(r >= 1){
            int mid = l + (r -1)/2;
            // If the element is present at the middle itself
            if(arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray

            if(arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr,mid + 1, l, x);
        }

        // We reach a point where there is no element
        return -1;
    }

    // Driver method
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 4,6,7,8,9,10,33};
        int n = arr.length;
        int x = 9;

        int result = ob.binarySearch(arr, 0, n- 1, x );

        if(result == -1)
            System.out.print("Element is not in the arr");
        else {
            System.out.print("Element is in the arr" + x);
        }
    }
}