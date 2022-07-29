package br.com.aula.ws.services;

import br.com.aula.ws.models.ProblemaModel;
import br.com.aula.ws.repositories.ProblemaRepository;

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
