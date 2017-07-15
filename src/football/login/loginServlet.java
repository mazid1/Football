<<<<<<< HEAD
package football.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		loginService data = new loginService();
		//System.out.println(username + " " + password);
		
		//if(password.equals("correct"))
		if(password.equals(data.query("users","passwd","username",username)))
		{
			request.getSession().setAttribute("username", username);
			response.sendRedirect("index.jsp");
			return;
		}
		else
		{
			response.sendRedirect("loginFailure.jsp");
		}
	}

}
=======
package football.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		loginService data = new loginService();
		//System.out.println(username + " " + password);
		
		//if(password.equals("correct"))
		if(password.equals(data.query("users","passwd","username",username)))
		{
			request.getSession().setAttribute("username", username);
			response.sendRedirect("loginSuccess.jsp");
			return;
		}
		else
		{
			response.sendRedirect("loginFailure.jsp");
		}
	}

}
>>>>>>> 5daaf1ccd19969ba7f853ca9f5a1e79903d86b30
