
package br.com.efo.zipcode.service;

import br.com.efo.zipcode.model.response.ZipcodeResponse;
import br.com.efo.zipcode.rest.ZipcodeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZipcodeService implements IZipcodeService {

    @Autowired
    private ZipcodeClient client;

    @Override
    public ZipcodeResponse searchZipcode(final String zipcode) {
        return client.search(zipcode);
    }


}
