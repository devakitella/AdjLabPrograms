package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Websites
 */
@WebServlet("/Websites")
public class Websites extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Websites() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String value = request.getParameter("websites");
		
		if(value.equals("google")) {
			response.sendRedirect("https://www.google.com");
		}
		else if(value.equals("twitter")) {
			response.sendRedirect("https://www.twitter.com");
		}
		else if(value.equals("amazon")) {
			response.sendRedirect("https://www.amazon.in");
		}
		else if(value.equals("bookmyshow")) {
			response.sendRedirect("https://in.bookmyshow.com");
		}
		else if(value.equals("netflix")) {
			response.sendRedirect("https://www.netflix.com/in/");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
