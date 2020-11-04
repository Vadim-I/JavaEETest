import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

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
