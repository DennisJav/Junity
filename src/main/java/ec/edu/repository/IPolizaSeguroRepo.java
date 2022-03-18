package ec.edu.repository;

import ec.edu.modelo.PolizaSeguro;

public interface IPolizaSeguroRepo {

	void crearPolizaSeguro(PolizaSeguro poliza);
	PolizaSeguro buscarPolizaSeguro(Integer id);
	void borrarPolizaSeguro(Integer id);
	void actualizarPolizaSeguro(PolizaSeguro poliza);
}
