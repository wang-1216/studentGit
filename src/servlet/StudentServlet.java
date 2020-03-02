package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;
import service.StudentService;
@WebServlet("/Check")
public class StudentServlet extends HttpServlet {
	private StudentService ss = new StudentService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> lists = ss.check();
		req.setAttribute("lists", lists);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
