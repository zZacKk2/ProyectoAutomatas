package State;

public class EntregaProducto implements State{
	private String producto;
	private Contexto maquina;
	
	public EntregaProducto(String producto){
		this.producto = producto;
	}
	@Override
	public void Encendido() {
		System.out.println("La máquina está encendida");
		
	}

	@Override
	public void RecibirPedido() {
		System.out.println("La máquina está entregando un producto");	
	}

	@Override
	public void Cobrar() {
		System.out.println("La máquina está entregando un producto");		
	}

	@Override
	public void Entregar() {
		System.out.println("Producto " + this.producto + "entregado!");
		maquina.setEstado(new Encendida());
		
	}

	@Override
	public void Apagado() {
		System.out.println("La máquina está entregando un producto");
		
	}

	@Override
	public void setEstado(Contexto maquina) {
		this.maquina = maquina;
		
	}
	

}
