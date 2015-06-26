package org.examples.generics;

/**
 * Description: TODO.
 * Created by
 * @author garmeno
 * on 25/06/15
 */

public class GenericTwo<K,T> {

    private T parameter1;
    private K parameter2;


    public GenericTwo(K paramater2, T parameter1) {
        this.parameter1 = parameter1;
        this.parameter2 = paramater2;
    }

    public void getInformation1() {
        System.out.println(parameter1.getClass().getName());
    }


    public T getParameter1() {
        return parameter1;
    }

    public  K getParameter2() {
        return parameter2;
    }

    public void getInformation2() {
        System.out.println(parameter2.getClass().getName());
    }

    public void compare (GenericTwo<K,T> test) {
        if (parameter2 == test.getParameter2() && parameter1 == test.getParameter1()) {
            System.out.println("Parameters with the same value");
        } else {
            System.out.println("Parameters with different values");
        }
    }

}
