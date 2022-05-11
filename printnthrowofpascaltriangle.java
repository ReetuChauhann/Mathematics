public class printnthrowofpascaltriangle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the rowth number u want to print: ");
        // int n = sc.nextInt();
        int n = 6;
        for(int i=0; i<n; i++){
            int icj=1;
        if(i==4){
            for(int j=0; j<=i; j++){
                
                System.out.print(icj +" ");
            int icjp1=icj*(i-j)/(j+1);
            icj=icjp1;
           }
        }
    }
                
        
        
    }
    
}
