/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MyInterface.DIP.Correction;

import com.MyInterface.DIP.Violation.ErrorMessage;

/**
 *
 * @author 211072478
 */
public class IntValidation implements ErrorMessageInterface{

    private int age;
    
    public int validateInteger(String strAge) {
         try
        {
            age = Integer.parseInt(strAge);
        }
        catch(Exception ex)
        {
            intErrorMessage();
            return 0;
        }
        return age;
    }

    public String intErrorMessage() {
          return "Number entered is not a correct digit";
    }
    
}
