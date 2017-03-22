package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modal.LoginService;

public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = -970318451546429360L;

	private LoginService logService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		logService = new LoginService();
	//	String dburl = config.getInitParameter("dburl");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String nextPage = "/login.jsp";

		String action = req.getParameter("action");


		if ("login".equalsIgnoreCase(action)) {
			String user = req.getParameter("username");
			String password = req.getParameter("password");
			boolean isValidUser = logService.isValid(user, password);
			if (isValidUser) {
				nextPage = "/email.jsp";
			} else {
				nextPage = "/error.jsp";
			}

		}

		RequestDispatcher reqDisp = req.getRequestDispatcher(nextPage);
		reqDisp.forward(req, resp);

	}

}
