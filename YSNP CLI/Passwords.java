import java.util.Hashtable;

public class Passwords {
    
    private Hashtable<Integer, Password> passwords;
    
    public Passwords() {
        this.passwords = new Hashtable<Integer, Password>();
    }

    public void addPassword(Password password) {
        passwords.put(password.getKey(), password);
    }

    public void deletePassword(Password password) {
        passwords.remove(password.getKey(), password);
    }

    public void viewPasswrords() {
        this.passwords.toString();
    }

    public int getSize() {
        return this.passwords.size();
    }

}