package org.eclipse.jetty.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.sendRedirect("index.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        if (request.getParameter("username") != null)
        {
            if (request.getSession() != null)
            {
                request.getSession().invalidate();
            }
            request.getSession(true).setAttribute("loggedin", request.getParameter("username"));
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }
        response.sendRedirect("index.jsp");
    }
}
