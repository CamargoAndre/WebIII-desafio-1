package tech.ada.desafio.desafio1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        AnimalService service = new AnimalService();

        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("leao", "mamifero", "carnivoro", "anda", 140.000));
        animais.add(new Animal("morcego", "mamifero", "onivoro", "voa", 0.100));
        animais.add(new Animal("tartaruga", "reptil", "herbivoro", "anda", 100.00));
        animais.add(new Animal("jacare", "reptil", "carnivoro", "anda", 400.00));
        animais.add(new Animal("avestrus", "ave", "herbivoro", "anda", 100.00));
        animais.add(new Animal("pinguim", "mamifero", "onivoro", "anda", 6.00));
        animais.add(new Animal("papagaios", "ave", "herbivoro", "voa", 0.400));
        animais.add(new Animal("baleia Branca", "mamifero", "carnivoro", "nada", 1400.00));
        animais.add(new Animal("águia", "ave", "carnivoro", "voa", 6.00));


        System.out.println(animais);
        System.out.println(service.animaisHebivorosPesaMaisX(animais, 50.00));
        System.out.println(service.animaisOviparosNaoRepteis(animais));
        System.out.println(service.animaisMaiorEVoaECarnivoro(animais));
        System.out.println(service.animaisAvesQNaoVoa(animais));
        System.out.println(service.animaisMamiferoPesaMenosX(animais, 50.00));



    }
}
