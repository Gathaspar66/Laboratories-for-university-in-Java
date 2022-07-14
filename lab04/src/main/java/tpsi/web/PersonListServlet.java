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

@WebServlet(name = "PersonListServlet", urlPatterns = {"/PersonList"})
public class PersonListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Person> osoby = new ArrayList<>();
        
        
        Person m1= new Person("Kacper","tak","wp1@wp.pl");
        Person m2= new Person("Darek","Sowa","wp2@wp.pl");
        Person m3= new Person("Jacek","Dupa","wp3@wp.pl");
        osoby.add(m1);
        osoby.add(m2);
        osoby.add(m3);
        request.setAttribute("osoby", osoby);
        
      request.getRequestDispatcher("PersonList.jsp").forward(request, response);
        
        
        
        
        }
    }
