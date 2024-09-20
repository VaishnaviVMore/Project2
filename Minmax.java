public class Minmax {
    public static int minvalue(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
            return min;
    }
        public static int mxvalue(int arr[]){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
            return max;
        }
    
     public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println("Min element in array: "+minvalue(arr));
        System.out.println("Max element in array: "+mxvalue(arr));
      }
    }
