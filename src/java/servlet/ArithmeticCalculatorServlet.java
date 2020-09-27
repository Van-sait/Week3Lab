/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 798382
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        try{
        int firstNum = Integer.parseInt(request.getParameter("firstnumber"));
        int secondNum = Integer.parseInt(request.getParameter("secondnumber"));
        request.setAttribute("firstnumber", firstNum);
        request.setAttribute("secondnumber", secondNum);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        }
        catch(IOException e){
            
        }
        finally{
            
        }
    }



}
