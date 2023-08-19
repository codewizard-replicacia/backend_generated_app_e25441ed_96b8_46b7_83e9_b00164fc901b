package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.ProductionActualFilming;
import com.mycompany.group234.model.ScoutingLocations;
import com.mycompany.group234.model.PreProduction;
import com.mycompany.group234.model.ProducerRaiseFunds;

@Entity(name = "PreProductionFilming")
@Table(schema = "\"generated_app\"", name = "\"PreProductionFilming\"")
@Data
public class PreProductionFilming{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PreProductionID\"")
	private Integer preProductionID;

    
    @Column(name = "\"FilmID\"")
    private Integer filmID;
 
}