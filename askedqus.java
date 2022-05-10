import java.util.Arrays;

public class askedqus {
    public static void main(String[] args) {
        int[][] arr={ {1,1,0},
                       {1,0,1},
                    {0,0,0}

        };
        reverse(arr);
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }

    }

    static int[][] reverse(int[][] arr){
        
        for(int i=0; i<arr.length; i++){
            
            for(int j=0; j<arr[i].length;j++){
                int jstart=j; // swaping the individual row or array
                int jend=arr[i].length-j-1;
                while(jstart<jend){
                    int temp=arr[i][jstart];
                    arr[i][jstart]=arr[i][jend];
                    arr[i][jend]=temp;
                    jstart++;
                    jend--;
                }
             arr[i][j]=arr[i][j]^1;
            }
        }
        return arr;
    }

    
    
}
