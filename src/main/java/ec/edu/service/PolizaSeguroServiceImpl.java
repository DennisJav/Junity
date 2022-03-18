package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.PolizaSeguro;
import ec.edu.repository.IPolizaSeguroRepo;

@Service
public class PolizaSeguroServiceImpl implements IPolizaSeguroService{

	@Autowired
	private IPolizaSeguroRepo polizaSeguroRepo;
	
	@Override
	public void crearPolizaSeguro(PolizaSeguro poliza) {
		// TODO Auto-generated method stub
		this.polizaSeguroRepo.crearPolizaSeguro(poliza);
	}

	@Override
	public PolizaSeguro buscarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		return this.polizaSeguroRepo.buscarPolizaSeguro(id);
	}

	@Override
	public void borrarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		this.polizaSeguroRepo.borrarPolizaSeguro(id);
	}

	@Override
	public void actualizarPolizaSeguro(PolizaSeguro poliza) {
		// TODO Auto-generated method stub
		this.polizaSeguroRepo.actualizarPolizaSeguro(poliza);
	}
	

}
