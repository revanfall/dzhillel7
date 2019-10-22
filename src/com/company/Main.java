package com.company;

public class Main {

    public static void main(String[] args) {
        Collection c=new Collection(new String[]{"1","2","3"}); //через нью стринг задаю в конструктор массив строк
        c.addElem("8");
        System.out.println(c.getByIndex(1));
        c.contains("0");
        c.equals(new String[]{"1", "2", "3", "8"});
        System.out.println(c.indexOf("8"));
        System.out.println(c.getSize());

    }
}
