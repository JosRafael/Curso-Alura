package br.com.alura.gerenciadorr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//OI
@WebServlet(urlPatterns = "/Ola")
public class OiMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello Mundo, escrevendo meu primeiro Servlet!");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet foi chamado! ");
			
	}
	
}
