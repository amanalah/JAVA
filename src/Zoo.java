public class Zoo {
    String name;
    String city;
    final int NBR_CAGES=25;
    int nbrAnimals=0;
    Animal [] animals = new Animal[NBR_CAGES];

    public Zoo(String name, String city){
        this.name=name;
        this.city=city;
        //this.nbrCages=nbrCages;
        this.animals= new Animal[NBR_CAGES];

    }
    public void displayZoo(){
        System.out.println("Nom du zoo: "+ name +" ,La ville: "+ city+" ,Nombre de cages: " +NBR_CAGES);
    }
    @Override
    public String toString() {
        return "zoo{" + "Nom: " + name + " Ville: " + city + " Nombre de cages: " + NBR_CAGES + "}";
    }

    public boolean addAAnimal(Animal animal){
        /*if (nbrAnimals < animals.length){
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            //System.out.println(nbrAnimals);
            return true;
        }else
            return false;*/
        if (nbrAnimals>=animals.length){
            System.out.println("le nombre des animaux est depasse !");
            return false;
        }
        if (searchAnimal(animal)!=-1){      //l'animal n'existe pas donc on passe a l'ajout d'animal
            System.out.println("Cet animal dejaa existe!");
            return false;
        }
        animals[nbrAnimals]=animal;
        nbrAnimals++;
        return true;

    }
    public void displayAnimals(){
        for (int i=0; i<nbrAnimals;i++){ // animals.length=25 donc on doit utiliser nbrAnimals
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for(int i=0;i<nbrAnimals;i++){
            if(animals[i].name.equals(animal.name)) { //'==' compare l'@ memoire .equals() compare le contenu
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        System.out.println("Nombre des animaux avant suppression: "+nbrAnimals);
        int ind=searchAnimal(animal);
        if (ind==-1){  //l'animal n'existe pas
            return false;
        }
        for(int i=ind;i<nbrAnimals-1;i++){
            animals[i]=animals[i+1];   // decalage aa gauche des elements du tableau
        }
        animals[nbrAnimals-1]=null;//suppression du dernier element (double)
        nbrAnimals --;
        System.out.println("Nombre des animaux apres suppression: "+nbrAnimals);
        return true;
    }

    public boolean isZooFull(){
        return NBR_CAGES == nbrAnimals;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals>z2.nbrAnimals){
            return z1;
        }else if (z1.nbrAnimals<z2.nbrAnimals)
            return z2;
        else
            return null;

    }


}


