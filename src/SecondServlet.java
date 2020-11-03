import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

        PrintWriter pw = response.getWriter();

        pw.println("<html");
        pw.println("<h1> Yout count is: " + count + "</h1>");
        pw.println("</html");
    }
}
