package org.examples.generics;

/**
 * Description: TODO.
 * Created by
 * @author garmeno
 * on 26/06/15
 */

public class GenericTwoWildcards<K,T> {
    private K paramater;
    private T parameter1;


    public GenericTwoWildcards(K parameter, T parameter1) {
        this.paramater = parameter;
        this.parameter1 = parameter1;
    }

    public K getParamater() {
        return this.paramater;
    }

    public T getParameter1() {
        return this.parameter1;
    }

    public void compareClass(GenericTwoWildcards<?,?> ob) {
        if (paramater.getClass().getName() == ob.getParamater().getClass().getName() &&
            parameter1.getClass().getName() == ob.getParameter1().getClass().getName()) {
            System.out.println("The parameters have the Same classes");
        } else {
            System.out.println("The paramaters have different classes");
        }
    }

}
