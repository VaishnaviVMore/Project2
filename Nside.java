public class Nside{
    public static void Rearrange(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]<0){
                left++;
            }
            else if(arr[right]>0){
                right--;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,-3,4,7,-2,7,-5};
        Rearrange(arr);
        display(arr);
    }
}