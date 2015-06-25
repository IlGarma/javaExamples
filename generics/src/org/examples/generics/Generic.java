package org.examples.generics;

/**
 * Description: TODO.
 * on 25/06/15
 */

public class Generic<T> {

    private T parameter;


    public Generic (T parameter) {
        this.parameter = parameter;
    }

    public T getParameter() {
        return this.parameter;
    }

    public void getInfoClass() {
        System.out.println(parameter.getClass().getName());
    }

}
