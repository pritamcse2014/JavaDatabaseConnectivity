import java.sql.*;

public class jdbc {
    static void main(String[] args) throws Exception {
        /*
            1. import Package
            2. load and register
            3. create connection
            4. create statement
            5. execute statement
            6. process the results
            7. close
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "2014";
        /* Create */
        String sql = "insert into student values (7, 'Priya', 77)";

        /* Class.forName("org.postgresql.Driver"); */
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Database Connection Established....");
        Statement statement = connection.createStatement();
        boolean status = statement.execute(sql);
        System.out.println(status);
        connection.close();
        System.out.println("Database Connection Closed....");
    }
}
