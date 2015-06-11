package com.rollenholt.pear.pojo;

/**
 * rollenholt
 * 2015/6/11.
 */
public enum Operation {

    ADD(1, "add", "add operation"),  DELETE(2, "delete", "delete operation"),
    UPDATE(3, "update", "update operation"), QUERY(4, "query", "query operation");

    private int id;

    private String code;

    private String description;
    
    public Operation idOf(int id){
        for (Operation operation : values()) {
            if(operation.id == id){
                return operation;
            }
        }
        throw new IllegalArgumentException("can not adapter for: " + id);
    }

    public Operation codeOf(String code){
        for (Operation operation : values()){
            if(operation.code.equalsIgnoreCase(code)){
                return operation;
            }
        }
        throw new IllegalArgumentException("can not adapter for :" + code);
    }

     Operation(int id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
