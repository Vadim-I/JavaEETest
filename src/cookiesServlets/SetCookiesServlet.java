package cookiesServlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SetCookiesServlet")
public class SetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        Cookie cookie1 = new Cookie("some_id", "123");
        cookie1.setMaxAge(60 * 60 * 24);
        Cookie cookie2 = new Cookie("some_name", "Max");
        cookie2.setMaxAge(60 * 60 * 24);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}
