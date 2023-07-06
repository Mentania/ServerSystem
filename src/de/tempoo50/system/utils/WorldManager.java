package de.tempoo50.system.utils;

import java.util.UUID;


public class WorldManager {
	
    private final UUID id;
    private final String creator;
    private final String name;
    private final String type;
    private final String creationDate;
    private boolean load;

    public WorldManager(UUID id, String creator, String name, String type, String creationDate, boolean load) {
    	
        this.id = id;
        this.creator = creator;
        this.name = name;
        this.type = type;
        this.creationDate = creationDate;
        this.load = load;
        
    }

    public String getName() {
    	
        return name;
        
    }

    public UUID getId() {
    	
        return id;
        
    }

    public String getCreationDate() {
    	
        return creationDate;
    
    }

    public String getCreator() {
    
    	return creator;
    
    }

    public String getType() {
    
    	return type;
    
    }

    public boolean isLoaded() {
    
    	return load;
    
    }

    public void setLoad(boolean load) {
    
    	this.load = load;
    
    }
    
}

