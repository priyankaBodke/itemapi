package com.example.itemapi.model;

public class Item {
    private Integer id;           // use Integer
    private String name;
    private String description;

    // Default constructor (needed for JSON mapping)
    public Item() {}

    // Constructor with parameters
    public Item(Integer id, String name, String description) {  // Integer here too
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
    public Integer getId() { return id; }   // Integer
    public void setId(Integer id) { this.id = id; }  // Integer

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
