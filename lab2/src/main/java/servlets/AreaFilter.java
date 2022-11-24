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
            int intX = Integer.parseInt(x);
            int intY = Integer.parseInt(y);
            int intR = Integer.parseInt(r);
            if (intX < -3 || intX > 3){
                response.getWriter().println("<html><body><p>X is not in [-3,3] range!</p></body></html>");
            } else if (intY < -4 || intY > 4) {
                response.getWriter().println("<html><body><p>Y is not in [-4,4] range!</p></body></html>");
            } else if (intR < 1 || intR > 5) {
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
