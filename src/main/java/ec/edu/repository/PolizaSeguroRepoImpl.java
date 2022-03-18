package ec.edu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.PolizaSeguro;

@Transactional
@Repository
public class PolizaSeguroRepoImpl implements IPolizaSeguroRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearPolizaSeguro(PolizaSeguro poliza) {
		// TODO Auto-generated method stub
		this.entityManager.persist(poliza);
	}

	@Override
	public PolizaSeguro buscarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(PolizaSeguro.class, id);
	}

	@Override
	public void borrarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		PolizaSeguro poleliminar = this.buscarPolizaSeguro(id);
		this.entityManager.remove(poleliminar);
	}

	@Override
	public void actualizarPolizaSeguro(PolizaSeguro poliza) {
		// TODO Auto-generated method stub
		this.entityManager.merge(poliza);
	}

	
	
	
}
