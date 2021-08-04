//Linear search for  element x in arr[]
// If the element does not exist, return -1
// Time complexity O(n)
class LinearSearch(){
     public static int search( int arr[], int x) {
        int n = arr.length;
        for (int i= 0; i < n ; i++){
            if(arr[i] == x){
                return i;
            }
            return -1;
        } 
    } 

    // Main method
    public static void main(String args[]) {
        int arr[] = {1,4,5,6,3,2,7};
        int x= 4;

        int result = LinearSearch(arr, x); 
        if(result == -1){
            System.out.print("Element is not present in the array");
        } else {
            System.out.print("The element is available at index" + result);
        }

    }
}