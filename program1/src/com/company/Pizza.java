package com.company;

/**
 * Created by Henry on 2/4/2017.
 */
public class Pizza {

    int first;
    int second;

    public Pizza (int first, int second) {

        this.first = first;
        this.second = second;

    }

    public int calcSum(){
        return first + second;
    }

    public boolean isGreater(){
        return first > second;
    }

    public void changeValues(int newVal, int anotherNewVal){
        this.first = newVal;
        this.second = anotherNewVal;
    }
}
