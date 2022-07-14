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
import newpackage.Person;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String imie = request.getParameter("firstName");
        String nazwisko = request.getParameter("lastName");
        String mail = request.getParameter("emailAddress");
        
        Person m1= new Person(imie,nazwisko,mail);
        
        
        
        request.setAttribute("m1", m1);
        
        
        List<String> dni = new ArrayList<>();
        dni.add("Poniedziałek");
        dni.add("Wtorek");
        dni.add("Środa");
        dni.add("Czwartek");
        dni.add("Piątek");
        request.setAttribute("dniTygodnia", dni);
        
        request.getRequestDispatcher("hello.jsp").forward(request, response);
        
        
        }
    }
