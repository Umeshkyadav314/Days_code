import java.util.Scanner;
public class L5_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
     int m= sc.nextInt();


        // hollow rectangular
        for(int i=1;i<=n;++i){
            for(int j=1;j<=m;++j){
               if(i==1 || j==1 || i==n || j==m){
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
            }
            System.out.println("\n");
        }

        // half pyramid
//       *
//       * *
//       * * *
//       * * * *

        for(int i=1;i<=n;++i){
            for (int j=1;j<=i;++j){

            System.out.print("*"+" ");
            }
            System.out.print("\n");
            }

//        * * * *
//        * * *
//        * *
//        *

         for(int i=1;i<=n;++i) // or
           for(int i=n;i>=1;--i){
             for(int j=1;j<=i;++j){
                 System.out.print("*"+" ");
             }
             System.out.print("\n");
         }

//           *
//          **
//         ***
//        ****
//       *****

        for(int i=1;i<=n;++i){
            for(int j=1;j<=n-i;++j){
                System.out.print(" ");
            }
            for (int j=1;j<=i;++j){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // number print pattern
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for(int i=1;i<=n;++i){
            for(int j=1;j<=i;++j){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }

//        for(int i=n;i>=1;--i){ or
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

        for(int i=1;i<=n;++i){
            for(int j=1;j<=n-i+1;++j){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        /// floyd's triangle
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        int cont =1;

        for(int i=1;i<=n;++i){
            for(int j=1;j<=i;++j){
                System.out.print(cont + " ");
                cont++;
            }
            System.out.println();
        }


        // number pattern
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

        for(int i=1;i<=n;++i){
            for(int j=1;j<=i;++j){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
