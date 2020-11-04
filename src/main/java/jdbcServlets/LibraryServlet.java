package jdbcServlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        PrintWriter pw = response.getWriter();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_ee_db",
                                                    "postgres", "postgres");
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT title FROM books");

            while (rs.next()) {
                pw.println(rs.getString("title"));
            }

            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
