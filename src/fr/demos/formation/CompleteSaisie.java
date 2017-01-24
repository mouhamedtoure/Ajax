package fr.demos.formation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompleteSaisie
 */
@WebServlet("/CompleteSaisie")
public class CompleteSaisie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CompleteSaisie() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String saisie = request.getParameter("saisie");
		saisie= saisie.trim();
		if (saisie.equals("") || saisie == null) {
			out.println("Vide");

		} else {

			char c = saisie.toUpperCase().charAt(0);

			switch (c) {

			case 'A':
				out.println("Accenture");
				break;
			case 'D':
				out.println("Demos");
				break;
			default:
				out.println("zzzzzz");
				break;

			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
