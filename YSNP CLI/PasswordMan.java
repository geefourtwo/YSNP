public class PasswordMan {

    private Password password;

    public static void main(String[] args){

        PasswordMan session = new PasswordMan();
        Passwords passwords = new Passwords();

        System.out.println("Menu: (Add password/Delete password/View passwords/Exit)");
        char choice = Utils.readChar("Choose (A/D/V/X)");
        while(choice!='X') {

            switch(choice) {

                case 'A':
                    session.password = Utils.readPassword("Enter the password to be added", passwords);
                    passwords.addPassword(session.password);
                    break;

                case 'D':
                    session.password = Utils.readPassword("Enter the password to be deleted", passwords);
                    passwords.deletePassword(session.password);
                    break;

                case 'V':
                    passwords.toString();
                    break;
                default:
                    System.out.println("Invalid choice! Remember to use capital.");
                    break;

            }

            System.out.println("Menu: (Add password/Delete password/View passwords/Exit)");
            choice = Utils.readChar("Choose (A/D/V/X)");
        }
    }



}