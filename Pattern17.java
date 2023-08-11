package Data_Structure.Error.Practice_Set.Pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of Rows:-");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int b=1;b<i;b++)
                System.out.print(" ");
            for (int j=1;j<=2*(n-i)+1;j++)
                System.out.print(n-i+1);
            System.out.println();
        }
    }
}
