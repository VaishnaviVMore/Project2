public class Factorial {
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int factnm1=Fact(n-1);
        int factn=n*factnm1;
        return factn;
    }
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
}
