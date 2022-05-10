public class uniqueno2 {
    public static void main(String[] args) {
        int[] arr={2,-2,3,-3,4,-4,5};
        int ans=uniqueno2(arr);
        System.out.println(ans);
    }

    static int uniqueno2(int[] arr){
        int ans2=0;
        for(int a:arr){
            ans2=ans2+a;
        }
        return ans2;
    }
}
