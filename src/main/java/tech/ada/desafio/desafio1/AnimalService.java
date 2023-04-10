package tech.ada.desafio.desafio1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class AnimalService {

    public List<Animal> animaisHebivorosPesaMaisX(List<Animal> animails, Double peso){

        return animails.stream()
                .filter(a -> a.getPeso() > peso && a.getAlimentacao().equals("herbivoro"))
                .collect(Collectors.toList());
    }

    public List<Animal> animaisOviparosNaoRepteis(List<Animal> animals){
        return animals.stream()
                .filter(a -> !(a.getClasse().equals("reptil")) && a.getAlimentacao().equals("oviparo"))
                .collect(Collectors.toList());
    }

    public Animal animaisMaiorEVoaECarnivoro(List<Animal> animals){
        return animals.stream()
                .filter(a -> a.getLocomocao().equals("voa") && a.getAlimentacao().equals("carnivoro"))
                .max(Comparator.comparingDouble(Animal::getPeso)).orElse(null);

    }

    public List<Animal> animaisMamiferoPesaMenosX(List<Animal> animals, Double peso){
        return animals.stream()
                .filter(a -> a.getPeso() < peso && a.getClasse().equals("mamifero"))
                .collect(Collectors.toList());
    }

    public List<Animal> animaisAvesQNaoVoa(List<Animal> animals){
        return animals.stream()
                .filter(a -> a.getClasse().equals("aves") && !(a.getLocomocao().equals("voa")))
                .collect(Collectors.toList());
    }
}
