package test;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alebo
 */
public class ReadWriteFile
{

    public String readFile()
    {
        String line = "";
        try
        {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine())
            {
                line = myReader.nextLine();
            }
            //System.out.println(line);
            myReader.close();

        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return line;
    }

    public void writeFile()
    {
        try
        {
            FileWriter myWriter = new FileWriter("filename.txt", true);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
