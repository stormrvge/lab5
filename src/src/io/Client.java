package src.io;

import java.util.Scanner;

/**
 * This class scans commands from command line.
 */
public class Client {
    private String nextCommand;
    private Scanner userInput;

    /**
     * Constructor set user input.
     */
    public Client() {
        userInput = new Scanner(System.in);
    }

    /**
     * This method read one line from input stream.
     */
    public void readCommand() {
        nextCommand = userInput.nextLine();
    }

    /**
     * This method closes input stream.
     */
    public void closeInput() {
        userInput.close();
    }

    /**
     * This command returns next command from command line.
     * @return - returns string with name of command.
     */
    public String getNextCommand() {
        return  nextCommand;
    }
}
