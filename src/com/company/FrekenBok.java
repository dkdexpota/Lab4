package com.company;

public class FrekenBok extends Creature {
    FrekenBok(Guys p, String n) { super(p, n); }

    public void StandAndLookAt(){
        super.StandAndLookAt("Юлиуса.");
    }
    public void Push () {super.Push(" пододвигала Юлиусу блюдо и умоляла взять еще кусочек.");}
    public void Emotion1 () {super.Emotion(" вспыхнула от обиды.");}
    public void Grimace () {super.Grimace(" сморщила лоб.");}
    public void Emotion2 () {super.Emotion(" разревелась от обиды, что дядя Юлиус нашел цыпленка жестким.");}
    public void Remember () {super.Remember(", что ничто на свете не могло причинить ей такого горя, как непризнание ее кулинарного искусства, и теперь она горько плакала.");}
}
