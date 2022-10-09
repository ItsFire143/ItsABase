import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public void Connect (String username, String password, String jdbcURL) throws IOException {

        try {
            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, password, username);
            System.out.println("Ракеты запущены, это конец, поздравляю, товарищ!");
            connection.close();
        } catch (SQLException e){
            System.out.println("Ракеты не запущены, кажется что-то пошло не так! Пожалуйста, подождите");
            e.printStackTrace();
        }
    } //12345
}
