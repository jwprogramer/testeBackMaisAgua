package com.api.maisAgua.services;

import com.api.maisAgua.models.ProblemaModel;
import com.api.maisAgua.repositories.ProblemaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

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
    public Optional<ProblemaModel> findById(UUID id) {
        return problemaRepository.findById(id);
    }

    @Transactional
    public void delete(ProblemaModel problemaModel) {
        problemaRepository.delete(problemaModel);
    }
}
