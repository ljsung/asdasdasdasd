package com.greedy.el.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greedy.el.model.dto.MemberDTO;


@WebServlet("/test4")
public class TestFourServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDTO requestMember =
				new MemberDTO("이준성", 20, "010-1231-1231", "ljs@greedy.com");
		MemberDTO sessionMember =
				new MemberDTO("이이이", 10, "010-2322-1233", "ddd@greedy.com");
		
		request.setAttribute("member", requestMember);
		request.getSession().setAttribute("member", sessionMember);
		
		request.getRequestDispatcher("Views/el/testEl4.jsp").forward(request, response);
	}

}
