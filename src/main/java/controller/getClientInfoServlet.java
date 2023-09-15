package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserNameGenerator;

/**
 * Servlet implementation class getClientInfoServlet
 */
@WebServlet("/getClientInfoServlet")
public class getClientInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getClientInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		
		UserNameGenerator userName = new UserNameGenerator(fName, lName);
		
		request.setAttribute("userNameBadge", userName);
		
		getServletContext().getRequestDispatcher("/userResult.jsp").forward(request,  response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userName.toString());
		//writer.close();
	}

}
