import java.util.ArrayList;

public class factorsodno {
    public static void main(String[] args) {
        int n=20;
        //factor1(n);
        //factor2(n);
        factor3(n);
    }         
    

// here timecomplexity is o(n)
    static void factor1(int n){
    for(int i=1; i<=20; i++){
        if(n%i==0){
            System.out.print(i+ " ");
         }
     }
  }

  //here timecomplexity is o(sqrt(n))
//   static void factor2(int n){ //this is giving mw output in unsorted order
      
//       for(int i =1; i<=Math.sqrt(n); i++){
//         if(n%i==0){
//             if(n/i==i){ //to avoid duplicacy(6*6)
//                 System.out.print(i + " ");
//             }else{
//                 System.out.print(i + "  " + n/i + " "); //it will print (2*10) both root in single go
//             }
//          } 
//       }
//   }


static void factor3(int n){ //this is giving me output in sorted order
     ArrayList<Integer> list= new ArrayList<>(); 
    for(int i =1; i<=Math.sqrt(n); i++){
      if(n%i==0){
          if(n/i==i){ //to avoid duplicacy(6*6)
              System.out.print(i + " ");
          }else{
              System.out.print(i + "  "); //it will print (2*10) both root in single go
              list.add(n/i);
          }
       } 
    }

    for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i) + " ");
    }
}
}
