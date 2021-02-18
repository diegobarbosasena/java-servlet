package br.com.diego.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListCompanyServlet
 */
@WebServlet("/companies")
public class ListCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		FakeDataBase fakeDataBase = new FakeDataBase();
		List<Company> companies = fakeDataBase.getCompanies();

		PrintWriter out = response.getWriter();

		out.println("<html> <body>");
		out.println("<ul>");

		for (Company company : companies) {
			out.println("<li>" + company.getName() + "</li>");
		}

		out.println("</ul>");
		out.println("</html> </body>");
	}
}
