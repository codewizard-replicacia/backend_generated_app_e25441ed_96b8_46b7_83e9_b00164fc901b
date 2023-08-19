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

@Entity(name = "PreProduction")
@Table(name = "\"PreProduction\"", schema =  "\"generated_app\"")
@Data
                        
public class PreProduction {
	public PreProduction () {   
  }
	  
  @Column(name = "\"FilmTitle\"", nullable = true )
  private String filmTitle;
  
	  
  @Column(name = "\"ProducerName\"", nullable = true )
  private String producerName;
  
	  
  @Column(name = "\"ProductionManager\"", nullable = true )
  private String productionManager;
  
	  
  @Column(name = "\"AsstDirector\"", nullable = true )
  private String asstDirector;
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"PreProductionID\"", nullable = true )
  private Integer preProductionID;
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"PreProductionRaiseFunds\"", referencedColumnName = "\"FundsID\"", insertable = false, updatable = false)
	private ProducerRaiseFunds raiseFunds;
	
	@Column(name = "\"PreProductionRaiseFunds\"")
	private Integer preProductionRaiseFunds;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PreProductionLocations\"",
            joinColumns = @JoinColumn( name="\"PreProductionID\""),
            inverseJoinColumns = @JoinColumn( name="\"ScoutLocID\""), schema = "\"generated_app\"")
private List<ScoutingLocations> locations = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PreProductionFilming\"",
            joinColumns = @JoinColumn( name="\"PreProductionID\""),
            inverseJoinColumns = @JoinColumn( name="\"FilmID\""), schema = "\"generated_app\"")
private List<ProductionActualFilming> filming = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "PreProduction [" 
  + "FilmTitle= " + filmTitle  + ", " 
  + "ProducerName= " + producerName  + ", " 
  + "ProductionManager= " + productionManager  + ", " 
  + "AsstDirector= " + asstDirector  + ", " 
  + "PreProductionID= " + preProductionID 
 + "]";
	}
	
}