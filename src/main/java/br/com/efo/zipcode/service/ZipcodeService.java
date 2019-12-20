
package br.com.efo.zipcode.service;

import br.com.efo.zipcode.model.entity.ZipcodeEntity;
import br.com.efo.zipcode.model.response.ZipcodeResponse;
import br.com.efo.zipcode.respository.ZipcodeRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ZipcodeService implements IZipcodeService {

    @Autowired
    private ZipcodeRepository repository;

    @Override
    public ZipcodeResponse searchZipcode(final String zipcode) {
        val optLocalZipcode = Optional.ofNullable(repository.findByZipcode(zipcode));

        if (optLocalZipcode.isPresent()) {
            return buildResponse(optLocalZipcode.get());
        }

        return null;
    }

    private ZipcodeResponse buildResponse(final ZipcodeEntity entity) {
        return ZipcodeResponse.builder()
            .cep(entity.getCep())
            .logradouro(entity.getLogradouro())
            .complemento(entity.getComplemento())
            .bairro(entity.getBairro())
            .localidade(entity.getLocalidade())
            .uf(entity.getUf())
            .unidade(entity.getUnidade())
            .ibge(entity.getIbge())
            .gia(entity.getGia())
            .build();
    }


}
