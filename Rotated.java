public class Rotated {
    public static int rotate(int arr[], int key){
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
                if(arr[mid]==key){
                    return mid;
                }
                else if(arr[mid]>=arr[si]){
                    if(key<=arr[mid]&&key>=arr[si]){
                        ei=mid-1;
                    }
                    else{
                        si=mid+1;

                    }
                }
                else if(arr[mid]<=arr[ei]){
                    if(key>=arr[mid]&&key<=arr[ei]){
                        si=mid+1;
                    }
                    else{
                        ei=mid-1;
                    }
                }

            }
                return -1;
        }

    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2,3};
        int key=2;
        System.out.println(rotate(arr, key));
    }
}
