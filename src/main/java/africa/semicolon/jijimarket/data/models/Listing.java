package africa.semicolon.jijimarket.data.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("Listings")
@Data
public class Listing {
    @Id
    private String id;

    private String name;
    private String shortDescription;
    private String longDescription;
    private LocalDateTime dateListed = LocalDateTime.now();
    private Condition condition;
    @DBRef //@JsonIgnore @Lazy
    private Lister lister;
    private String type;
    private String subType;
    private int numberOfViews;

}
