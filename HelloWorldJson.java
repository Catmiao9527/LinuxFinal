import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.google.gson.*;

public class HelloWorldJson extends HttpServlet {

	   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("application/json;charset=UTF-8");
	      response.setCharacterEncoding("UTF-8");
	      PrintWriter out = response.getWriter();
	      Gson gson = new Gson();
	      Student stu = new Student("lllllll");
	      String json = gson.toJson(stu);
	      out.println(json);
	      out.flush();
	      out.close();
	   }
	}
class Student{
	private String stu;
	public Student (String stu) {
		this.stu = stu;
	}
	public String getStu(){
		return stu;
	}
	public void setStu(String stu) {
		this.stu = stu;
	}
	public String toString() {
		
		return "Student:"+'\r'+
				"stu="+stu+";\r"
				;
		
	}
}
