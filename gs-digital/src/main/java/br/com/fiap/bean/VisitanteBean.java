package br.com.fiap.bean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.fiap.dao.VisitanteDao;
import br.com.fiap.model.VisitanteModel;

@ManagedBean
@RequestScoped
public class VisitanteBean {
	
	
	
	public VisitanteBean(VisitanteModel visitante) {
		this.visitante = visitante;
	}

	@Inject
	private VisitanteModel visitante;
	
	
	public void save() {
		new VisitanteDao().create(visitante);
	}
	
	public List<VisitanteModel> getAll(){
		return new VisitanteDao().listAll();
	}
	
	public VisitanteModel getVisitante() {
		return visitante;
	}
	
	public void setVisitante(VisitanteModel visitante) {
		this.visitante = visitante;
	}
}
