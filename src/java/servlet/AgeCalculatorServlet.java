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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        try{
       
            int ageNumber = Integer.parseInt(request.getParameter("age"));
            request.setAttribute("age", ageNumber);
        
            if(ageNumber >= 0){
            
                ageNumber = ageNumber + 1;
                request.setAttribute("message", "Your age next birthday will be " + ageNumber);
                
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                   .forward(request, response);

                }
            }
        catch(IOException e){
               
             }
        finally{
            request.setAttribute("message", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
        }
  
        }
  
    }

   
 

