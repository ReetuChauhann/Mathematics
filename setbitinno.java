public class setbitinno {
    public static void main(String[] args) {
        int n=20;
        int count=0;
        while(n>0){
            int last=n&1;
            if(last==1){
            count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
    
}
