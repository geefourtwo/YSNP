import java.util.Scanner;

public class Utils {

    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String prompt) {
        System.out.print(prompt+": ");
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    public static String readStr(String prompt) {
        System.out.print(prompt+": ");
        return sc.nextLine();
    }

    public static char readChar(String prompt) {
        System.out.print(prompt+": ");
        return sc.nextLine().charAt(0);
    }

    public static Password readPassword(String prompt, Passwords passwords) {
        String passwordName = readStr(prompt);
        int size = passwords.getSize();
        Key key = new Key(passwordName);
        Password password = new Password(passwordName, key, size);
        return password;
    }

}
