package br.com.efo.zipcode.service;

import br.com.efo.zipcode.model.response.ZipcodeResponse;

public interface IZipcodeService {

    public ZipcodeResponse searchZipcode(final String zipcode);

}
