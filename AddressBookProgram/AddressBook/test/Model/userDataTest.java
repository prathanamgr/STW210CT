/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.userController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class userDataTest {

    userData ud;
    userController userC;

    public userDataTest() {
    }

    @Before
    public void setUp() {
        ud = new userData();
        userC = new userController();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        int id = 1, myId;
        ud.setId(1);
        myId = ud.getId();
        assertEquals(id, myId);
    }

    @Test
    public void testAddNewContacts() {
        String fname="abc";
        String lname="cbd";
        String email="abcd@gmail.com";
        String mobile="8784554";
        String tel="014785122";
        String address="kathmandu";
        
        ud.setFname(fname);
        ud.setEmail(email);
        ud.setLname(lname);
        ud.setAddress(address);
        ud.setTel(tel);
        ud.setMobile(mobile);
        
        int addContactResponse= userC.addContacts(ud);
        
        assertEquals(0, addContactResponse);
    }
    
    @Test
    public void testAddNewContact2() {
        String fname="abc";
        String lname="cbd";
        String email="abcde@gmail.com";
        String mobile="9998995666";
        String tel="014785122";
        String address="kathmandu";
        
        ud.setFname(fname);
        ud.setEmail(email);
        ud.setLname(lname);
        ud.setAddress(address);
        ud.setTel(tel);
        ud.setMobile(mobile);
        
        int addContactResponse= userC.addContacts(ud);
        
        assertEquals(1, addContactResponse);
    }
    
        @Test
    public void testAddNewContact3() {
        String fname="abc";
        String lname="cbd";
        String email="abcdef@gmail.com";
        String mobile="9810481862";
        String tel="014785122";
        String address="kathmandu";
        
        ud.setFname(fname);
        ud.setEmail(email);
        ud.setLname(lname);
        ud.setAddress(address);
        ud.setTel(tel);
        ud.setMobile(mobile);
        
        int addContactResponse= userC.addContacts(ud);
        
        assertEquals(2, addContactResponse);
    }
    

    @Test
    public void testGetFname() {
        String fname = "John", testFname;
        ud.setFname("John");
        testFname = ud.getFname();
        assertEquals(fname, testFname);
    }

    @Test
    public void testGetEmail() {
        String gmail = "john@gmail.com", testgmail;
        ud.setEmail("john@yahoo.com");
        testgmail = ud.getEmail();
        assertEquals(gmail, testgmail);
    }

}
