public class perfectsquareroot {
    public static void main(String[] args) {
        int n =40;//this is the no whos root i want to calculate
        int p=3;  //this is precesion value till how decimal point i want to print
       System.out.println(sqrt(n,p));
       //System.out.printf("%0.3f", sqrt(n, p));
    }
   
    static double sqrt(int n, int p){
        int s=0;
        int e=n; //0 to n means n is the last value
        double root = 0.0;
        while(s<e){
            int mid = s+(s-e)/2;
            if(mid*mid == n){
                root=mid;
                return mid;
            }
            if(mid*mid > n){
                e = mid-1;
            }
            if(mid*mid < n){
                s=mid+1;
            }
        }
         double incr=0.1;
         for(int i=0; i<p; i++){
             while(root*root <= n){
                 root += incr;
             }
             root -= incr;
         }
    return root;
    }
}
