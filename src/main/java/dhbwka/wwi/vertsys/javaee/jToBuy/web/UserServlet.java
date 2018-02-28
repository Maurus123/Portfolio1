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
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

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
    
    
}
