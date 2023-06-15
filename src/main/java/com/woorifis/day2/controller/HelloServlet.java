package com.woorifis.day2.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class HelloServlet
 */
// 골뱅이는 에너테이션?
//@WebServlet(a= {"/hi", "/hello"})
//		description = "처음이에요.", 
//		urlPatterns = { 
//				"/HelloServlet", 
//				"/hi" 이거 대신 밑에
	//	})
//@WebServlet (urlPatterns = {"/hi", "/hello"})
//@WebServlet (value = {"/hi", "/hello"})
//@WebServlet ({"/hi", "/hello"})
//@WebServlet ({"/hi"})
//@WebServlet ("/hi")
@Slf4j
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("rawtypes") //여기에 value 생략되어 있어
	List list;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//@Deprecated(since = "2002.02.02") // 이 해부터 적용이 되었다
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.debug("main은 tomcat이구나 !!!");
		log.debug("서블릿 호출됨 : {} ", request.getServletPath());
		response.getWriter().append("Served at: ").append(new Date().toString());
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
