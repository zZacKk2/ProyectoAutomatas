package State;

public class Contexto {
	State estado;
	public String productos [][] = {{"Papas", "Gaseosa", "Gomitas", "Chicles", "Agua"},
			                        {"2000", "2500", "1500", "500", "1000"}};
	public Contexto() {
		setEstado(new Apagada());
	}

	void setEstado(State estado){
		this.estado = estado;
		estado.setEstado(this);
	}

	
	public void Encendido() {
		this.estado.Encendido();
	}

	
	public void RecibirPedido() {
		this.estado.RecibirPedido();
		
	}


	public void Cobrar() {
		this.estado.Cobrar();;
		
	}

	
	public void Entregar() {
		this.estado.Entregar();
		
	}

	
	public void Apagado() {
		this.estado.Apagado();
		
	}
	
	public State getState() {
		return this.estado;
	}
	
}
