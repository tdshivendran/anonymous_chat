package com.scsu.anon.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scsu.anon.dao.NewUserDao;
import com.scsu.anon.model.NewUserRegistrationModel;


/**
 * Servlet implementation class NewUserRegistrationController
 */
@WebServlet("/NewUserRegistrationController")
public class NewUserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUserRegistrationController() {
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
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String pwd=request.getParameter("password");
		
		NewUserDao newUser = new NewUserDao();
		newUser.setFirstName(fname);
		newUser.setLastName(lname);
		newUser.setEmail(email);
		newUser.setPassword(pwd);
		
		/*NewUser newUser1 = new NewUser();
		newUser1.setFirstName("Swathi");
		newUser1.setLastName("Mannem");
		newUser1.seteMail("test@test.com");
		newUser1.setPassword("test");*/
		
		List<NewUserDao> newUserList = new ArrayList<NewUserDao>();
		newUserList.add(newUser);
		/*newUserList.add(newUser1);
		
		for(int i=0;i<newUserList.size();i++){
			System.out.println("first Name : "+newUserList.get(i).getFirstName());
		}
		for(NewUser user : newUserList){
			System.out.println("last name : "+user.getLastName());
			
		}*/
		
		NewUserRegistrationModel newUserRegistrationmodel = new NewUserRegistrationModel();
		String responseMessage = newUserRegistrationmodel.createNewUser(newUserList);
		if(responseMessage.equalsIgnoreCase("SUCCESS")){
			request.getRequestDispatcher("Regsuccesful.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("NewUserFailure.jsp").forward(request, response);
		}
		
	}

}
