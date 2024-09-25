public class Minmax2Darr {
    public static int[] Minmax(int arr[][]){
        int Min=Integer.MAX_VALUE;
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<Min){
                    Min=arr[i][j];
                }
                else if(arr[i][j]>Max){
                    Max=arr[i][j];
                }
            }
        }
        //return new int[]{Min,Max};
        int result[]=new int[2];
        result[0]=Min;
        result[1]=Max;
        
        return result;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12}};
            int[]result=Minmax(arr);
        System.out.println("Min value in matrix is "+result[0]);
        System.out.println("Max value in matrix is "+result[1]);
    }
}
