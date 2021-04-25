package org.example;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Kitchen kitchen = new Kitchen();
        Employee chef = new Chef("Gordon", LocalDate.of(1950, 10, 1), 1);
        Employee cook1 = new Cook("Bob", LocalDate.of(1970, 10, 1), 1);
        Employee cook2 = new Cook("John", LocalDate.of(1980, 10, 1), 1);
        Employee helper1 = new KitchenHelper("John", LocalDate.of(1980, 10, 1), 1);
        Employee[] employees = {chef, cook1, cook2, helper1};
        for (Employee employee : employees) {
            kitchen.hire(employee);
        }
        kitchen.makeDinner();
    }
}
