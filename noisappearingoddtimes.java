public class noisappearingoddtimes {
    public static void main(String[] args) {
        int[] arr={2,2,3,2,7,7,7,8,8,8};
        
        for (int n : arr) {
            if(n%3==0){
                System.out.println(n);
            }
       
        }
    }
    
}
