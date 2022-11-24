package servlets;

import beans.ResponseAnswer;
import beans.Results;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlets.AreaCheckServlet", value = "/area")
public class AreaCheckServlet extends HttpServlet {
    @EJB
    Results resBean;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<html><body><p>Use "
                + "POST instead!</p></body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int intX = Integer.parseInt(request.getParameter("X"));
        int intY = Integer.parseInt(request.getParameter("Y"));
        int intR = Integer.parseInt(request.getParameter("R"));
        long startTime = System.nanoTime();
        boolean hRes = isHit(intX,intY,intR);
        long runTime = System.nanoTime() - startTime;
        ResponseAnswer res = new ResponseAnswer(intX,intY,intR, hRes, runTime);
        resBean.getHits().add(res);
        request.setAttribute("table", genTable());
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
    protected boolean isHit(int x, int y, int r){
        boolean hit = false;
        if(x > 0 && y > 0){
            hit = ((y <= (r / 2)) && (x <= r));
        } else if (x < 0 && y > 0) {
            hit = ((x*x + y*x) <= ((r/2)*(r/2)));
        } else if (y < 0 && x > 0){
            hit = y > x - r;
        }
        return hit;
    }
    protected String genTable(){
        StringBuilder builder = new StringBuilder();
        for (ResponseAnswer res: resBean.getHits()) {
            builder.append("<tr>");
            builder.append(String.format("<td>%s</td>", res.getX()));
            builder.append(String.format("<td>%s</td>", res.getY()));
            builder.append(String.format("<td>%s</td>", res.getR()));
            builder.append("<td>");
            String hitString = "<div class=\"hit\">Hit</div>";
            String loseString = "<div class=\"miss\">Miss</div>";
            builder.append(res.isHit() ? hitString : loseString);
            builder.append("</td>");
            builder.append(String.format("<td>%s</td>", res.getTime().toString()));
            builder.append(String.format("<td>%s</td>", res.getProcessingTime()));
            builder.append("</tr>");
        }
        return builder.toString();
    }
}
