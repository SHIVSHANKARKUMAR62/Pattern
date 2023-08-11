package Data_Structure.Error.Practice_Set.Pattern;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        int k=65;
        char c = (char) k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i%2==0){
                    System.out.print(" "+c+" ");
                    k++;
                }else {
                    System.out.print(" "+j+" ");
                    k=65;
                }
                c= (char) k;
            }
            System.out.println();
        }
    }
}
