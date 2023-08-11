package Data_Structure.Error.Practice_Set.Pattern;

import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        //i for rows and j for columns
//row denotes the number of rows you want to print
        Scanner sc = new Scanner(System.in);
        int i, j, row;
        System.out.print("Enter the number of Rows:-");
        row=sc.nextInt();
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=row-i; j>1; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
