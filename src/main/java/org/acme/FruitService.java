package org.acme;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FruitService {

    public List<Fruit> list() {
        return Fruit.listAll();
    }

    public void newFruit() {
        Fruit fruts = new Fruit();
        fruts.name = "Apple";
        fruts.qtd = 1;
        fruts.persist();
    }

}
