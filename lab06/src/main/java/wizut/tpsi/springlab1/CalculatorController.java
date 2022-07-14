/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.springlab1;


import static javax.management.Query.value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Gathaspar96
 */
@Controller
public class CalculatorController {
@RequestMapping("/")
public String home(Model model) {
     return "home";
   }
@RequestMapping("/hello")
public String hello(Model model, CalculatorForm kalkulator) {

Integer x=kalkulator.getx();
Integer y=kalkulator.gety();
model.addAttribute("x", x);
model.addAttribute("y", y);
  switch(kalkulator.getoperator())
           {
           case "dodawanie":
               kalkulator.setoperator("+");
               model.addAttribute("operator",kalkulator.getoperator());
               model.addAttribute("wynik", x+y);  
                    break;
           case "odejmowanie":
               kalkulator.setoperator("-");
               model.addAttribute("operator",kalkulator.getoperator());
                model.addAttribute("wynik", x-y);  
                   break;
            case "mnozenie":
                kalkulator.setoperator("*");
                model.addAttribute("operator",kalkulator.getoperator());
                model.addAttribute("wynik", x*y);  
                   break;                  
                  
        
   }
return "hello";

}

    
}

/*public String hello(Model model,Integer y,Integer x,String action) {
    
     model.addAttribute("x", x);
     model.addAttribute("y", y);
    
    
   switch(action)
           {
           case "dodawanie":
                model.addAttribute("operator","+");
                 model.addAttribute("wynik", x+y);  
                    break;
           case "odejmowanie":
               model.addAttribute("operator","-");
                model.addAttribute("wynik", x-y);  
                   break;
            case "mnozenie":
                model.addAttribute("operator","*");
                   model.addAttribute("wynik", x*y);  
                      break;                  
                  
        
   }
    return "hello";
}*/

