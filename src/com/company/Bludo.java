package com.company;

public class Bludo extends Thing{
    Bludo(Guys p, String n) {
        super(p, n);
    }
    public void Move(){ super.Move(" пододвинулось."); }
    public void Less () {
        String s = " " + food.name + " стало меньше";
        super.Less(s);
    }
    Food food = new Food("Цыпленок");
    protected static class Food {
        String name;
        Food (String name) {
            this.name = name;
        }
    }
}