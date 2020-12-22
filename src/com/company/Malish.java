package com.company;

public class Malish extends Creature{
    Malish(Guys p, String n) { super(p, n); }

    public void StandAndLookAt(){
        super.StandAndLookAt("Юлиуса.");
    }

    public void Think1 () {
        super.Think("- \"Как Король\". ");
    }
    public void Remember1 () {
        super.Remember("- \"Учительница в школе рассказывала, что, когда короли едят, вокруг стоят придворные и смотрят на них\".");
    }
    public void Describe () {
        super.Describe("- \"Дядя Юлиус толстый, и вид у него очень высокомерный и самодовольный \".");
    }
    public void Think2 () {
        super.Think("- \"Наверно, такой, какой и должен быть у старых королей\".");
    }
    public void Emotion () {
        super.Emotion(" стал красный как рак.");
    }
    public void Remember2 () {
        super.Remember(", что это он рассказал Карлсону, что когда дядя Юлиус спит, его зубы лежат в стакане с водой на тумбочке у кровати.");
    }

}
