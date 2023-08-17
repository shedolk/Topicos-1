package br.unitins.topicos1.resource;

import br.unitins.topicos1.modelo.Cadeira;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/listCadeira")
public class CadeiraResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cadeira> addCadeira() {
        return Cadeira.listAll();
    }

}
