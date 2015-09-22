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
public class Person {
    private final String name;
    private final String surname;
    private final Date birthday;

    public Person(String name, String surname, Date bday) {
        this.name = name;
        this.surname = surname;
        this.birthday = bday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBday() {
        return birthday;
    }
    
    public String getFullName(){
        return name + " " + surname;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime()-birthday.getTime())/(60*60*1000*24*365.25));
    }
    
}
