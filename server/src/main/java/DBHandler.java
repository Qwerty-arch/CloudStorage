/*import java.sql.*;

public class DBHandler {

    private static final String dbPath = "jdbc:sqlite: bla bla";
    private static DBHandler instance = null;

    private DBHandler() {
        try{
            DriverManager.registerDriver(new JDBC());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized DBHandler getInstance() {
        if (instance == null)
            instance = new DBHandler();
        return instance;
    }

    public boolean authorization(String login, String password) {
        String passFromDB = " ";
        try (Connection connection = DriverManager.getConnection(dbPath);
             PreparedStatement statement = connection.prepareStatement("SELECT password FROM users WHERE login=?")
        ){
            statement.setString(1, login);
            ResultSet resultSet = statement.executeQuery();
            passFromDB = resultSet.getString("password");
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return password.equals(passFromDB);
    }
}*/
