package ch.heigvd.amt.project1.presentation;

import ch.heigvd.amt.project1.business.Checker;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/login.do")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    private Checker business;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        business = new Checker();
    }
    protected  void doGet (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            HttpSession session = request.getSession(true);
            if(session.getAttribute("login")==null)
                request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);

        else{

            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession(true);

        if (session.getAttribute("login")==null) {

            session=request.getSession();
            String login = request.getParameter("uname");
            String password = request.getParameter("psw");
            String model = business.login(login, password);
            session.setAttribute("login",login);
            request.setAttribute("login", model);
            request.setAttribute("uname", request.getParameter("uname"));
            request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
        }
        else {
            request.setAttribute("login", session.getAttribute("login"));
            request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
        }
    }
}