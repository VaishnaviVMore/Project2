public class Targetsum {
    public static int target(int arr[],int target){
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={5,1,-1,7,5};
        System.out.println(target(arr,6));
    }
}
