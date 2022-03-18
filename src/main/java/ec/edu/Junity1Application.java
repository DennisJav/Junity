package ec.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.modelo.Artista;
import ec.edu.modelo.PolizaSeguro;
import ec.edu.service.IArtistaService;
import ec.edu.service.IPolizaSeguroService;

@SpringBootApplication
public class Junity1Application implements CommandLineRunner{

	@Autowired
	private IArtistaService artistaService;
	
	@Autowired
	private IPolizaSeguroService polizaSeguroService;
	
	public static void main(String[] args) {
		SpringApplication.run(Junity1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Hola no test");
		
		//Artista ar = new Artista();
		//ar.setNombre("De");
		//ar.setApellido("Ortiz");
		
		//this.artistaService.guardarArtista(ar);
		//ar.setId(1);
		//ar.setPrecio(new BigDecimal(1000));
		//this.artistaService.modificarArtista(ar);
		
		///////////////////////////////////////////////////
		////Tarea 27 /////////////
		
//		PolizaSeguro pl = new PolizaSeguro();
//		pl.setNumero("123");
//		pl.setValor(new BigDecimal(1000));
//		pl.setFechaEmision(LocalDateTime.now());
//		pl.setFechaVigencia(LocalDateTime.of(2022, Month.DECEMBER, 25, 12, 0));
//		pl.setEstado("Activo");
//		pl.setDescripcion("ninguna");
////
//		pl.setId(2);
//		this.polizaSeguroService.actualizarPolizaSeguro(pl);
		
		System.out.println(this.polizaSeguroService.buscarPolizaSeguro(1).getDescripcion());
		
//		this.polizaSeguroService.crearPolizaSeguro(pl);
//		
		
	}

	
	
	
	
}
