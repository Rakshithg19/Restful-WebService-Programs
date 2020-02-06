package raksh.laptop.Laptop_Details.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name ="laptop_details")
@XmlRootElement
public class LaptoEntity implements Serializable{
	@Id
	@GenericGenerator(name ="rakshith", strategy="increment")
	@GeneratedValue(generator = "rakshith")
	@Column(name = "id")
	private int id;
	@Column(name = "l_name")
	private String name;
	@Column(name = "l_model")
	private String model;
	@Column(name = "l_price")
	private String price;
	public LaptoEntity() {
System.out.println("entity created");
	}

}
