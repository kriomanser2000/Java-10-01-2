package com.example.multtable;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "multiplicationServlet", value = "/multiplication-servlet")
public class MultiplicationServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            String numberStr = request.getParameter("number");
            int number = Integer.parseInt(numberStr);
            out.println("<html><body>");
            out.println("<h2>Multiplication Table for " + number + ":</h2>");
            out.println("<table border='1'>");
            for (int i = 1; i <= 10; i++)
            {
                out.println("<tr><td>" + number + " * " + i + " = " + (number * i) + "</td></tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        }
        catch (NumberFormatException e)
        {
            out.println("<html><body>");
            out.println("<p style='color:red;'>Incorrect.</p>");
            out.println("</body></html>");
        }
        finally
        {
            out.close();
        }
    }
}
