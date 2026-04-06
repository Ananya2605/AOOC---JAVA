import java.io.*;

public class Words {
    public static void main(String[] args) {
      
        String fileName = "sample.txt";
        
        int vowelCount = 0;
        int wordCount = 0;
        int charACount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
              
                if (!line.trim().isEmpty()) {
                    wordCount += line.trim().split("\\s+").length;
                }

             
                String lowerLine = line.toLowerCase();
                
                for (int i = 0; i < lowerLine.length(); i++) {
                    char ch = lowerLine.charAt(i);

                    
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }

                  
                    if (ch == 'a') {
                        charACount++;
                    }
                }
            }

            /
            System.out.println("--- Analysis for " + fileName + " ---");
            System.out.println("Total number of vowels: " + vowelCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Frequency of character 'a': " + charACount);

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
