package com.company;

abstract class AParameter implements IObject, IComprasion{
    Guys type;
    private String Name;

    AParameter(Guys p, String n) {
        type = p;
        Name = n;
    }
    public Guys getType(){ return type; }
    public String getName(){
        return Name;
    }

    public String haveName() throws NameException{
        if (Name==""){
            throw new NameException("безымянный");
        } else{
            return Name;
        }
    }

    @Override
    public String toString() {
        return getName() + type;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + type.hashCode();
    }
}
