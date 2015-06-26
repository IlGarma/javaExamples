package org.examples.generics;

/**
 * Description: TODO.
 * Created by
 * @author garmeno
 * on 25/06/15
 */

public class TestAll {

    public static void main(String[] args) {
        Generic <Integer> integer1= new Generic<Integer>(85);

        integer1.getInfoClass();


        GenericTwo <Integer, String> integerString = new GenericTwo<Integer, String>(88, "Test");
        integerString.getInformation1();
        integerString.getInformation2();

        integerString.compare(new GenericTwo<Integer,String>(88, "Test"));
        integerString.compare(new GenericTwo<Integer,String>(88, "Tekst"));

        GenericTwoWildcards <String, Double > genericTwoWildcards = new GenericTwoWildcards<String, Double>("peppe", 88.99);
        genericTwoWildcards.compareClass(new GenericTwoWildcards<Double, String>(99.99, "Ciao"));
        genericTwoWildcards.compareClass(new GenericTwoWildcards<String, Double>("Los", 123.99));

        GenericExtends < Integer, Double > genericExtends = new GenericExtends<Integer, Double>(20, 33.9999);
        genericExtends.compareNumber(new GenericExtends<Integer, Double>(20, 33.9999));
        genericExtends.compareNumber(new GenericExtends<Integer, Double>(21, 33.9999));
        //genericExtends.compareNumber(new GenericExtends<Double, Integer>(21.01, 33)); compilation error since genericExtends is <Integer, Double>

    }
}
