import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Connect connect = new Connect();
        System.out.println("Enter login");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        Connect con = new Connect();
        connect.Connect(username, password, "46.229.214.241/pgadmin4");
    }
} //12345