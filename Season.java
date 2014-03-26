import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Season extends HttpServlet {
        
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
  String s1;
   s1=request.getParameter("t1");
    
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   int i = Integer.parseInt(s1);
   if(((i>=1)&&(i<=4))||i==12)
   {
   	out.println("<meta HTTP-EQUIV=REFRESH content=0; url=http://www.google.com>");
   	}
   	if(((i>=5)&&(i<=6)))
   {
   	out.println("<meta HTTP-EQUIV=REFRESH content=0; url=http://www.google.com>");
   	}
   	if(((i>=7)&&(i<=11)))
   {
   	out.println("<meta HTTP-EQUIV=REFRESH content=0; url=http://www.google.com>");
   	}
   	
}
}