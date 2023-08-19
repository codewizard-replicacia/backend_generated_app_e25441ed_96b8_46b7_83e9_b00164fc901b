package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.ProductionActualFilming;
import com.mycompany.group234.model.ScoutingLocations;
import com.mycompany.group234.model.PreProduction;
import com.mycompany.group234.model.ProducerRaiseFunds;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "ProducerRaiseFunds")
@Table(name = "\"ProducerRaiseFunds\"", schema =  "\"generated_app\"")
@Data
                        
public class ProducerRaiseFunds {
	public ProducerRaiseFunds () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"FundsID\"", nullable = true )
  private Integer fundsID;
	  
  @Column(name = "\"Investors\"", nullable = true )
  private String investors;
  
	  
  @Column(name = "\"ProductionCompanies\"", nullable = true )
  private String productionCompanies;
  
	  
  @Column(name = "\"ProducerNames\"", nullable = true )
  private String producerNames;
  
	  
  @Column(name = "\"GiftGrants\"", nullable = true )
  private String giftGrants;
  
	  
  @Column(name = "\"Crowdfunding\"", nullable = true )
  private String crowdfunding;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "ProducerRaiseFunds [" 
  + "FundsID= " + fundsID  + ", " 
  + "Investors= " + investors  + ", " 
  + "ProductionCompanies= " + productionCompanies  + ", " 
  + "ProducerNames= " + producerNames  + ", " 
  + "GiftGrants= " + giftGrants  + ", " 
  + "Crowdfunding= " + crowdfunding 
 + "]";
	}
	
}