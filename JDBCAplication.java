import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class DataBase {
    private static final String table = "users";
    private static final String port = "3306";
    private static final String endpont = "localhost";
    private static final String driver = "jdbc:mysql";
    private static final String URL = driver + "://" + endpont + ":" + port + "/" + table;
    private static final String user = "root";
    private static final String password = "root";

    private static Connection Connection = null;
    
    public static Connection getConnection() {
        try {
            if (Connection == null) {
                Connection = DriverManager.getConnection(URL, user, password);
                return Connection;
            } else {
                return Connection;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class User {
    private long id;
    private String name;
    private String email;
    private String password;

    public ArrayList<String> getInformation() {
        ArrayList<String> userInformation = new ArrayList<String>();
        userInformation.add(name);
        userInformation.add(email);
        userInformation.add(password);
        return userInformation;
    }
}

public class UserService {
    public static void sendUser(User user) {
        final String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
        final ArrayList<String> userInfomation = user.getInformation();

        try {
            PreparedStatement preparedStatement = DataBase.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, userInfomation.name);
            preparedStatement.setString(2, userInfomation.email);
            preparedStatement.setString(3, userInfomation.password);
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



public class JDBCAplication {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("jonhdoe@gmail.com");
        user.setPassword("123456");

        UserService.sendUser(user);
        System.out.println("User created successfully");
    }
}