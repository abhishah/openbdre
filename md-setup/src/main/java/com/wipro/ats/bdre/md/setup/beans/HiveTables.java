package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HiveTables generated by hbm2java
 */
@Entity
@Table(name="HIVE_TABLES"
    ,schema="BDRE"
    ,catalog="BDRE"
)
public class HiveTables  implements java.io.Serializable {


     private Integer tableId;
     private String comments;
     private String locationType;
     private String dbname;
     private String batchIdPartitionCol;
     private String tableName;
     private String type;
     private String ddl;

    public HiveTables() {
    }

	
    public HiveTables(String comments, String locationType, String tableName, String type, String ddl) {
        this.comments = comments;
        this.locationType = locationType;
        this.tableName = tableName;
        this.type = type;
        this.ddl = ddl;
    }
    public HiveTables(String comments, String locationType, String dbname, String batchIdPartitionCol, String tableName, String type, String ddl) {
       this.comments = comments;
       this.locationType = locationType;
       this.dbname = dbname;
       this.batchIdPartitionCol = batchIdPartitionCol;
       this.tableName = tableName;
       this.type = type;
       this.ddl = ddl;
    }
   
     @Id 
    
    @Column(name="TABLE_ID", unique=true, nullable=false)
    public Integer getTableId() {
        return this.tableId;
    }
    
    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }
    
    @Column(name="COMMENTS", nullable=false, length=256)
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    @Column(name="LOCATION_TYPE", nullable=false, length=45)
    public String getLocationType() {
        return this.locationType;
    }
    
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
    
    @Column(name="DBNAME", length=45)
    public String getDbname() {
        return this.dbname;
    }
    
    public void setDbname(String dbname) {
        this.dbname = dbname;
    }
    
    @Column(name="BATCH_ID_PARTITION_COL", length=45)
    public String getBatchIdPartitionCol() {
        return this.batchIdPartitionCol;
    }
    
    public void setBatchIdPartitionCol(String batchIdPartitionCol) {
        this.batchIdPartitionCol = batchIdPartitionCol;
    }
    
    @Column(name="TABLE_NAME", nullable=false, length=45)
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    @Column(name="TYPE", nullable=false, length=45)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="DDL", nullable=false, length=2048)
    public String getDdl() {
        return this.ddl;
    }
    
    public void setDdl(String ddl) {
        this.ddl = ddl;
    }




}

