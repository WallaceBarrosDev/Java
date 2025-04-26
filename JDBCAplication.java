import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

class DataBase {
    private static final String database = "jdbcdb";
    private static final String port = "3306";
    private static final String endpont = "localhost";
    private static final String driver = "jdbc:mysql";
    private static final String URL = driver + "://" + endpont + ":" + port + "/" + database;
    private static final String user = "root";
    private static final String password = "150203@Dc";

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

class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public ArrayList<String> getInformation() {
        ArrayList<String> informations = new ArrayList<>();
        informations.add(name);
        informations.add(password);
        informations.add(email);
        return informations;
    }
}

class UserService {
    public static void sendUser(User user) {
        final String sql = "INSERT INTO users (name, password, email) VALUES (?, ?, ?)";
        final ArrayList<String> userInfomation = user.getInformation();

        try {
            PreparedStatement preparedStatement = DataBase.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, userInfomation.get(0));
            preparedStatement.setString(2, userInfomation.get(1));
            preparedStatement.setString(3, userInfomation.get(2));
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public class JDBCAplication {
    public static void main(String[] args) {
        User user = new User("meu nome2", "meuEmail@gmail.com", "minha senha");

        UserService.sendUser(user);
        System.out.println("User created successfully");
    }
}