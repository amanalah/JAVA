package tn.esprit.gestionzoo.entities;

public  class Zoo {
    private String name;
    private String city;
    private final int NBR_CAGES=25;
    private int nbrAnimals=0;
    private Animal [] animals = new Animal[NBR_CAGES];
    private Aquatic[] aquaticAnimals= new Aquatic[2];
    private int nbrAnimalsAqua=0;

    public Zoo(String name, String city){
        setName(name);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null || !name.isEmpty()){
            this.name=name;
        }else
            System.out.println("Le tn.esprit.gestionzoo.entities.Zoo doit avoir un nom valide!");


    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public boolean addAAnimal(Animal animal){
        if (isZooFull()){
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
            if(animals[i].getName().equals(animal.getName())) { //'==' compare l'@ memoire .equals() compare le contenu
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

    public void addAquaticAnimal(Aquatic aquatic){
        //on ajoute un compteur pour ne pas depasser la longueur de tableau
        if(nbrAnimalsAqua<aquaticAnimals.length){
            aquaticAnimals[nbrAnimalsAqua]=aquatic;
            nbrAnimalsAqua++;
            System.out.println("Animal aquatic ajouté avec succés");
        }
    }
    public void  AnimalSwim(){
        for(int i=0;i<aquaticAnimals.length;i++){
            aquaticAnimals[i].swim();
        }
    }
    public float maxPenguinSwimmingDepth(){
        float  maxDepth=0;
        for(int i=0;i<aquaticAnimals.length;i++){
            if (aquaticAnimals[i] instanceof Penguin){
                Penguin penguin=(Penguin) aquaticAnimals[i];
                if(penguin.getSwimmingDepth()>maxDepth){
                    maxDepth=penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType(){
        int nbrDolphins=0;
        int nbrPenguins=0;
        for(int i=0;i<aquaticAnimals.length;i++){
            if(aquaticAnimals[i] instanceof Dolphin){
                nbrDolphins++;
            }
            if(aquaticAnimals[i] instanceof Penguin){
                nbrPenguins++;
            }
        }
        System.out.println("Le nombres des dauphins est: "+nbrDolphins);
        System.out.println("Le nombres des pingouins est: "+nbrPenguins);


    }

}


