package br.com.efo.zipcode.respository;ng";

import br.com.efo.zipcode.model.entity.ZipcodeEntity;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipcodeRepository extends JpaRepository<ZipcodeEntity, Long> {

    ZipcodeEntity findByZipcode(final String zipcode);

}