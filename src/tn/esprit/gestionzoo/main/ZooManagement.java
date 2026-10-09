package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;


public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Friguia", "Sousse");
        Zoo scndZoo= new Zoo("Belvedere","Tunis");


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

        System.out.println(myZoo.addAAnimal(lion));
        System.out.println(myZoo.addAAnimal(elephant));
        System.out.println(myZoo.addAAnimal(crocodile));
        System.out.println(myZoo.addAAnimal(lion1));
        System.out.println(myZoo.addAAnimal(zebra));
        System.out.println(myZoo.addAAnimal(elephant1));

        myZoo.displayZoo();

        System.out.println(scndZoo.addAAnimal(tiger));
        System.out.println(scndZoo.addAAnimal(tiger1));
        System.out.println(scndZoo.addAAnimal(chimpanzee));
        System.out.println(scndZoo.addAAnimal(chimpanzee1));
        System.out.println(scndZoo.addAAnimal(camel));

        scndZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(elephant));

        myZoo.removeAnimal(lion);

        myZoo.displayAnimals();

        System.out.println("La zoo la plus grande est "+ Zoo.compareZoo(myZoo,scndZoo));

    }
}
