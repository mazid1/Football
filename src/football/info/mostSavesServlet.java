package football.info;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import football.login.Jdbc;

/**
 * Servlet implementation class mostSavesServlet
 */
@WebServlet("/mostSaves")
public class mostSavesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Jdbc data = new Jdbc();
		ArrayList<Player> standings = data.fetchSaves();
		
		System.out.println("test" + standings.get(0).Name + standings.get(0).Saves);
		
		HttpSession session = request.getSession();
		session.setAttribute("data", standings);
		
		response.sendRedirect("mostSaves.jsp");
	}

}
