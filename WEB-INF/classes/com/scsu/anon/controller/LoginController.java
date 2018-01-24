package com.scsu.anon.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scsu.anon.dao.LoginDao;
import com.scsu.anon.model.LoginModel;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		LoginDao loginDao = new LoginDao();
		loginDao.setUsername(uname);
		loginDao.setPassword(password);
		
		List<LoginDao> loginList = new ArrayList<LoginDao>();
		loginList.add(loginDao);
		
		LoginModel loginModel = new LoginModel();
		String responseMessage = loginModel.login(loginList);
		if(responseMessage.equalsIgnoreCase("SUCCESS")){
			request.getSession();
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}		
	
		
		
	}

}
