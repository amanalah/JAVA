package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public  Aquatic(String family, String name, int age, boolean
            isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat=habitat;

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void  swim();
    @Override
    public String toString(){
        return super.toString()  + ", Habitat: "+habitat;
    }
    @Override
    public boolean equals(Object obj){
        if(null==obj)return false;
        if(obj instanceof Aquatic aquatic){
            return getAge() == aquatic.getAge() && getName() == aquatic.getName() && getHabitat()==aquatic.getHabitat();
        }
        return false;

    }

}
