public class ithbit {
    public static void main(String[] args) {
        int n=20; // want 5th bit of this given number
        int fbit=n&(1<<(5-1)); //int ibit=n&(1<<(i-1));
        System.out.println(fbit);
        
    }
    
}
