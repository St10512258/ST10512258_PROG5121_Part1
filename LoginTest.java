/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatappart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
public class LoginTest {
    
 */
  public class LoginTest{
  Login login = new Login();
  
  @Test
  public void testValidUsername(){
   //Ensures username is not longer than five characters and it has an underscore
   assertTrue(login.checkUsername("kyl_1"));
  }
  @Test
  public void testInvalidUsername_NoUnderscore(){
  //tells user that the username should contain of an underscore
  assertFalse(login.checkUsername("kyl"));
  
  }
  
  @Test
  public void testInvaludUsername_TooLong(){
  //tells the user that the username might be too long
  assertFalse(login.checkUsername("kyle!!!!!!!!!"));
  }
  
  @Test
  public void testValidPassword(){
  //This contains of a valid password that contains exactly eight characters, has number and a special character
  assertTrue(login.checkPassword("Ch&&sec@ke99!"));
  
  
  }
  @Test
  public void testInvalidPassword(){
      //informs user about absent capitals,numbers and special characters
      assertFalse(login.checkPassword("password"));
      
              
  }
  @Test
  public void testValidPhoneNumber(){
      //NUumber now consists of valid international code
      assertTrue(login.checkCellNumber("+27838968976"));
      
          
  
  }
  @Test
  public void testInvalidPhoneNumber(){
      //user cellphone number does not have correct international code
      assertFalse(login.checkCellNumber("08966553"));
  }
  
}
