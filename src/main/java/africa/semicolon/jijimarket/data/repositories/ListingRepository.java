package africa.semicolon.jijimarket.data.repositories;

import africa.semicolon.jijimarket.data.models.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends MongoRepository<Listing, String> {
}
