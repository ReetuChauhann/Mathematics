public class uniqueno {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,5,6,6};
        int ans= unique(arr);
        System.out.println(ans);
    }

    static int unique(int[] arr){
        int unique=0;
        for(int n:arr){
            unique=unique^n;
        }
    return unique;
    }

    
}
