package br.com.efo.zipcode.controller;

import br.com.efo.zipcode.model.response.ZipcodeResponse;
import br.com.efo.zipcode.service.IZipcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZipcodeController {

    @Autowired
    private IZipcodeService service;

    @GetMapping(value = "/search")
    public ZipcodeResponse search() {
        return service.searchZipcode("");
    }


}
