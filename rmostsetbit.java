public class rmostsetbit {
    public static void main(String[] args) {
        int n = 20;
        int rightmostsetbit= n&(-n);
        System.out.println(rightmostsetbit);
    }
    
}
