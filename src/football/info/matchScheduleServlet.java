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
 * Servlet implementation class matchScheduleServlet
 */
@WebServlet("/matchSchedule")
public class matchScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Jdbc data = new Jdbc();
		ArrayList<Match> standings = data.fetchSchedule();
		
		System.out.println("test" + standings.get(0).Date + standings.get(0).Time);
		
		HttpSession session = request.getSession();
		session.setAttribute("data", standings);
		
		response.sendRedirect("matchSchedule.jsp");
	}

}
