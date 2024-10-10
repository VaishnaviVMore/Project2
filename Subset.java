
public class Subset {
    public static boolean arrsub(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        // Loop through each element of arr2
        for (int i = 0; i < m; i++) {
            boolean issubset = false;
            
            // For each element of arr2, check if it exists in arr1
            for (int j = 0; j < n; j++) {
                System.out.format("Setting value of i=%d & j=%d\n", i, j);
                if (arr2[i] == arr1[j]) {
                    issubset = true;  // Mark as found
                    break;  // Break out of the inner loop as we found the match
                }
            }
            
            // If an element of arr2 is not found in arr1, return false
            if (!issubset) {
                return false;
            }
        }
        // If all elements of arr2 are found in arr1, return true
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 9, 10};
        int arr2[] = {6, 8, 10};
        System.out.println(arrsub(arr1, arr2));  // This will print false
    }
}
