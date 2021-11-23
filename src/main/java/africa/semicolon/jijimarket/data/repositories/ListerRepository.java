package africa.semicolon.jijimarket.data.repositories;

import africa.semicolon.jijimarket.data.models.Lister;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ListerRepository extends MongoRepository<Lister, String> {

}
