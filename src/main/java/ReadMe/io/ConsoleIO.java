/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadMe.io;

/**
 *
 * @author bisi
 */

import java.util.Scanner;


public class ConsoleIO implements IO {
    private Scanner scanner = new Scanner(System.in);
    
    /**
     * Prints given input string
     * @param toPrint String toPrint
     */
    @Override
    public void print(String toPrint) {
        System.out.println(toPrint);
    }

    /**
     * Reads a line from user and returns the read string.
     * @param prompt
     * @return String 
     */
    @Override
    public String readLine(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
