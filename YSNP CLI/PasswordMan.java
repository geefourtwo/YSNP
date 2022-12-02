public class PasswordMan {

    private Password password;
    private Passwords passwords;

    public static void main(String[] args) {
        PasswordMan session = new PasswordMan();
        Passwords passwords = new Passwords();
        System.out.println("Menu: (Add password / Delete password / View passwords / Exit)");
        char choice = Utils.readChar("Choose (A/D/V/X)");
        while(choice!='X') {

            switch(choice) {

                case 'A':
                    session.password = Utils.readPassword("Enter the password to be added", passwords);
                    passwords.addPassword(session.password);
                    break;

                case 'D':
                    int key = Utils.readInt("Enter the key of the password to be deleted");
                    passwords.deletePassword(key);
                    System.out.println("Password has been deleted");
                    break;

                case 'V':
                    System.out.println("Your passwords: ");
                    passwords.viewPasswrords();
                    break;
                
                default: 
                    System.out.println("Invalid choice! Try again");
                    break;
            }

            System.out.println("Menu: (Add password / Delete password / View passwords / Exit)");
            choice = Utils.readChar("Choose (A/D/V/X)");
        }
    }



}