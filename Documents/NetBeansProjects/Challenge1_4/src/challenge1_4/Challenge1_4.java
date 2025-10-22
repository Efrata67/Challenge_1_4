
package challenge1_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Challenge1_4 {

    static class InvalidConfigVersionException extends Exception {
        public InvalidConfigVersionException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {

            reader = new BufferedReader(new FileReader("config.txt"));
            

            String versionLine = reader.readLine();
            if (versionLine == null) {
                throw new IOException("Config file is empty");
            }
            int version = Integer.parseInt(versionLine.trim());
            

            if (version < 2) {
                throw new InvalidConfigVersionException("Config version too old!");
            }
            
 
            String filePath = reader.readLine();
            if (filePath == null) {
                throw new IOException("No file path found in config");
            }
            

            File file = new File(filePath.trim());
            if (!file.exists()) {
                throw new IOException("File path does not exist: " + filePath);
            }
            

            System.out.println("Config read successfully: Version = " + version + ", Path = " + filePath);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: Config file 'config.txt' not found!");
        } catch (NumberFormatException e) {
            System.out.println("Error: First line must be a valid integer!");
        } catch (InvalidConfigVersionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred: " + e.getMessage());
        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Failed to close the file reader!");
            }
            System.out.println("Config read attempt finished.");
        }
    }
}
    
    

