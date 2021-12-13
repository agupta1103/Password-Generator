
/**
 * The purpose of this program is to read data from
 * an input file.
 *
 * @author Anish Gupta
 * @version 07/24/21
 */
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class SecretPasscodes {
    public static void main(String[] args) throws IOException {
        PrintWriter outFile = new PrintWriter(new File("Secret Passcodes.txt"));
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("                       Password Generator Menu");
        System.out.println("*******************************************************************");
        System.out.println("*   [1] Lowercase Letters                                         *");
        System.out.println("*   [2] Lower Case and Uppercase Letters                          *");
        System.out.println("*   [3] Lower Case, Uppercase, and Numbers (1-9)                  *");
        System.out.println("*   [4] Lower Case, Uppercase, Numbers, and Special Characters    *");
        System.out.println("*   [5] Quit                                                      *");
        System.out.println("*******************************************************************");
        String password = "";
        while (true) 
        {
            System.out.print("\nEnter Selection (1-5): ");
                int option = in.nextInt();
                if (option == 1) 
            {
                System.out.print("Password Length (6 or more): ");
                int passwordLength = in.nextInt();
                while (passwordLength < 6)
                {
                    System.out.println("\tPassword Length too short. Please try again.");
                    System.out.print("Password Length (6 or more): ");
                    passwordLength = in.nextInt();
                }
                password = "";
                for (int i = 0; i < passwordLength; i++)
                {
                    char passwordLetter = (char) ('a' + rand.nextInt(26)); // Generate Passcode Lower Letters
                    password += passwordLetter;
                }
                outFile.println(password);
            }   else if (option == 2) 
            {
                System.out.print("Password Length (6 or more): ");
                int passwordLength = in.nextInt();
                while (passwordLength < 6)
                {
                    System.out.println("\tPassword Length too short. Please try again.");
                    System.out.print("Password Length (6 or more): ");
                    passwordLength = in.nextInt();
                }
                password = "";
                for (int i = 0; i < passwordLength; i++)
                {
                    if (rand.nextInt(2) == 0)
                    {
                        char passwordLetter = (char) ('a' + rand.nextInt(26)); // Generate Passcode Lowercase Letters
                        password += passwordLetter;
                    }
                    else 
                    {
                        char passwordLetter = (char) ('A' + rand.nextInt(26)); // Generate Passcode UpperCase Letters
                        password += passwordLetter;
                    }
                }
                outFile.println(password);
            }   else if (option == 3) 
            {
                System.out.print("Password Length (6 or more): ");
                int passwordLength = in.nextInt();
                while (passwordLength < 6)
                {
                    System.out.println("\tPassword Length too short. Please try again.");
                    System.out.print("Password Length (6 or more): ");
                    passwordLength = in.nextInt();
                }
                password = "";
                for (int i = 0; i < passwordLength; i++)
                {
                    if (rand.nextInt(3) == 0)
                    {
                        char passwordLetter = (char) ('a' + rand.nextInt(26)); // Generate Passcode Lowercase Letters
                        password += passwordLetter;
                    }
                    else if (rand.nextInt(3) == 1)
                    {
                        char passwordLetter = (char) ('A' + rand.nextInt(26)); // Generate Passcode UpperCase Letters
                        password += passwordLetter;
                    }
                    else 
                    {
                        char passwordNumber = (char) ('0' + rand.nextInt(10)); // Generate Passcode Numbers
                        password += passwordNumber;
                    }
                }
                outFile.println(password);
            }   else if (option == 4) 
            {
                System.out.print("Password Length (6 or more): ");
                int passwordLength = in.nextInt();
                while (passwordLength < 6)
                {
                    System.out.println("\tPassword Length too short. Please try again.");
                    System.out.print("Password Length (6 or more): ");
                    passwordLength = in.nextInt();
                }
                password = "";
                for (int i = 0; i < passwordLength; i++)
                {
                    if (rand.nextInt(4) == 0)
                    {
                        char passwordLetter = (char) ('a' + rand.nextInt(26)); // Generate Passcode Lowercase Letters
                        password += passwordLetter;
                    }
                    else if (rand.nextInt(4) == 1)
                    {
                        char passwordLetter = (char) ('A' + rand.nextInt(26)); // Generate Passcode UpperCase Letters
                        password += passwordLetter;
                    }   
                    else if (rand.nextInt(4) == 2) 
                    {
                        char passwordNumber = (char) ('0' + rand.nextInt(10)); // Generate Passcode Numbers
                        password += passwordNumber;
                    }
                    else
                    {
                        char passwordSpecialCharacters = (char) (':' + rand.nextInt(7)); // Generate Passcode Special Letters
                        password += passwordSpecialCharacters;
                    }
                }
                outFile.println(password);
            }   else if (option == 5) 
            {
                break;
            }
                else 
            {
                System.out.println("\tInvalid Option. Please try again");
                continue;
            }
        }
        outFile.close();
        // Write Randomly Generated Passcodes In Data File
        
        System.out.println("\nThank you for using the Pass Code Generator.");
        System.out.println("\nHere are your randomly generated codes:");

        // Read Randomly Generate Passcodes In Data File
        
        File filename = new File("Secret Passcodes.txt");
        Scanner inFile = new Scanner (filename);
        String secretPasscodes = "";
        int numbering = 0;
        while (inFile.hasNextLine())
        {
            secretPasscodes = inFile.nextLine();
            numbering++;
            System.out.println(numbering + "." + secretPasscodes);
        }
        inFile.close();
    }
}
