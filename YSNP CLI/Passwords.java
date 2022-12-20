import java.util.Hashtable;
import java.util.Enumeration;

public class Passwords {
    
    private Hashtable<String, Password> passwords;
    
    public Passwords() {
        this.passwords = new Hashtable<String, Password>();
    }

    public void addPassword(Password password) {

        passwords.put(password.getKey(), password);
    }

    public void deletePassword(String key) {
        passwords.remove(key);
    }

    public void viewPasswrords() {
        this.passwords.toString();
        Enumeration<Password> values = passwords.elements();
        Enumeration<String> keys = passwords.keys();
 
        while( values.hasMoreElements() ){
            System.out.println( keys.nextElement() + " " + values.nextElement() );
        }
    }

    public int getSize() {
        return this.passwords.size();
    }

}