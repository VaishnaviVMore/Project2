public class Kadans {
    public static int KSol(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum= 0;
            }
           // maxsum=Math.max(maxsum, currsum);
           if(currsum>maxsum){
            maxsum=currsum;
           }
        }
        return maxsum;
    }
    public static void main(String[] args) {
      int arr[]={-1,2,3,4,-2};
      System.out.println(KSol(arr));
    }
}
