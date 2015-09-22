/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Kata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Person p1;
        Date bday = new Date(95, 1, 1);
        p1 = new Person("GÜISANTE", "Lorenzo", bday);
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
        
    }
}
