import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "KonwerterWagServlet")
public class KonwerterWagServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double[] wagi = Konwerter.konwerterWag(request.getParameter("kilogramy"), request.getParameter("gramy"), request.getParameter("miligramy") );

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if(wagi == null) {
            writer.println("Proszę wpisać jedną wartość wag" + "<br>" + "<br>");
        } else {
            writer.println("Podana Wartość w przeliczeniu na" + "<br>" + "<br>");
            writer.println("kilogramy: " + wagi[0] + "<br>");
            writer.println("gramy: " + wagi[1] + "<br>");
            writer.println("miligramy: " + wagi[2] + "<br>");
        }
    }
}
