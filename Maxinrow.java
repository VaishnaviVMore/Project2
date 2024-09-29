public class Maxinrow {
    public static void max1(int arr[][]){
        int maxcount=Integer.MIN_VALUE;
        int row_with_max1=-1;
         for(int i=0;i<arr.length;i++){
        //int i=0;
            int count=0;
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==1){
                count++;
            }
            //i++;
            // maxcount=Math.max(maxcount,count);
        if(count>maxcount){
            maxcount=count;
            row_with_max1=i;
        }
            
         }
    }
   
        System.out.println("Maxcount of 1 is: "+maxcount);
        System.out.println("Row with max number 1: "+row_with_max1);
    }
    public static void main(String[] args) {
    int arr[][]={{0,1,0,1},
                 {1,1,0,0},
                {1,1,1,0},
                {1,0,0,0}};
        max1(arr);
    }
}
