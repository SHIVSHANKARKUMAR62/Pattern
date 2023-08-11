package Data_Structure.Error.Practice_Set.Pattern;

import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows:- ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
