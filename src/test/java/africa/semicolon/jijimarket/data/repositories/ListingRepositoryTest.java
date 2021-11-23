package africa.semicolon.jijimarket.data.repositories;

import africa.semicolon.jijimarket.data.models.Condition;
import africa.semicolon.jijimarket.data.models.Listing;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest for mySQL
@DataMongoTest
class ListingRepositoryTest {
    @Autowired
    private ListingRepository listingRepository;

    @Test
    public void saveListingTest() {
        Listing listing = new Listing();
        listing.setCondition(Condition.USED);
        listing.setName("G-String");
        listing.setShortDescription("London used G-String");
        listing.setLongDescription("Tokunbo G-string");
        Listing savedListing = listingRepository.save(listing);
        assertEquals("Tokunbo G-String", savedListing.getLongDescription());

    }

}