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

        int sid = 101;
        String sname = "Sathi";
        int marks = 48;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "2014";
        /* Delete */
        String sql = "insert into student values (" + sid + ", '" + sname + "', " + marks + ")";

        /* Class.forName("org.postgresql.Driver"); */
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Database Connection Established....");
        Statement statement = connection.createStatement();
        statement.execute(sql);
        connection.close();
        System.out.println("Database Connection Closed....");
    }
}
