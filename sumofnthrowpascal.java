import java.util.Scanner;

public class sumofnthrowpascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int icj=1;
            int sum=0;
            for(int j =0; j<=i; j++){
                sum= sum+icj;

                System.out.print(icj+ "'");
                int icjp1=icj*(i-j)/(j+1);
                icj=icjp1;
               

            }
          
          System.out.println();
          System.out.println(sum);  
        }
    }
    
}
