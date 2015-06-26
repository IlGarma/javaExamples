package org.examples.generics;

import java.util.Comparator;

/**
 * Description: TODO.
 * Created by
 * @author garmeno
 * on 26/06/15
 */

public class GenericExtends <K extends Comparable<K>, T extends Comparable<T>> {
    private K parameter;
    private T parameter1;

    public GenericExtends(K parameter, T parameter1) {
        this.parameter = parameter;
        this.parameter1 = parameter1;
    }

    public K getParameter() {
        return this.parameter;
    }

    public T getParameter1() {
        return this.parameter1;
    }


    public void compareNumber (GenericExtends <K , T> ob) {

        K parameterSecondElement = ob.getParameter();
        T parameter1SecondElement = ob.getParameter1();

        if (parameter.compareTo(parameterSecondElement) == 0) {
            if (parameter1.compareTo(parameter1SecondElement) ==0)
                System.out.println("The two object have the same values");
            else if (parameter1.compareTo(parameter1SecondElement) < 0)
                System.out.println("The first value is the same, but the second is minor");
            else
                System.out.println("The first element is the same, but the second is major");
        } else if (parameter.compareTo(parameterSecondElement) >0 ) {
            if (parameter1.compareTo(parameter1SecondElement) == 0 )
                System.out.println("The first value is major, but the second is the same");
            else if (parameter1.compareTo(parameter1SecondElement)<0)
                System.out.println("The first valie is major and the second value is minor");
            else
                System.out.println("The first and the second value are major");
        } else {
            if (parameter1.compareTo(parameter1SecondElement) == 0)
                System.out.println("The first value is minor and the second value is the same");
            else if (parameter1.compareTo(parameter1SecondElement) > 0)
                System.out.println("The first value is minor but the second value is major");
            else
                System.out.println("The first and the second values are minor");
        }
    }

}
