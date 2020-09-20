package ch.heigvd.amt.projet1.presentation;

import ch.heigvd.amt.projet1.business.TestQuestion;
import ch.heigvd.amt.projet1.model.Questions;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

public class RegisterServlet extends javax.servlet.http.HttpServlet {
    private TestQuestion service;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //request.setAttribute("register", model);
        request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
    }
}
