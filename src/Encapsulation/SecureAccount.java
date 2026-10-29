package Encapsulation;

public class SecureAccount {

    private String username;
    private String password;

    public SecureAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean checkPassword(String inputPass) {
        return password.equals(inputPass);
    }

    public boolean changePassword(String oldPass, String newPass) {
        if (password.equals(oldPass)) {
            password = newPass;
            return true;
        }
        return false;
    }
}