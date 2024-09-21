public class Rotatemin {
    public static int minelement(int arr[]){
        int si=0;
        int ei=arr.length-1;
        while(si<ei){
            int mid=(si+ei)/2;
            if(arr[si]<arr[ei]){
                return arr[0];
            }
            else if(arr[mid]>arr[mid+1]){
                return mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[si]){
                si=mid+1;
            }
            else if(arr[mid]<arr[ei]){
                ei=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,0,1,2,3,};
        System.out.println(minelement(arr));
    }
}
