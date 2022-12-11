package br.com.franzim.provider.service;

import br.com.franzim.provider.document.InfoProvider;

public interface InfoService {
    InfoProvider getInfoState(String state);
}
