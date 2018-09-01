
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MuestraNumeros", urlPatterns = {"/MuestraNumeros"})
public class MuestraNumeros extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String desde = request.getParameter("desde");
        String hasta= request.getParameter("hasta");
        int nDesde = Integer.parseInt(desde);
        int nHasta = Integer.parseInt(hasta);
        
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        for(int i = nDesde;i<nHasta;i++){
            out.println(i+"<br>");
        }
        out.println("</body></html>");
        out.close();
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
