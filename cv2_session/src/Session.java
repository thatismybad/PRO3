import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Session extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();

        String value = null;
        if (!session.isNew()) {
            value = (String) session.getAttribute("hodnota");
        }

        session.setAttribute("hodnota", request.getParameter("hodnota"));

        PrintWriter writer = response.getWriter();

        if (value != null) {
            writer.println("Puvodni hodnota: " + value +"<br />");
        }

        writer.println("Nova hodnota: " + request.getParameter("hodnota") + "<hr>");
        writer.println("<a href=\"session.html\">Zpět na formulář</a>");
        writer.close();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        processRequest(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        processRequest(req, res);
    }
}
