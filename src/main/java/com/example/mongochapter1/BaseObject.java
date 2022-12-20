package com.example.mongochapter1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

public abstract class BaseObject {

    @Id
    private String id;

    @JsonIgnore
    private boolean deleted = false;

    @JsonIgnore
    private boolean updated = false;

    @JsonIgnore
    private  boolean isActive = false;

    @CreatedBy
    private String createdByUser;

    @Indexed
    @CreatedDate
    private Date creationDate = new Date();

    @LastModifiedDate
    private Date lastModifiedDate;

    @LastModifiedBy
    private String lastModifiedUserId;

    // GETTER SETTER
}
