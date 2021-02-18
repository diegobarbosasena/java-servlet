package br.com.diego.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/new-company")
public class NewCompanyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("creating a new company");

		request.setCharacterEncoding("UTF-8");
		String companyName = request.getParameter("companyName");

		Company company = new Company();
		company.setName(companyName);

		FakeDataBase fakeDataBase = new FakeDataBase();
		fakeDataBase.save(company);

		PrintWriter out = response.getWriter();
		out.println("<html> <body>");
		out.println("<h2> " + companyName + " company successfully registered </h2>");
		out.println("</body> </html>");
	}
}
