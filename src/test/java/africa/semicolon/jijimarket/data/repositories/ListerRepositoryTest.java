package africa.semicolon.jijimarket.data.repositories;

import africa.semicolon.jijimarket.data.models.Lister;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ListerRepositoryTest {
    @Autowired
    private ListerRepository listerRepository;

    @Test
    public void repositorySaveTest(){
        Lister lister = new Lister();
        lister.setFullName("Adesuwa o");
        lister.setEmail("beck@gmail.com");
        lister.setLocation("Ikoyi");
        lister.setPhoneNumber("0988845");
        Lister savedlister = listerRepository.save(lister);
        assertEquals("Adesuwa o", savedlister.getFullName());
        assertNotNull(savedlister.getId());
    }
}