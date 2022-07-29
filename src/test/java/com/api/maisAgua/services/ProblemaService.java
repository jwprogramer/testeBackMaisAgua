package com.api.maisagua.services;

import com.api.maisagua.models.ProblemaModel;
import com.api.maisagua.repositories.ProblemaRepository;

import javax.transaction.Transactional;

public class ProblemaService {

    final ProblemaRepository problemaRepository;

    public ProblemaService(ProblemaRepository problemaRepository) {
        this.problemaRepository = problemaRepository;
    }

    @Transactional
    public ProblemaModel save(ProblemaModel problemaModel) {
        return problemaRepository.save(problemaModel);
    }
}
