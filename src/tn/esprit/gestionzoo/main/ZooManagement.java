package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;


public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Friguia", "Sousse");
        Zoo scndZoo= new Zoo("Belvedere","Tunis");

       // Aquatic aquatic1= new Aquatic("Pomacentridés","Nemo",2,false,"Ocean");
        Aquatic aquatic1= new Dolphin("delphinidés","Nemo",2,false,"Ocean",10F);
        Terrestrial terrestrial1= new Terrestrial("félidés","Lola",5,true,4);
        Dolphin dolphin1= new Dolphin("delphinidés","Flipper",8,true,"Océan Atlantique", 12.5F);
        Dolphin dolphin2= new Dolphin("delphinidés","Flipper",8,true,"Océan Atlantique", 12.5F);
        Penguin penguin1= new Penguin("Sphéniscidés","Pingu",4,false, "Océan Antarctique", 200F );
        // ERREUR: il n'y a pas de constructeur parametre
        //Lorsqu;on cree des contructeurs parametres on doit les utiliser lors d'intialisation des instances.

        Animal lion = new Animal("félidés", "Simba" ,5,true);
        Animal lion1 = new Animal("félidés", "Nola" ,6,true);
        Animal zebra = new Animal("Equidae", "Marty" ,12,true);
        Animal elephant1 = new Animal("Eléphantidés", "Tembo" ,32,true);
        Animal elephant = new Animal("Eléphantidés","Maya",10,true );
        Animal crocodile = new Animal("Crocodylidae","Louis",10,false );
        Animal tiger       = new Animal("Felidae", "Raja", 9, true);
        Animal tiger1      = new Animal("Felidae", "Raja", 6, true);
        Animal tiger2      = new Animal("Felidae", "Raja", 6, true);
        Animal chimpanzee  = new Animal("Hominidae", "Coco", 24, true);
        Animal chimpanzee1 = new Animal("Hominidae", "Cheeta", 17, true);
        Animal camel       = new Animal("Camelidae", "Sahara", 12, true);

        System.out.println(myZoo); //tn.esprit.gestionzoo.entities.Zoo@7ef20235
        System.out.println(myZoo.toString()); //tn.esprit.gestionzoo.entities.Zoo@7ef20235
        System.out.println(lion.toString());
        System.out.println(lion);

        System.out.println("==============================");

        System.out.println(myZoo.addAAnimal(lion));
        System.out.println(myZoo.addAAnimal(elephant));
        System.out.println(myZoo.addAAnimal(crocodile));
        System.out.println(myZoo.addAAnimal(lion1));
        System.out.println(myZoo.addAAnimal(zebra));
        System.out.println(myZoo.addAAnimal(elephant1));

        System.out.println("==============================");

        myZoo.displayZoo();

        System.out.println("==============================");

        System.out.println(scndZoo.addAAnimal(tiger));
        System.out.println(scndZoo.addAAnimal(tiger1));
        System.out.println(scndZoo.addAAnimal(chimpanzee));
        System.out.println(scndZoo.addAAnimal(chimpanzee1));
        System.out.println(scndZoo.addAAnimal(camel));

        System.out.println("==============================");

        scndZoo.displayAnimals();

        System.out.println("==============================");

        System.out.println(myZoo.searchAnimal(elephant));

        System.out.println("==============================");

        myZoo.removeAnimal(lion);

        System.out.println("==============================");

        myZoo.displayAnimals();

        System.out.println("==============================");

        System.out.println("La zoo la plus grande est "+ Zoo.compareZoo(myZoo,scndZoo));

        System.out.println("==============================");
        //on doit redifinir toSting pour presenter les information
        System.out.println(aquatic1);
        System.out.println(terrestrial1);
        System.out.println(dolphin1);
        System.out.println(penguin1);

        System.out.println("==============================");

        aquatic1.swim();
        dolphin1.swim();
        penguin1.swim();

        System.out.println("==============Ajout des animaux aquatiques dans le tableau================");
        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(aquatic1);

        System.out.println("==============================");
        myZoo.AnimalSwim();
        System.out.println("==============================");
        System.out.println("La profondeur maximale est: "+myZoo.maxPenguinSwimmingDepth());
        System.out.println("==============================");
        myZoo.displayNumberOfAquaticsByType();
        System.out.println("==============================");
        System.out.println(dolphin1.equals(dolphin2));






    }
}
