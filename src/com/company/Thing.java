package com.company;

public class Thing extends AParameter {
    Thing(Guys p, String n) { super(p, n); }

    public void getTypeAndName () {
        System.out.print(getType() + " ");
        System.out.print(getName());
    }

    public void Move(String move){
        this.getTypeAndName();
        System.out.println(move);
    }
    public void Less(String l){
        this.getTypeAndName();
        System.out.println(l);
    }
}
