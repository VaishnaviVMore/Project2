 public class Bubber {
    public static void Nfirst(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
        // if(arr[left]<0&&arr[right]>0){
        //     left++;right--;
        // }
        // else if(arr[left]>0&&arr[right]<0){
        //     int temp=arr[left];
        //     arr[left]=arr[right];
        //     arr[right]=temp;
        //     left++;
        //     right--;
        // }
        // else if(arr[left]<0&&arr[right]<0){
        //     right--;
        // }
        // else{
        //     left++;
        // }
        if(arr[left]<0){
            left++;
        }
        else if(arr[right]>0){
            right--;
        }
        else {
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
        }
    }
    }
    public static void Display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,12,-4,-6,2,5,-7};
        Nfirst(arr);
        Display(arr);
    }
} 
    

