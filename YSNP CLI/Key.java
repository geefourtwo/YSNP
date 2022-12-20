
public class Key {

    private String password;
    private char[] chars;
    private String key;

    public Key(String password){
        this.password = password;
        this.chars = password.toCharArray();
        this.key = encryptPassword();
    }

    public String getKey() {
        return this.key;
    }

    // Symmetric encrytion algorithm replaces each char with a char 5 elements to
    // the right in ascii.

    public String encryptPassword() {
        for(int i = 0;i<this.chars.length;i++) {
            this.chars[i] += 5; // +5 is the encryption key
        }
        String str = new String(chars);
        this.key = str;
        return this.key;
    }

}