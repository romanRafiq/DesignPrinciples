/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testPrinciples;

import com.MyInterface.Encapsulation.Person;
import com.MyInterface.Inheritance.Player;
import static org.testng.Assert.*;

/**
 *
 * @author Roman
 */
public class InheritanceTest {
    
    private static ApplicationContext ctx;
    private static Person person;
    
    public InheritanceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testInheritance()
    {        
        person = new Player();
         Assert.assertTrue(person instanceof Person);
        
      
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
         ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        person = (Player)ctx.getBean("InheritanceClass");
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
