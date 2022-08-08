package com.nttdata.bootcamp.grupo02.app.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@Document(collection="product_bill")
public class ProductBill {

    @Id
    private String id;
    private String code;
    private String name;
    private String description;
    private String ruleMoveState;
    private String ruleMoveNumber;
    private String state;
    private String auditUserCreateName;
    private Date auditUserCreateDate;
    private String auditUserCreateIp;
    private String auditUserUpdateName;
    private Date auditUserUpdateDate;
    private String auditUserUpdateIp;

}
