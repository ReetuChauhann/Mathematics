public class calculatepowerofbase {
    public static void main(String[] args) {
        int pow=2;
        int base=5;
        int ans =1;
        while(pow>0){
            if((pow&1)==1){
               ans=ans*base;
            }
            
            base = base*base;
            pow = pow>>1;
            
        }
        System.out.println(ans);
    }
    
}
