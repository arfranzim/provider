package br.com.franzim.provider.service.impl;

import br.com.franzim.provider.document.InfoProvider;
import br.com.franzim.provider.repository.InfoRepository;
import br.com.franzim.provider.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {

    private final InfoRepository infoRepository;

    @Autowired
    public InfoServiceImpl(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    @Override
    public InfoProvider getInfoState(String state) {
        return infoRepository.findByState(state);
    }
}
