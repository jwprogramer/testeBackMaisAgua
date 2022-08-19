package com.api.maisAgua.services;

import com.api.maisAgua.models.ProblemaModel;
import com.api.maisAgua.repositories.ProblemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProblemaService {

    final ProblemaRepository problemaRepository;

    public ProblemaService(ProblemaRepository problemaRepository) {
        this.problemaRepository = problemaRepository;
    }

    @Transactional
    public ProblemaModel save(ProblemaModel problemaModel) {
        return problemaRepository.save(problemaModel);
    }

    @Transactional
    public Optional<ProblemaModel> findById(Long id) {
        return problemaRepository.findById(id);
    }

    @Transactional
    public void delete(ProblemaModel problemaModel) {
        problemaRepository.delete(problemaModel);
    }
    @Transactional
    //public Page<ProblemaModel> findAll(Pageable pageable) { return problemaRepository.findAll(pageable); }

    public List<ProblemaModel> findAll( ) {
        return problemaRepository.findAll();
    }
}
