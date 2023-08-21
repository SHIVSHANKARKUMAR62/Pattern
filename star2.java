package Pattern;

import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){

            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }

            for (int j=n-i;j>1;j--){
                System.out.print("    ");
            }
            for (int s=0;s<=i;s++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
