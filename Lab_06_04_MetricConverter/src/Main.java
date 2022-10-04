import java. util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int meters = 0;
        double feet = 0;
        double inches = 0;
        double miles = 0;
        String trash = "";
        System.out.println("Enter measurement in meter: ");
        if(in.hasNextInt())
        {
            meters= in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said the measurement was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
        feet = meters * 3.28;
        inches = meters * 39.37;
        miles = meters * .00062;
        System.out.println("feet: " + feet);
        System.out.println("inches: " + inches);
        System.out.println("miles: " + miles);
    }
}