package Pattern;

import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==0 || i==n-1 || i+j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
