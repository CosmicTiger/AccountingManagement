/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

/**
 *
 * @author Anabell
 */
public class EntityData {
    //Variables
    private String entityName;
    private String entityID;
    
    //Constructor
    public EntityData(){
        entityName = "";
        entityID = "";
    }
    
    public EntityData(String entityName, String entityID){
        this.entityName = entityName;
        this.entityID = entityID;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }
    
}
