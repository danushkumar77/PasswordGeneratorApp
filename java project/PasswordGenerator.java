
import java.util.Random;

public class PasswordGenerator {
    private final PasswordCriteria criteria;
    private final Random random;

    public PasswordGenerator(PasswordCriteria criteria) {
        this.criteria = criteria;
        this.random = new Random();
    }
    
    public String generate(int length) {
        StringBuilder password = new StringBuilder();
        String allChars = criteria.getAllChars();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }
}
