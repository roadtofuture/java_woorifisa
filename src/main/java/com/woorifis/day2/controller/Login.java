package com.woorifis.day2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
@Slf4j
public class Login extends HttpServlet {
	

	
	
	@Override
		public void init() throws ServletException {
			// TODO Auto-generated method stub
			super.init();
			log.debug("init 호출됨 - 서블릿에서 필요한 리소스를 초기화 한다");
		}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		log.debug("넌 언제 되니? init에서 초기화한 리소스를 닫는다");
	}
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터 가져오기 
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		log.debug("get: id; {}, pass: {} -  생성된 리소스 활용, id, pass");
		
		//id & pass를 db에 가서 확인한다 
		
		//응답
		String msg = "<html><body><h1>홍길동님 반갑</h1></body></html>";
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(msg);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//post는 명시적인 char enconding 선언 필요!!!
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		log.debug("post: id; {}, pass: {}, id, pass");
		
		//id & pass를 db에 가서 확인한다 
		
		//응답
		String msg = "<html><body><h1>홍길동님 반갑</h1></body></html>";
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(msg);
	}
}


