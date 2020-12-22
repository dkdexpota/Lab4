package com.company;

public class Ulius extends Creature {

    Ulius(Guys p, String n) {
        super(p, n);
    }

    public int v = 2;
    public void Sit () {
        super.Sit("за столом.");
    }
    public void Eat1 () {
        try {
            if (v!=0){
                super.Eat(" уплетал цыпленка.");
                v -= 1;
            } else {
                throw new KuraException("Кура закончилась, кушать нечего!");
            }
        } catch (KuraException exc) {
            System.out.println(exc.getMessage());
        }
    }
    public void Grimace () {
        super.Grimace(" придал своему лицу насмешливое выражение, как, впрочем, всегда, когда собирался сказать что-нибудь неприятное.");
    }
    public void Emotion () {
        super.Emotion(", никак не ожидая услышать комплимент, очень обрадовался.");
    }
    public void Say1 () {
        super.Say(" скромно улыбнулся и сказал.");
    }
    public void Look1 () {super.Look(" строго посмотрел на Карлсона.");}
    public void Think () {super.Think(", что Карлсон не заслуживает внимания, и снова занялся цыпленком.");}

    public void Say2 () { super.Say(" сказал с насмешливым видом."); }

    public void Describe () {}

    public void Eat2 () {
        try {
            if (v!=0){
                super.Eat(" впился зубами в цыплячью ножку.");
                v -= 1;
            } else {
                throw new KuraException("Кура закончилась, кушать нечего!");
            }
        } catch (KuraException exc) {
            exc.getMessage();
        }
    }
    public void Look2 () {super.Look(" поглядел на фрекен Бок еще более насмешливо.");}
}