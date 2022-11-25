package servlets;

import javax.servlet.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebFilter(urlPatterns = { "/area"}, dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.REQUEST})
public class AreaFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        String x = request.getParameter("X");
        String y = request.getParameter("Y");
        String r = request.getParameter("R");
        if(x == null){
            response.getWriter().println("<html><body><p>x is null!</p></body></html>");
            return;
        }
        if(y == null){
            response.getWriter().println("<html><body><p>y is null!</p></body></html>");
            return;
        }
        if(r == null){
            response.getWriter().println("<html><body><p>r is null!</p></body></html>");
            return;
        }
        try {
            float floatX = Float.parseFloat(x);
            float floatY = Float.parseFloat(y);
            float floatR = Float.parseFloat(r);
            if (floatX < -3.0 || floatX > 3.0){
                response.getWriter().println("<html><body><p>X is not in [-3,3] range!</p></body></html>");
            } else if (floatY < -4.0 || floatY > 4.0) {
                response.getWriter().println("<html><body><p>Y is not in [-4,4] range!</p></body></html>");
            } else if (floatR < 1.0 || floatR > 5.0) {
                response.getWriter().println("<html><body><p>R is not in [1,5] range!</p></body></html>");
            } else {
                chain.doFilter(request, response);
            }
        } catch (NumberFormatException e) {
            response.getWriter().println("<html><body><p>Some of the params are not Int!</p></body></html>");
        }
//        chain.doFilter(request, response);
    }
}
