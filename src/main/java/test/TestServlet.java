package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=euc-kr");
		java.io.PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>hello,</h1>");
		out.print("<h2>world!</h2>");
		out.print("</body></html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

		response.setContentType("text/html; charset=euc-kr");
		java.io.PrintWriter out = response.getWriter();
		
		String gender = request.getParameter("gender");
		out.print("<html><body>");
		out.print("<h1>hello, "+ gender +"</h1>");
		out.print("<h2>world!</h2>");
		out.print("</body></html>");
		out.close();
	}

}
