/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MyInterface.DIP.Violation;

/**
 *
 * @author 211072478
 */
public class IntValidation {
   
    private int age;
    private ErrorMessage errMsg;
    public int validateInteger(String strAge)
    {
        try
        {
            age = Integer.parseInt(strAge);
        }
        catch(Exception ex)
        {
            errMsg.intErrorMessage();
            return 0;
        }
        return age;
    }
}
