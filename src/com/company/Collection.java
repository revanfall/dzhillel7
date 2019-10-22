package com.company;

import java.util.Arrays;

public class Collection {
    String col[];

    public Collection() {
    }

    public Collection(String[] col) {
        this.col = col;
    }


    void addElem(String str) {
        col = Arrays.copyOf(col, col.length + 1);//использовал ф-цию из библиотеки списков, чтобы с помощью копирования создать новый массив с сохранёнными данными
        col[col.length - 1] = str;
        System.out.println(Arrays.toString(col));
    }

    void deleteElem(String str) {
        for (int i = 0; i < col.length; i++) {
            if (col[i].equals(str)) {
                System.arraycopy(col, i + 1, col, i, col.length - 1 - i);//смещаем элементы
                col = Arrays.copyOf(col, col.length - 1);//копируем в новый массив
                System.out.println(Arrays.toString(col));
                break;
            }
        }
    }

    String getByIndex(int i){
        return col[i];//возвращаем элемент с этим индексом
    }

    void contains(String str){
        for(int i=0;i<col.length;i++){
            if(col[i].equals(str)){
                System.out.println("Array contains "+str);
                break;
            }
            else System.out.println("No element found"); break;
        }
    }
    void equals(String arr[]){
        if(Arrays.equals(col,arr))
            System.out.println("Equal");
        else System.out.println("Not equal");
    }
    void clear(){
        Arrays.fill(col,null);//заполняем массив null
    }
    int indexOf(String str){
        int curIndex=0;
        for(int i=0;i<col.length;i++) {
            if (col[i].equals(str))
                curIndex=i;
        }
        return curIndex;
    }

    int getSize(){
        return col.length;
    }
}
