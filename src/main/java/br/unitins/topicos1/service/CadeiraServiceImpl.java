package br.unitins.topicos1.service;

import java.util.List;
import br.unitins.topicos1.dto.CadeiraDTO;
import br.unitins.topicos1.modelo.Cadeira;
import br.unitins.topicos1.repository.CadeiraRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.inject.Inject;

@ApplicationScoped
public class CadeiraServiceImpl implements CadeiraService {

    @Inject
    CadeiraRepository repository;

    @Override
    @Transactional
    public Cadeira insert(CadeiraDTO dto) {
        Cadeira novaCadeira = new Cadeira();
        novaCadeira.setModelo(dto.getNome());
        novaCadeira.setMaterial(dto.getMaterial());

        repository.persist(novaCadeira);

        return novaCadeira;
    }

    @Override
    public Cadeira update(CadeiraDTO dto, long id) {
        Cadeira cadeiraExistente = repository.findById(id);
        if (cadeiraExistente != null) {
            cadeiraExistente.setModelo(dto.getNome());
            cadeiraExistente.setMaterial(dto.getMaterial());
        }
        return cadeiraExistente;
    }

    @Override
    public void delete(long id) {
        Cadeira cadeira = repository.findById(id);
        if (cadeira != null) {
            repository.delete(cadeira);
        }
    }

    @Override
    public Cadeira findById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Cadeira> findByNome(String nome) {
        return repository.findByNome(nome);
    }

    @Override
    public List<Cadeira> findByAll() {
        return repository.listAll();
    }
}
