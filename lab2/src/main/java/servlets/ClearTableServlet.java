package servlets;

import beans.Results;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ClearTableServlet", value = "/clear")
public class ClearTableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Results entries = (Results) request.getSession().getAttribute("entries");
        if (entries == null) entries = new Results();
        entries.getHits().clear();
        request.getSession().setAttribute("entries", entries);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
