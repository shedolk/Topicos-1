package br.unitins.topicos1.resource;

import br.unitins.topicos1.modelo.Cadeira;
import br.unitins.topicos1.repository.CadeiraRepository;
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
    CadeiraRepository repository;

    @POST
    @Transactional
    public Cadeira insert(Cadeira cadeira) {
        Cadeira novaCadeira = new Cadeira();
        novaCadeira.setModelo(cadeira.getModelo());
        novaCadeira.setMaterial(cadeira.getMaterial());

        repository.persist(novaCadeira);

        return novaCadeira;
    }

    @GET
    public List<Cadeira> findAll() {
        return repository.listAll();
    }

    @GET
    @Path("/{id}")
    public Cadeira findAById(@PathParam("id") Long id) {
        return repository.findById(id);
    }

    @GET
    @Path("/search/nome/{nome}")
    public List<Cadeira> findAByNome(@PathParam("nome") String nome) {
        return repository.findByNome(nome);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Cadeira update(@PathParam("id") Long id, Cadeira cadeira) {
        Cadeira cadeiraExistente = repository.findById(id);
        if (cadeiraExistente != null) {
            cadeiraExistente.setModelo(cadeira.getModelo());
            cadeiraExistente.setMaterial(cadeira.getMaterial());

            return cadeiraExistente;
        }
        return null;
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Cadeira cadeira = repository.findById(id);
        if (cadeira != null) {
            repository.delete(cadeira);
        }
    }
}
