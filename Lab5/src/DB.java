import java.sql.*;

public class DB
{
    private Connection con;

    public DB() {
        try {
            Class.forName("org.h2.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (InstantiationException exception) {
            exception.printStackTrace();
        } catch (IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public void executeSQL(String q) {
        try {
            Statement statement = con.createStatement();
            statement.execute(q);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public ResultSet executeSQLWithResult(String q) {
        try {
            Statement statement = con.createStatement();
            return statement.executeQuery(q);
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}

