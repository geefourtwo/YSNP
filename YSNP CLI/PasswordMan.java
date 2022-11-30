public class PasswordMan {

    private Password password;
    private Utils utils;

    public static void main(String[] args){
        PasswordMan session = new PasswordMan();
        session.run(session);
    }

    public void run(PasswordMan session){
        this.password = session.password;
        Utils utils = new Utils();
        Passwords passwords = new Passwords();
        System.out.println("Menu: (Add password/Delete password/View passwords/Exit)");
        char choice = session.utils.readChar( "Choose (A/D/V/X)");
        while(choice!='X') {

            switch(choice) {

                case 'A':
                    password = session.utils.readPassword("Enter the password to be added", passwords);
                    passwords.addPassword(password);
                    break;

                case 'D':
                    password = session.utils.readPassword("Enter the password to be deleted", passwords);
                    passwords.deletePassword(password);
                    break;

                case 'V':
                    passwords.toString();
                    break;

            }

            System.out.println("Menu: (Add password/Delete password/View passwords/Exit)");
            choice = session.utils.readChar("Choose (A/D/V/X)");
        }
    }



}