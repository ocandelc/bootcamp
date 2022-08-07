package com.nttdata.bootcamp.grupo02.app.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="document_type")
public class DocumentType {

    @Id
    private String id;
    private String code;
    private String name;
    private String description;
    private String state;

}
