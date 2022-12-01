import java.util.Scanner;
public class Utils {

    private static final Scanner sc = new Scanner(System.in);

    static public int readInt(String prompt) {
        System.out.print(prompt+": ");
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    static public String readStr(String prompt) {
        System.out.print(prompt+": ");
        return sc.nextLine();
    }

    static public char readChar(String prompt) {
        System.out.print(prompt+": ");
        return sc.nextLine().charAt(0);
    }

    static public Password readPassword(String prompt, Passwords passwords) {
        String passwordName = readStr(prompt);
        int size = passwords.getSize();
        Key key = new Key(size);
        Password password = new Password(passwordName, key, size);
        return password;
    }

}
