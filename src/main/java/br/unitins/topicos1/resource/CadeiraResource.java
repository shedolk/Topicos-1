package br.unitins.topicos1.resource;

import br.unitins.topicos1.dto.CadeiraDTO;
import br.unitins.topicos1.modelo.Cadeira;
import br.unitins.topicos1.repository.CadeiraRepository;
import br.unitins.topicos1.service.CadeiraService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/cadeira")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CadeiraResource {

    @Inject
    CadeiraService service;

    @POST
    @Transactional
    public Cadeira insert(CadeiraDTO dto) {
        return service.insert(dto);
    }

    @GET
    public List<Cadeira> findAll() {
        return service.findByAll();
    }

    @GET
    @Path("/{id}")
    public Cadeira findById(@PathParam("id") Long id) {
        return service.findById(id);
    }

    @GET
    @Path("/search/nome/{nome}")
    public List<Cadeira> findByNome(@PathParam("nome") String nome) {
        return service.findByNome(nome);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Cadeira update(@PathParam("id") Long id, CadeiraDTO dto) {
        return service.update(dto, id);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        service.delete(id);
    }
}
