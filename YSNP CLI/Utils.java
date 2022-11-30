import java.util.Scanner;
public class Utils {

    private Scanner sc = new Scanner(System.in);

    public int readInt(String prompt) {
        System.out.println(prompt+": ");
        return sc.nextInt();
    }

    public String readStr(String prompt) {
        System.out.println(prompt+": ");
        return sc.nextLine();
    }

    public char readChar(String prompt) {
        System.out.println(prompt+": ");
        return sc.next().charAt(0);
    }

    public Password readPassword(String prompt, Passwords passwords) {
        String passwordName = readStr(prompt+": ");
        int size = passwords.getSize();
        Key key = new Key(size);
        Password password = new Password(passwordName, key, size);
        return password;
    }

}
