public class Zoo {
    Animal [] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    int nbrAnimals=0;

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

    public boolean addAAnimal(Animal animal){
        if (nbrAnimals < animals.length){
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            //System.out.println(nbrAnimals);
            return true;
        }else
            return false;

    }
    public void showAnimals(){
        for (int i=0; i<nbrAnimals;i++){ // animals.length=25 donc on doit utiliser nbrAnimals
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for(int i=0;i<nbrAnimals;i++){
            if(animals[i].name.equals(animal.name)) { //'==' compare l'@ memoire .equals() compaare le contenu
                return i;
            }
        }
        return -1;
    }


}


