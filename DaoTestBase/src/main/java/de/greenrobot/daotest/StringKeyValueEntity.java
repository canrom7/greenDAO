package de.greenrobot.daotest;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "STRING_KEY_VALUE_ENTITY".
 */
public class StringKeyValueEntity {

    private String key;
    private String value;

    public StringKeyValueEntity() {
    }

    public StringKeyValueEntity(String key) {
        this.key = key;
    }

    public StringKeyValueEntity(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}