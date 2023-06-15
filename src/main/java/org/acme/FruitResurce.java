package org.acme;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/fruit")
public class FruitResurce {

    @Inject
    FruitService fruitService ;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruit> list() {
        return fruitService.list();
    }

    @POST
    @Transactional
    public void newFruit(){
        Fruit fruts = new Fruit();
        fruts.name = "Apple";
        fruts.qtd = 1;
        fruts.persist();
    }
}
 