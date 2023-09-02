package br.unitins.topicos1.service;

import br.unitins.topicos1.dto.CadeiraDTO;
import br.unitins.topicos1.modelo.Cadeira;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public interface CadeiraService {
    public Cadeira insert(CadeiraDTO dto);

    public Cadeira update(CadeiraDTO dto, long id);

    public void delete(long id);

    public Cadeira findById(long id);

    public List<Cadeira> findByNome(String nome);

    public List<Cadeira> findByAll();
}

