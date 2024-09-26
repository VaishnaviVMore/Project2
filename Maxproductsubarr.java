public class Maxproductsubarr {
    public static int Product(int arr[]){
        int n=arr.length;
            int pro=1;
            int maxpro=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                pro=1;
                for(int k=start;k<=end;k++){
                    pro=pro*arr[k];
                    //System.out.println(arr[k]+" ");
                }
                if(pro>maxpro){
                    maxpro=pro;
                }
            }
        }  
        return maxpro;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        System.out.println(Product(arr));
    }
}
