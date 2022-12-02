import java.util.Hashtable;
import java.util.Enumeration;

public class Passwords {
    
    private Hashtable<Integer, Password> passwords;
    
    public Passwords() {
        this.passwords = new Hashtable<Integer, Password>();
    }

    public void addPassword(Password password) {

        passwords.put(password.getKey(), password);
    }

    public void deletePassword(int key) {
        passwords.remove(key);
    }

    public void viewPasswrords() {
        this.passwords.toString();
        Enumeration<Password> values = passwords.elements();
        Enumeration<Integer> keys = passwords.keys();
 
        while( values.hasMoreElements() ){
            System.out.println( keys.nextElement() + " " + values.nextElement() );
        }
    }

    public int getSize() {
        return this.passwords.size();
    }

}