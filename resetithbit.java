public class resetithbit {
    public static void main(String[] args) {
        int n =20;
        int thirdbit=n&(~1<<(3-1)); // reset the 3rd bit
        System.out.println(thirdbit);
    }
}
