package br.com.efo.zipcode.controller;

import br.com.efo.zipcode.model.response.ZipcodeResponse;
import br.com.efo.zipcode.service.IZipcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZipcodeController {

    @Autowired
    private IZipcodeService service;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ZipcodeResponse search(final String zipcode) {
        return service.searchZipcode(zipcode);
    }


}
