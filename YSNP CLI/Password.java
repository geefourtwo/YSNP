
public class Password {

    private String password;
    private Key key;
    private int size;

    public Password(String password, Key key, int size) {
        this.password = password;
        this.key = key;
        this.size = size;
    }

    public String getKey() {
        return this.key.getKey();
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString(){
        return this.password;
    }
    

}