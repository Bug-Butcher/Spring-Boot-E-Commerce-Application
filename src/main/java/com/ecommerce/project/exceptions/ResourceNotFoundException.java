package com.ecommerce.project.exceptions;


public class ResourceNotFoundException extends RuntimeException{
    String resourceName;
    String field;
    String fieldName;
    Long fieldId;

    public ResourceNotFoundException(String field, String resourceName, String fieldName) {
        super(String.format("%s Not Found with %s : %s",resourceName,field,fieldName));
        this.field = field;
        this.resourceName = resourceName;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundException(Long fieldId, String field, String resourceName) {
        super(String.format("%s Not Found with %s : %d",resourceName,field,fieldId));
        this.fieldId = fieldId;
        this.field = field;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException() {
    }
}
