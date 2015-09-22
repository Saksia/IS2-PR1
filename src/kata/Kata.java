/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
        
        Calendar f = GregorianCalendar.getInstance();
        f.set(1990,7,12);
        p1 = new Person("GÜISANTE", "Lore", f);
        System.out.println("Full name: "+p1.getFullName());
        System.out.println("Birthday: "+p1.getBday().getTime());
        System.out.println("Age: "+p1.getAge());
        
    }
}
