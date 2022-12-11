package br.com.franzim.provider.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document("provider")
@Data
public class InfoProvider {
    @Id
    private String id;
    @NonNull private String name;
    @NonNull private String state;
    @NonNull private String address;
}
