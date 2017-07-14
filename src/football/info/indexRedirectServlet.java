package football.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class indexRedirectServlet
 */
@WebServlet("/indexRedirect")
public class indexRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input = (String)request.getParameter("leagueInfo");
		if(input.equals("1")) response.sendRedirect("/standings");
		else if(input.equals("2")) response.sendRedirect("/topScorer");
		else if(input.equals("3")) response.sendRedirect("/mostAssists");
		else if(input.equals("4")) response.sendRedirect("/mostCleansheets");
		else if(input.equals("5")) response.sendRedirect("/mostSaves");
		else if(input.equals("6")) response.sendRedirect("/clubInfo");
	}

}
