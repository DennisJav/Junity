package ec.edu.service;

import ec.edu.modelo.PolizaSeguro;

public interface IPolizaSeguroService {

	void crearPolizaSeguro(PolizaSeguro poliza);
	PolizaSeguro buscarPolizaSeguro(Integer id);
	void borrarPolizaSeguro(Integer id);
	void actualizarPolizaSeguro(PolizaSeguro poliza);
}
