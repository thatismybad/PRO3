import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter writer = response.getWriter()) {
            String query = request.getQueryString();
            Enumeration e = request.getParameterNames();
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Můj první servlet 💙</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>Servlet na cestě '/" + request.getContextPath() + "'</h1><br />");

            writer.println("Parametry: <strong>" +  query+ "</strong><br />");

            while (e.hasMoreElements()) {
                String parameter = e.nextElement().toString();
                String value = request.getParameter(parameter);
                writer.println("Parametr: <strong>" + parameter + "</strong> - hodnota: <strong>" + value + "</strong><br />");
            }

            writer.println("</body>");
            writer.println("</html>");

        }
    }
}
