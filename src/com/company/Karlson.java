package com.company;

public class Karlson extends Creature{
    Karlson (Guys p, String n) { super(p, n); }

    public void StandAndLookAt(){
        super.StandAndLookAt("Юлиуса.");
    }
    public void Look1 () {super.Look(" до сих пор не мог оторвать глаз от цыпленка.");}
    public void Look2 () {
        super.Look(" перевел взгляд на дядю Юлиуса и долго смотрел на него в глубокой задумчивости.");
    }
    public void Emotion () {super.Emotion(" обиделся не на шутку.");}
}
