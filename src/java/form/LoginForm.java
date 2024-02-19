/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author yruj
 */
public class LoginForm extends ActionForm {
      String id,pass;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
  
    
}
