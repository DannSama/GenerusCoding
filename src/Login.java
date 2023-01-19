import java.util.Scanner;
import java.util.HashMap;

class Login {
    private HashMap<String, String> users;

    public Login() {
        users = new HashMap<String, String>();
    }

    public void signup(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, password);
            System.out.println("Signup successful!");
        } else {
            System.out.println("Username already exists!");
        }
    }

    public boolean login(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Incorrect username or password!");
            return false;
        }
    }
}


