package football.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
		String confirm=(String)request.getParameter("confirm");
		
		loginService data = new loginService();
		String pass = data.query("users","passwd","username",username);
		if(pass.equals("")==false)
		{
			HttpSession session = request.getSession();
			session.setAttribute("errorType", "username");
			response.sendRedirect("registerFailure.jsp");
			return;
		}
		
		if(password.equals(confirm)==false)
		{
			HttpSession session = request.getSession();
			session.setAttribute("errorType", "password");
			response.sendRedirect("registerFailure.jsp");
			return;
		}
		
		String email=(String)request.getParameter("email");
		String question=(String)request.getParameter("question");
		int ques=0;
		System.out.println(question);
		if(question.equals("1")) ques = 1;
		else if(question.equals("2")) ques = 2;
		else if(question.equals("3")) ques = 3;
		else if(question.equals("4")) ques = 4;
		else if(question.equals("5")) ques = 5;
		String ans=(String)request.getParameter("answer");
		String team=(String)request.getParameter("myteam");
		Jdbc jdbc=new Jdbc();
		System.out.println(username);
		jdbc.newUsersRow(username,password,email,ques,ans,team);
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		response.sendRedirect("index.jsp");
		//request.
	}
}
