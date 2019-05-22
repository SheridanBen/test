/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * date of death: blah blah blah.
 */
package softonic;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 * @author Sivagama
 */
public class StudentDemo {

    private String name;
    private int n;
    int sid;

    //constructor
    public StudentDemo(String givenName,int n)
    {
        name=givenName;
        sid = n;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public void setName(String givenName) {
        name = givenName;
    }
    
    
}
