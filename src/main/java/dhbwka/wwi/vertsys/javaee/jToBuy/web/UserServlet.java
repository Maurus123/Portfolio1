/*
 * Copyright © 2018 Dennis Schulmeister-Zimolong
 * 
 * E-Mail: dhbw@windows3.de
 * Webseite: https://www.wpvs.de/
 * 
 * Dieser Quellcode ist lizenziert unter einer
 * Creative Commons Namensnennung 4.0 International Lizenz.
 */
package dhbwka.wwi.vertsys.javaee.jToBuy.web;

import dhbwka.wwi.vertsys.javaee.jToBuy.ejb.UserBean;
import dhbwka.wwi.vertsys.javaee.jToBuy.ejb.ValidationBean;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hendrik
 */
@WebServlet(urlPatterns = {"/user/"})
public class UserServlet extends HttpServlet {
    @EJB
    ValidationBean validationBean;
            
    @EJB
    UserBean userBean;
    private Object createUserForm;
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        
    }
}