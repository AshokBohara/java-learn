import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try (CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet()) {
            // Set connection details
            rowSet.setUrl(url);
            rowSet.setUsername(user);
            rowSet.setPassword(password);

            // Set SQL query
            rowSet.setCommand("SELECT id, name, email FROM users");
            rowSet.execute(); // Fetches data and disconnects

            // Iterate while offline
            while (rowSet.next()) {
                System.out.println(
                    "ID: " + rowSet.getInt("id") +
                    ", Name: " + rowSet.getString("name") +
                    ", Email: " + rowSet.getString("email")
                );
            }

            // Update data (offline)
            rowSet.beforeFirst();
            while (rowSet.next()) {
                if (rowSet.getString("name").equals("John")) {
                    rowSet.updateString("email", "john.new@example.com");
                    rowSet.updateRow(); // Changes stored in memory
                }
            }

            // Sync changes back to DB
            rowSet.acceptChanges(); // Reconnects and updates DB

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}