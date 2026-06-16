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

        int sid = 102;
        String sname = "Ankita";
        int marks = 33;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "2014";
        /* Delete */
        String sql = "insert into student values(?,?,?)";

        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, sid);
        preparedStatement.setString(2, sname);
        preparedStatement.setInt(3, marks);
        preparedStatement.execute();
        connection.close();
    }
}
