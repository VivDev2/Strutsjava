/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import form.LoginForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author yruj
 */
public class LoginAction extends Action {
    
  
    public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest req, HttpServletResponse res)
    {
        
     LoginForm f = (LoginForm) form;
     if(f.getId().equals(f.getPass()))
         return map.findForward("success");
     else
         return map.findForward("failed");
    
   
    }
    
}
