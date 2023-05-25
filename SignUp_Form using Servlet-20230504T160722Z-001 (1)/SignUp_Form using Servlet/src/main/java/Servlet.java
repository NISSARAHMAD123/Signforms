

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet() {
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "       <title>sign up</title>\r\n"
				+ "       <style>\r\n"
				+ "       body{\r\n"
				+ "           background-repeat:no-repeat;\r\n"
				+ "           background-size:100% 100%;\r\n"
				+ "           background-attachment:fixed}\r\n"
				+ "       div {height:80%;width:30%;\r\n"
				+ "            margin-left:35%;\r\n"
				+ "	        margin-top:35px;\r\n"
				+ "	        padding:3%;\r\n"
				+ "	        border:5px solid red;\r\n"
				+ "	        border-top-right-radius:30px;\r\n"
				+ "	        border-bottom-left-radius:30px;\r\n"
				+ "	        text-align:justify;\r\n"
				+ "	        background-color:white;box-shadow:5px 10px 15px red}\r\n"
				+ "        input { border-top:none;border-left:none;border-right:none}	\r\n"
				+ "		#q1 {width:200px;border-top-right-radius:30px;\r\n"
				+ "	        border-bottom-left-radius:30px;box-shadow:5px 10px 15px red;cursor:pointer}\r\n"
				+ "	    .q1:hover {background-image:linear-gradient(90deg, rgba(246,171,218,1) 50%, rgba(252,176,69,1) 100%)}\r\n"
				+ " \r\n"
				+ "        </style>\r\n"
				+ "    </head>\r\n"
				+ "<body background=\"fruit.jpg\">\r\n"
				+ "<div class=\"q1\" >\r\n"
				+ "<form style=\"font-size:25px\">\r\n"
				+ "<label>First name:- </label><input type=\"text\" placeholder=\"First name\"><br><br>\r\n"
				+ "<label>Last name:- </label><input type=\"text\" placeholder=\"Last name\"><br><br>\r\n"
				+ "<label>Phone number:- </label><input type=\"number\" placeholder=\"Phone number\"><br><br>\r\n"
				+ "<label>Email id:- </label><input type=\"email\" placeholder=\"Email id\"><br><br>\r\n"
				+ "<label>Date of birth:- </label><input type=\"date\" placeholder=\"Date of birth\"><br><br>\r\n"
				+ "<label>Gender:- </label><br><label>Male</label><input type=\"radio\" name=\"g\"><label>Female</label><input type=\"radio\" name=\"g\"><label>Others</label><input type=\"radio\" name=\"g\"><br><br>\r\n"
				+ "<label>File upload:- </label><input type=\"file\"><br><br>\r\n"
				+ "<label>Password:- </label><input type=\"password\" placeholder=\"password\"><br><br>\r\n"
				+ "<label>Confirm password:- </label><input type=\"password\" placeholder=\"Confirm password\"><br><br>\r\n"
				+ "<input type=\"checkbox\"><label style=\"font-size:15px\" >Terms and conditions</label<br><br><br>\r\n"
				+ "<input id=\"q1\" type=\"submit\" >\r\n"
				+ "</form>\r\n"
				+ "</div>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
