import java.io.FileWriter;
import java.io.IOException;


class PasswordWriter {
    private final String filename;

    public PasswordWriter(String filename) {
        this.filename = filename;
    }

    public void writeToFile(String password) {
        try (FileWriter writer = new FileWriter(filename, true)) { 
            writer.write(password + System.lineSeparator());
            System.out.println("Password saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing password to file: " + e.getMessage());
        }
    }
}
