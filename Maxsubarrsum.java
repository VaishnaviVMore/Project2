public class Maxsubarrsum{
    public static void maxsum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int Currsum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                Currsum=0;
                for(int k=start;k<=end;k++){
                    Currsum=Currsum+arr[k];
                    }
                    if(maxsum<Currsum){
                        maxsum=Currsum;
                    //System.out.print(arr[k]+" ");
                }
                //System.out.println();
            }
        }
        System.out.println(maxsum);
    }
public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    maxsum(arr);
}
}