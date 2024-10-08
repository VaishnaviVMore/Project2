import java.util.*;
public class Harry1 {
    public static void main(String[] args) {
        //PROBLEM1
        // float arr[]=new float[5];
        // Scanner Sc=new Scanner(System.in);
        // for(int j=0;j<5;j++){
        //     arr[j]=Sc.nextFloat();
        // }
        // float sum=0;
        // for(int i=0;i<5;i++){
        //     sum+=arr[i];
        // }
        // System.out.println(sum);
        // float arr[]={2.6f,7.6f,3.9f,5.8f,5.5f};
        // float sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        // System.out.println(sum);
        //PROBLEM2
      /*   float arr[]={3.4f,5.6f,7.8f,9.9f,5.7f};
        float num=5.6f;
        boolean isInarray=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                isInarray=true;
                break;
            }
        }
        if(isInarray){
            System.out.println("Number is in array");
        }
        else{
            System.out.println("Number is not in array");
        }
    }
        */
        //PROBLEM3
      /*   float arr[]={2.4f,2.7f,4.9f,5.8f,5.9f};
        float sum=0;
        for(float element:arr){//for-each loop
            sum+=element;
        }
        System.out.println("Average is: "+sum/arr.length);
        */
        //PROBLEM4
        int arr[][]={{1,2,3},
                    {4,5,6}};
        int arr1[][]={{1,2,3},
                    {4,5,6}};
        int result[][]={{0,0,0},
                    {0,0,0}};
        //int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.format("Setting value of i=%d and j=%d\n",i,j);
                result[i][j]=arr[i][j]+arr1[i][j];
            }
            //System.out.println();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(result[i][j]+" ");
                //result[i][j]=arr[i][j]+arr1[i][j];
            }
            System.out.println();
    }
}
}
