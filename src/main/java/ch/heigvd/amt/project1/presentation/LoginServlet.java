package ch.heigvd.amt.project1.presentation;

import ch.heigvd.amt.project1.business.LoginChecker;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/login.do")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    private LoginChecker business;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        business = new LoginChecker();
    }
    protected  void doGet (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String login = request.getParameter("uname");
        String password = request.getParameter("psw");
        String model = business.login(login,password);
        request.setAttribute("login", model);
        request.setAttribute("uname",request.getParameter("uname"));
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
    }
}