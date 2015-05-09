///////////////////////////////////////////////////////////////////////////////
// Title:            CS302Shell
// Files:            CS302Shell.java
// Semester:         CS302 Spring 2015
//
// Author:           QuHarrison Terry 
// Email:            qterry@wisc.edu
// CS Login:         quharrison
// Lecturer's Name:  Deb Deppler
// Lab Section:      321
//
// Lecturer's Name:  Deb Deppler
// Lab Section:      321
//
////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

/**
 * Simple command-line user interface for executing math commands.
 *
 * <p>Bugs: None
 *
 * @author QuHarrison Terry
 */

public class CS302Shell {

/**
 * Start of program for executing math commands.
 *
 * @param args Not used.
 */
    public static void main(String[] args) {

        // Scanner connected to keyboard for reading user input
        Scanner scnr = new Scanner(System.in);

        // DISPLAY WELCOME MESSAGE AND HELP
        System.out.println("Welcome to CS302Shell! Enter help for a list" + 
            " of commands or exit to end.");

        // Variables
            String decimalStart; // The string after the decimal command.
            double i = 0; // Used for numeric commands.
            double j = 0; // Used for numeric commands.
            String qString = "";
            boolean running = true; // Used to control the main loop.
        
        // MAIN COMMAND-LINE LOOP
        while(running)
        {

            // DISPLAY COMMAND PROMPT
            System.out.print("> ");

            // READ (SCAN) user input
            String userInput = scnr.next(); // The entry typed by the user. For example: decimal, add, etc

                // DECIMAL command
                if (userInput.equalsIgnoreCase("decimal")){
                    qString = ""; // Clears value of qString
                    decimalStart = scnr.nextLine(); // Saves entire string after decimal.
                    decimalStart = decimalStart.trim(); // Deletes spaces in the string.
                    if (!(decimalStart.length() >= 1)) // If checks for zero input
                    {
                        qString = "Must include a character after decimal"; //Prints error message
                    }
                    else
                    {
                        while (decimalStart.length() > 0) // Turns user input into chars.
                        {
                            qString = qString + ((int) decimalStart.charAt(0) + " "); // Saves chars to qString
                            decimalStart = decimalStart.substring(1);
                        }
                    }
                    System.out.println(qString); // Displays codes to user 
                }

                // ADD command
                else if (userInput.equalsIgnoreCase("add")){
                    if (scnr.hasNextDouble()){ // See's if 1st input is a double
                        i = scnr.nextDouble();
                        if (scnr.hasNextDouble()){ // Seer's if 2nd input is a double
                            j = scnr.nextDouble();
                            System.out.println(i + j); // Adds and displays output to user
                        }
                        else{
                            qString = scnr.next();
                            System.out.println(qString + " must be a number"); //Prints error message
                        }
                    }                 
                }   

                // SUB command
                else if (userInput.equalsIgnoreCase("sub")){
                    if (scnr.hasNextDouble()){ // See's if 1st input is a double
                        i = scnr.nextDouble();
                        if (scnr.hasNextDouble()){ // See's if 2nd input is a double
                            j = scnr.nextDouble();
                            System.out.println(i - j); // Subtracts and displays output to user
                        }
                        else{
                            qString = scnr.next();
                            System.out.println(qString + " must be a number"); //Prints error message
                        }
                    }                 
                }

                // MUL command
                else if (userInput.equalsIgnoreCase("mul")){
                    if (scnr.hasNextDouble()){ // See's if 1st input is a double
                        i = scnr.nextDouble();
                        if (scnr.hasNextDouble()){ // See's if 2nd input is a double
                            j = scnr.nextDouble();
                            System.out.println(i * j); // Multiplies and displays output to user
                        }
                        else{
                            qString = scnr.next();
                            System.out.println(qString + " must be a number"); //Prints error message
                        }
                    }                 
                }

                // DIV command
                else if (userInput.equalsIgnoreCase("div")){
                    if (scnr.hasNextDouble()){ // See's if 1st input is a double
                        i = scnr.nextDouble();
                        if (scnr.hasNextDouble()){ // See's if 2nd input is a double
                            j = scnr.nextDouble();
                            System.out.println(i / j); // Divides and displays output to user
                        }
                        else{
                            qString = scnr.next();
                            System.out.println(qString + " must be a number"); //Prints error message
                        }
                    }                 
                }

                // QUO command
                else if (userInput.equalsIgnoreCase("quo")){
                    if (scnr.hasNextDouble()){ // See's if 1st input is a double
                      i = scnr.nextDouble();
                      if (scnr.hasNextDouble()){ // See's if 2nd input is a double
                        j = scnr.nextDouble();
                        int gg = (int)i; // Cast i and j into ints
                        int bb = (int)j;
                        System.out.println(gg / bb); // Divide and displays output to user
                      }
                      else
                      {
                        qString = scnr.next();
                        System.out.println(qString + " must be a number"); //Prints error message
                      }  
                    }
                }

                // REM command
                 else if (userInput.equalsIgnoreCase("rem")){
                    if (scnr.hasNextDouble()){ // See's if 1st input is a double
                      i = scnr.nextDouble();
                      if (scnr.hasNextDouble()){ // See's if 2nd input is a double
                        j = scnr.nextDouble();
                        int aa = (int)i; // Cast i and j into ints
                        int bb = (int)j;
                        System.out.println(aa % bb); // Divide and display output to user
                      }
                      else
                      {
                        qString = scnr.next();
                        System.out.println(qString + " must be a number"); //Prints error message
                      }  
                    }
                }

                // HELP command
                else if (userInput.equalsIgnoreCase("help")){
                    
                    System.out.println("add i j   - return the sum of two integers         i+j");
                    System.out.println("sub i j   - return the difference between two integers  i-j");
                    System.out.println("mul i j   - return the product of two integers     i*j");
                    System.out.println("div i j   - return the division of  i/j (floating point result)");
                    System.out.println("quo i j   - return the quotient of  i/j (integer division)");
                    System.out.println("rem i j   - return the remainder of i/j (modulus)");
                    System.out.println("decimal a - return decimal value of (a), a is printable character");
                    System.out.println("help      - display this command listing");
                    System.out.println("exit      - exit application");
                }
                // EXIT command
                else if (userInput.equalsIgnoreCase("exit")){
                    System.out.println("Good-Bye");
                    running = false; // ends loop
                }
                // UNRECOGNIZED command
                else{
                    qString = userInput + ": Command not found"; // Unrecongized commands are reuturned with error message.
                    System.out.println(qString);
                }
            }

        // Close the scanner to avoid resource leak
        scnr.close();

    } // end of main method

} // end of CS302Shell class