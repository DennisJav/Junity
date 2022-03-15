package ec.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.modelo.Artista;
import ec.edu.service.IArtistaService;

@SpringBootApplication
public class Junity1Application implements CommandLineRunner{

	@Autowired
	private IArtistaService artistaService;
	
	
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
		
	}

	
	
	
	
}
