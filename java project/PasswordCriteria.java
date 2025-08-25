


class PasswordCriteria {
    private final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    private final String numbers = "0123456789";
    private final String symbols = "!@#$%^&*";
    
    private final String allChars = upperCase + lowerCase + numbers + symbols;

    public String getAllChars() {
        return allChars;
    }
}