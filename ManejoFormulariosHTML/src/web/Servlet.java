package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
@WebServlet("/Servlet")
public class Servlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/Html;charset-UTF-8");
		PrintWriter out= response.getWriter();
		String usuario= request.getParameter("usuario");
		String password=request.getParameter("password");
		String tecnologia[]= request.getParameterValues("tecnologia");
		String genero =request.getParameter("genero");
		String ocupacion = request.getParameter("ocupacion");
		String musica[]= request.getParameterValues("musica");
		String comentarios= request.getParameter("comentario");
		
		out.print("<Html>");
		out.print("<head>");
		out.print("<title> Respuestas del servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Parametros procesados por el Servlet: </head>");
		out.print("<table border='1'>");
		out.print("<tr>");
		out.print("<td>");
		out.print("usuario");
		out.print("</td>");
		out.print("<td>");
		out.print(usuario);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Password");
		out.print("</td>");
		out.print("<td>");
		out.print(password);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Tecnologias");
		out.print("</td>");
		out.print("<td>");
	for(String tecnologias : tecnologia) {
			out.print(tecnologias);	
			out.print(" / ");
			
		}
		out.print("</td>");
		out.print("</tr>");
	
		out.print("<tr>");
		out.print("<td>");
		out.print("Genero");
		out.print("</td>");
		out.print("<td>");
		out.print(genero);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Ocupacion");
		out.print("</td>");
		out.print("<td>");
		out.print(ocupacion);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Musica");
		out.print("</td>");
		out.print("<td>");
	if(musica !=null)
		for(String musicas : musica) {
			out.print(musicas);	
			out.print(" / ");
			
		} else {
			
			out.print("Valor no proporcionado");
			
		}
		out.print("</td>");
		out.print("</tr>");
	
		out.print("<tr>");
		out.print("<td>");
		out.print("Comentario");
		out.print("</td>");
		out.print("<td>");
		out.print(comentarios);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("</table>");
		out.print("</body>");
		out.print("</Html>");
		
	}
	
}
