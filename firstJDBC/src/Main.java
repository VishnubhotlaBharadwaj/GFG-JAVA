import java.sql.*;
public class Main {
    public static void main(String[] args) {

        try{

            //1. load and register the driver
            String driverName = "com.mysql.cjc.jdbc.Driver";
            Class.forName(driverName);

            //2. establish the connection with the database.
            String url = "jdbc:mysql://localhost:3306/world";
            String usrName = "root";
            String pwd = "Vissu@143";

            Connection con = DriverManager.getConnection(url, usrName, pwd);

            //3. Create the statement object
            Statement st = con.createStatement();

            //4. prepare, send and execute the query
            String sqlQuery = "select * from city";
            ResultSet rs = st.executeQuery(sqlQuery);

            //5, process the result from ResultSet
            while (rs.next()) {
                int id = rs.getInt(1);

                System.out.println(id);
            }

            //6. close the connection.
            con.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}