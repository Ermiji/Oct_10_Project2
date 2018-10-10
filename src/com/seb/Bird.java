package com.seb;

// we can extend a class into a more specific type
//by using the keyword: extends
public class Bird extends Animal {

    //we can add methods specific to our Bird class
    public String fly(){
        return "This bird is flying";
    }

    //we can override methods from the parent class
    @Override
    public String sleep(){
        return "This bird is sleeping";
    }
}
