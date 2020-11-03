import java.io.IOException;
import java.io.PrintWriter;

public class ThirdServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter pw = response.getWriter();

        pw.println("<html");
        pw.println("<h1> Hello, " + name + " " + surname + " </h1>");
        pw.println("</html");

//        response.sendRedirect("https://www.google.com/");
//        response.sendRedirect("/testJsp.jsp");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
//        dispatcher.forward(request, response);
    }
}
