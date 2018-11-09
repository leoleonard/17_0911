import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "KonwerterOdleglosciServlet")
public class KonwerterOdleglosciServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double[] odleglosci = Konwerter.konwerterOdleglosci(request.getParameter("metry"), request.getParameter("centymetry"),request.getParameter("milimetry"));

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if(odleglosci == null){
            writer.println("Proszę wpisać jednostkę odległości miar" + "<br>" + "<br>");
        } else {
            writer.println("Podana odległość w przeliczeniu na" + "<br>" + "<br>");
            writer.println("metry: " + odleglosci[0] + "<br>");
            writer.println("centymetry: " + odleglosci[1] + "<br>");
            writer.println("milimetry: " + odleglosci[2] + "<br>");
        }
    }
}
