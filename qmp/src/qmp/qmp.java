package qmp;

import java.util.Objects;
import java.util.*;

public class qmp {
	
	
public static void main(String args[]) {
		}
}

class Prenda{
	TipoPrenda tipoPrenda;
	Material material;
	Color colorPrincipal;
	Color colorSecundario;
	
	Prenda(TipoPrenda tipoPrenda,Material material,Color colorPrincipal) {
		this.tipoPrenda=Objects.requireNonNull(tipoPrenda);
		this.material=Objects.requireNonNull(material);
		this.colorPrincipal=Objects.requireNonNull(colorPrincipal);
		
	}
	
	
	 void agregarColorSecundario(Color color){
		this.colorSecundario=color;
	}
	
}


enum TipoPrenda{
	ZAPATO,
	CAMISA,
	PANTALON
}


enum Material{
	Lana,
	CUERO,
	ALGODON
}
enum Color{
	ROJO,
	VERDE,
	AZUL
}
// mi programa va a funcionar teniendo en cuenta de que al principio se debe instanciar un objeto TiposPrendaValidos que contenga
// una lista con los tipos de prenda validos, y otras 4 listas de los tipos ordenados por sus categorias.

class TiposPrendaValidos{
	List<TipoPrenda> prendasValidas;
	List<TipoPrenda> prendasParteSuperior;
	List<TipoPrenda> prendasInferior;
	List<TipoPrenda> calzado;
	List<TipoPrenda> accesorios;
	TiposPrendaValidos (List<TipoPrenda> prendasValidas){
		this.prendasValidas=prendasValidas;
	}
	 void TiposprendaParteSuperior(List<TipoPrenda> prendasParteSuperior){
		this.prendasParteSuperior=prendasParteSuperior;
	}
	 void TiposprendaParteInferior(List<TipoPrenda> prendasInferior){
		this.prendasInferior=prendasInferior;
	}
	 void TiposprendaCalzado(List<TipoPrenda> calzado){
		this.calzado=calzado;
	}
	 void TiposprendaAccesorio(List<TipoPrenda> accesorios){
			this.accesorios=accesorios;
		}
		
	 
	 public String queCategoriaEs(TipoPrenda tipo) {
			if((prendasParteSuperior.contains(tipo))) {
				return "ParteSuperior";
			}
			if((prendasInferior.contains(tipo))) {
				return "ParteInferior";
			}
			if((calzado.contains(tipo))) {
				return "calzado";
			}
			
			else return "accesorio";
			}
	
	
}



















 