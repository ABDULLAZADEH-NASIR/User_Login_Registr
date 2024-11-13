import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        String password=scanner.next();
        User user = new User(name, password);

        UserService userService = new UserService();

        userService.register(user);
        userService.login(user.getUserName(), user.getPassword());

    }
}