import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection c = null;
        Statement stmt = null;
        int i=1;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:da.db");
            stmt = c.createStatement();
            String query = "SELECT * FROM tabel;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                int id1 = rs.getInt("May 2019");
                int id2 = rs.getInt("May 2018");
                String change = rs.getString("Change");
                String pl = rs.getString("Programming Language");
                String Ratings = rs.getString("Ratings");

                System.out.println();
                System.out.print(rs.getInt(1));
                System.out.print(",");
             //   System.out.println();

                System.out.print(rs.getInt(2));
                System.out.print(",");
              //  System.out.println();

                System.out.print(rs.getString(3));
                System.out.print(",");
             //   System.out.println();

                System.out.print(rs.getString(4));
                System.out.print(",");
             //   System.out.println();

                System.out.print(rs.getString(5));
                System.out.print(" ");
            //    System.out.println();
            }
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

    }
}