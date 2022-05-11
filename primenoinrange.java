public class primenoinrange {
    public static void main(String[] args) {
        int n=20;
        for(int i=1; i<=20; i++){
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        int no=n;
        if(no<=1){
            return false;
        }
       if(no>1){
        int m=no/2;
        for(int i=2; i<=m; i++){
            if(no%i==0){
                return false;
            }else{
                return true;
            }
        }
    }
        return true;
    }
}
