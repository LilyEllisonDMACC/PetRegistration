package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PetInfoProcessor;

/**
 * Servlet implementation class getPetInfoServlet
 */
@WebServlet("/getPetInfoServlet")
public class getPetInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPetInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String petName = request.getParameter("pName");
		String petSex = request.getParameter("pSex");
		
		PetInfoProcessor fetchPet = new PetInfoProcessor(petName, petSex);
		
		request.setAttribute("userPet", fetchPet);
		
		getServletContext().getRequestDispatcher("/petResult.jsp").forward(request,  response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(fetchPet.toString());
		//writer.close();
	}

}
