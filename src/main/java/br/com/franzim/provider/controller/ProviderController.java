package br.com.franzim.provider.controller;

import br.com.franzim.provider.document.InfoProvider;
import br.com.franzim.provider.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class ProviderController {
    private final InfoService infoService;

    @Autowired
    public ProviderController(InfoService infoService) {
        this.infoService = infoService;
    }

    @RequestMapping(value = "/{state}", method = RequestMethod.GET)
    public InfoProvider getInfoState(@PathVariable String state) {
        return infoService.getInfoState(state);
    }
}