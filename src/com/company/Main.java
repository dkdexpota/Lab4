package com.company;

public class Main {

    public static void main(String[] args) {
        Karlson kar = new Karlson(Guys.Human, "Карлсон");
        FrekenBok fb = new FrekenBok(Guys.Human, "Фрекен Бок");
        Malish mal = new Malish(Guys.Human, "Малыш");
        Ulius ul = new Ulius(Guys.Human, "Юлиус") {
            public void Describe(){
                getTypeAndName();
                System.out.println(" был толстый, и вид у него был очень высокомерный и самодовольный.");
            }
        };
        Bimbo bim = new Bimbo(Guys.Dog, "Бимбо");
        Bludo bludo = new Bludo(Guys.Thing, "Блюдо");
        ul.Sit();
        ul.Eat1();
        fb.StandAndLookAt();
        mal.StandAndLookAt();
        kar.StandAndLookAt();
        bim.StandAndLookAt();
        mal.Think1();
        mal.Remember1();
        ul.Describe();
        mal.Think2();
        ul.Grimace();
        kar.Look1();
        kar.Look2();
        ul.Emotion();
        ul.Say1();
        kar.Emotion();
        ul.Look1();
        ul.Think();
        fb.Push();
        bludo.Move();
        bludo.Less();
        ul.Eat2();
        ul.Say2();
        fb.Emotion1();
        fb.Grimace();
        ul.Look2();
        mal.Emotion();
        mal.Remember2();
        fb.Emotion2();
        fb.Remember();

    }
}
