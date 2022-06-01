package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisitanteModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate birthday;
	private String cpf;
	private String rg;
	private Character digitoRg;
	private LocalDate dtregister = LocalDate.now();
	private String imageProfile;
	
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
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Character getDigitoRg() {
		return digitoRg;
	}
	public void setDigitoRg(Character digitoRg) {
		this.digitoRg = digitoRg;
	}
	public LocalDate getDtregister() {
		return dtregister;
	}
	public void setDtregister(LocalDate dtregister) {
		this.dtregister = dtregister;
	}
	public String getImageProfile() {
		return imageProfile;
	}
	public void setImageProfile(String imageProfile) {
		this.imageProfile = imageProfile;
	}
	
	
	@Override
	public String toString() {
		return "VisitanteModel [id=" + id + ", name=" + name + ", birthday=" + birthday + ", cpf=" + cpf + ", rg=" + rg
				+ ", digitoRg=" + digitoRg + ", dtregister=" + dtregister + ", imageProfile=" + imageProfile + "]";
	}
	
}
