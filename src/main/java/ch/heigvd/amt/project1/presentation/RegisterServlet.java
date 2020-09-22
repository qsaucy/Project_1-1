package ch.heigvd.amt.project1.presentation;

import ch.heigvd.amt.project1.business.Checker;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/register.do")
public class RegisterServlet extends javax.servlet.http.HttpServlet {
    private Checker business;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        business = new Checker();
    }
    protected  void doGet (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(request, response);
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("uname");
        String password = request.getParameter("psw");
        String model = business.register(login,password);
        request.setAttribute("register", model);
        request.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(request, response);
    }
}