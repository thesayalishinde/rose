package CookieEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookie extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			
			String d = request.getParameter("userName");
			Cookie cookie = new Cookie("MyCookie", d);
			response.addCookie(cookie);
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			pwriter.println("Cookie is set to: "+d);
			pwriter.close();
			
		}
		catch (Exception exp) {
			System.out.println(exp);
		}
	}
}
