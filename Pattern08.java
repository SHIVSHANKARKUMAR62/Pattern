package Data_Structure.Error.Practice_Set.Pattern;

import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows:- ");
        int n = sc.nextInt();
        int a=n-1;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" "+(i-a));
                a--;
            }
            System.out.println();
        }
    }
}
