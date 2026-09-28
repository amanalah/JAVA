public class Zoo {
    Animal [] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        this.animals= new Animal[25];

    }
    public void displayZoo(){
        System.out.println("Nom du zoo: "+ name +" ,La ville: "+ city+" ,Nombre de cages: " +nbrCages);
    }
    @Override
    public String toString() {
        return "zoo{" + "Nom: " + name + " Ville: " + city + " Nombre de cages: " + nbrCages + "}";
    }


}


