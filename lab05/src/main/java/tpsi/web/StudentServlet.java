/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import newpackage.Student;

/**
 *
 * @author dom
 */
@WebServlet(name = "StudentServlet", urlPatterns = {"/student"})
public class StudentServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        request.getRequestDispatcher("student.jsp").forward(request, response);
        
        }
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session=request.getSession();
        String imie = request.getParameter("firstName");
        String nazwisko = request.getParameter("lastName");
        String mail = request.getParameter("emailAddress");
        Student m1= new Student(imie,nazwisko,mail);
        
        if(session.isNew()){
            session = request.getSession();
            List<Student>osoby = new ArrayList<>();
            osoby.add(m1);
            session.setAttribute("osoby", osoby);
        }else{
            if(session.getAttribute("osoby")!=null){
                List<Student>osoby = (List<Student>) session.getAttribute("osoby");
                osoby.add(m1);
                session.setAttribute("osoby", osoby);
            }else{
                 List<Student>osoby = new ArrayList<>();
                 osoby.add(m1);
                 session.setAttribute("osoby", osoby);
            }
            
        }
        doGet(request, response);
        }
        
        
    
    }

