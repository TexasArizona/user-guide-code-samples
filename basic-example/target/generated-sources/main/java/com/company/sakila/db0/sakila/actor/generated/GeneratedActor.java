package com.company.sakila.db0.sakila.actor.generated;

import com.company.sakila.db0.sakila.actor.Actor;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.company.sakila.db0.sakila.actor.Actor}-interface representing entities of
 * the {@code actor}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedActor {
    
    /**
     * This Field corresponds to the {@link Actor} field that can be obtained
     * using the {@link Actor#getActorId()} method.
     */
    IntField<Actor, Integer> ACTOR_ID = IntField.create(
        Identifier.ACTOR_ID,
        Actor::getActorId,
        Actor::setActorId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Actor} field that can be obtained
     * using the {@link Actor#getFirstName()} method.
     */
    StringField<Actor, String> FIRST_NAME = StringField.create(
        Identifier.FIRST_NAME,
        Actor::getFirstName,
        Actor::setFirstName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Actor} field that can be obtained
     * using the {@link Actor#getLastName()} method.
     */
    StringField<Actor, String> LAST_NAME = StringField.create(
        Identifier.LAST_NAME,
        Actor::getLastName,
        Actor::setLastName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Actor} field that can be obtained
     * using the {@link Actor#getLastUpdate()} method.
     */
    ComparableField<Actor, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        Actor::getLastUpdate,
        Actor::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the actorId of this Actor. The actorId field corresponds to the
     * database column db0.sakila.actor.actor_id.
     * 
     * @return the actorId of this Actor
     */
    int getActorId();
    
    /**
     * Returns the firstName of this Actor. The firstName field corresponds to
     * the database column db0.sakila.actor.first_name.
     * 
     * @return the firstName of this Actor
     */
    String getFirstName();
    
    /**
     * Returns the lastName of this Actor. The lastName field corresponds to the
     * database column db0.sakila.actor.last_name.
     * 
     * @return the lastName of this Actor
     */
    String getLastName();
    
    /**
     * Returns the lastUpdate of this Actor. The lastUpdate field corresponds to
     * the database column db0.sakila.actor.last_update.
     * 
     * @return the lastUpdate of this Actor
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the actorId of this Actor. The actorId field corresponds to the
     * database column db0.sakila.actor.actor_id.
     * 
     * @param actorId to set of this Actor
     * @return        this Actor instance
     */
    Actor setActorId(int actorId);
    
    /**
     * Sets the firstName of this Actor. The firstName field corresponds to the
     * database column db0.sakila.actor.first_name.
     * 
     * @param firstName to set of this Actor
     * @return          this Actor instance
     */
    Actor setFirstName(String firstName);
    
    /**
     * Sets the lastName of this Actor. The lastName field corresponds to the
     * database column db0.sakila.actor.last_name.
     * 
     * @param lastName to set of this Actor
     * @return         this Actor instance
     */
    Actor setLastName(String lastName);
    
    /**
     * Sets the lastUpdate of this Actor. The lastUpdate field corresponds to
     * the database column db0.sakila.actor.last_update.
     * 
     * @param lastUpdate to set of this Actor
     * @return           this Actor instance
     */
    Actor setLastUpdate(Timestamp lastUpdate);
    
    enum Identifier implements ColumnIdentifier<Actor> {
        
        ACTOR_ID    ("actor_id"),
        FIRST_NAME  ("first_name"),
        LAST_NAME   ("last_name"),
        LAST_UPDATE ("last_update");
        
        private final String columnId;
        private final TableIdentifier<Actor> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "db0";
        }
        
        @Override
        public String getSchemaId() {
            return "sakila";
        }
        
        @Override
        public String getTableId() {
            return "actor";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Actor> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}