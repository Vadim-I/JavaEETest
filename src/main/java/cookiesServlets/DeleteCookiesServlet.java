package cookiesServlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        Cookie cookie = new Cookie("some_id", "");

        cookie.setMaxAge(0);
//        cookie.setMaxAge(-1);  // deleting cookies after exiting the browser

        response.addCookie(cookie);
    }
}
