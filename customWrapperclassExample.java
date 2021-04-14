package com.rakesh;


class MyInteger{
    private int i;
    MyInteger(int j){
        i=j;

    }
    //public api
    public int intvalue()
    {
        return i;
    }
}


public class customWrapperclassExample {
    public static void main(String[] args) {
        int x=10;
        //java define wrapperclass
        Integer y=new Integer(x);
        System.out.println(y.intValue());
        // using costm wapper class
        MyInteger z=new MyInteger(x);
        System.out.println(z.intvalue());

    }
}
