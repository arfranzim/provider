package br.com.franzim.provider.repository;

import br.com.franzim.provider.document.InfoProvider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends MongoRepository<InfoProvider, String> {

    InfoProvider findByState(String state);
}
