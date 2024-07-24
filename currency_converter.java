
// currency converter //

import java.util.Scanner;
public class currency_converter{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);

        System.out.println("***** Welcome to the Currency Converter!*****");
        System.out.println("1. USD to Rupee");
         System.out.println("2. Rupee to USD");
          System.out.println("3. Euro to Rupee");
           System.out.println("4. Rupee to Euro");
            System.out.println("Enter your choice to convert(1 or 2 or 3 or 4):");
            int choice = Sc.nextInt();

            if (choice == 1){
                System.out.print("Enter the amount in USD: ");
                double USD = Sc.nextDouble();
                double Rupee = usdToRupee(USD);
                System.out.println("Converted amount in Rupee: " + Rupee);
            }else if (choice == 2){
                System.out.print("Enter the amount in Rupee: ");
                double Rupee = Sc.nextDouble();
                double USD = RupeeToUsd(Rupee);
                System.out.println("Converted amount in USD: "+USD);
            }else if (choice == 3){ 
                System.out.print("Enter the amount in Euro: ");
                double EURO = Sc.nextDouble();
                double Rupee = euroToRupee(EURO);
                System.out.println("Converted amount in Rupee: "+Rupee);
            }else if (choice == 4){ 
                System.out.print("Enter the amount in Rupee: ");
                double Rupee = Sc.nextDouble();
                double EURO = RupeeToEuro(Rupee);
                System.out.println("Converted amount in EURO: "+EURO);
            }
            else {
                System.out.println("Invalid choice.Please check your choice according to given choice.");
            }
            Sc.close();
            }

            public static double usdToRupee(double USD){
                return USD * 83.47;
            }
             public static double RupeeToUsd(double Rupee){
                return Rupee * 0.0119804;
            }
             public static double euroToRupee(double EURO){
                return EURO * 89.10;
            }
             public static double RupeeToEuro(double Rupee){
                return Rupee * 0.0113;
            }

    }