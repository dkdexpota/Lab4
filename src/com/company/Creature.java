package com.company;

public class Creature extends AParameter {

    Creature(Guys p, String n) {
        super(p, n);
    }

    Mind mind = new Mind();

    public void getTypeAndName() {
        System.out.print(getType() + " ");
        System.out.print(getName());
    }

    public void Sit(String sit) {
        this.getTypeAndName();
        System.out.println(" сидит " + sit);
    }

    public void StandAndLookAt(String whom) {
        this.getTypeAndName();
        System.out.println(" стоит и смотрит на " + whom);
    }

    public void Think(String what) {
        this.getTypeAndName();
        System.out.print(" подумал ");
        mind.Thoughts(what);
    }

    public void Describe(String how) {
        this.getTypeAndName();
        System.out.print(" описал ");
        mind.Thoughts(how);
    }

    public void Grimace(String g) {
        this.getTypeAndName();
        System.out.println(g);
    }

    public void Say(String say) {
        this.getTypeAndName();
        System.out.println(say);
    }

    public void Remember(String m) {
        this.getTypeAndName();
        System.out.print(" вспоминает");
        mind.OpenMind(m);
    }

    public void Look(String look) {
        this.getTypeAndName();
        System.out.println(look);
    }

    public void Emotion(String g) {
        this.getTypeAndName();
        System.out.println(g);
    }

    public void Push(String p) {
        this.getTypeAndName();
        System.out.println(p);
    }

    public void Eat(String p) {
        this.getTypeAndName();
        System.out.println(p);
    }

    protected class Mind {
        public void Thoughts(String thought) {
            System.out.println(thought);
        }

        public void OpenMind(String om) {
            class Memories {
                String mem;

                Memories(String mem) {
                    this.mem = mem;
                }

            }
            Memories memory = new Memories(om);
            System.out.println(memory.mem);
        }
    }

    @Override
    public String getName() {
        try {
            return haveName();
        } catch (NameException e) {
            return e.getMessage();
        }
    }
}
