package Exercise2;

import java.util.Scanner;
/*
Get input from user via scanner.
Count # of characters in string
Display in print statement
 */
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Getting input from user
        System.out.print("What is the input string? ");
        String sc=in.nextLine(); //sc=string for counter
        int count=0;
        for(int i = 0; i < sc.length(); i++) {
            if(sc.charAt(i) != '\0')
                count++;
        }
        System.out.println("\n"+sc+" has "+count+" characters.");
    }
}
