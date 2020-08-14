package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Univercity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column(name = "leve_of_accreditation")
	private int levelOfAccreditation;
	
	@Column(name = "numbers_of_institutes")
	private int numbersOfInstitutes;
	
	@Column(name = "amount_of_students")
	private int amountOfStudents;
	
	@Column(name = "univercity_address")
	private String univercityAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevelOfAccreditation() {
		return levelOfAccreditation;
	}

	public void setLevelOfAccreditation(int levelOfAccreditation) {
		this.levelOfAccreditation = levelOfAccreditation;
	}

	public int getNumbersOfInstitutes() {
		return numbersOfInstitutes;
	}

	public void setNumbersOfInstitutes(int numbersOfInstitutes) {
		this.numbersOfInstitutes = numbersOfInstitutes;
	}

	public int getAmountOfStudents() {
		return amountOfStudents;
	}

	public void setAmountOfStudents(int amountOfStudents) {
		this.amountOfStudents = amountOfStudents;
	}

	public String getUnivercityAddress() {
		return univercityAddress;
	}

	public void setUnivercityAddress(String univercityAddress) {
		this.univercityAddress = univercityAddress;
	}

	@Override
	public String toString() {
		return "Univercity [id=" + id + ", name=" + name + ", levelOfAccreditation=" + levelOfAccreditation
				+ ", numbersOfInstitutes=" + numbersOfInstitutes + ", amountOfStudents=" + amountOfStudents
				+ ", univercityAddress=" + univercityAddress + "]";
	}
}
