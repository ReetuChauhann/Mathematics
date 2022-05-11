public class findnoofdigits {
    public static void main(String[] args) {
        int n =18;
        // int b =10;
        int b =2;
        int noofdigits= (int)(Math.log(18)/Math.log(2)+1); // formula to calculate number of digits in given base
        System.out.println(noofdigits);
    }
    
}
