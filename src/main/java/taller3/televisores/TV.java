package taller3.televisores;



public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private static int numTV;
	private Control control;
	
	
	public TV(Marca marca,Boolean estado){
		this.marca=marca;
		this.estado=estado;
		numTV=numTV+1;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public boolean getEstado() {
		return estado;
	}

	public void turnOn() {
		estado=true;
	}
    public void turnOff() {
    	estado=false;
	}
    
    
    public void canalUp() {
    	if(estado=true) {
    		if(canal>=1 && canal<=120) {
    			canal=canal+1;
    		}
    	}
    }

    public void canalDown() {
    	if(estado=true) {
    		if(canal>=1 && canal<=120) {
    			canal=canal-1;
    		}
    	}
    }
    
    public void volumenUp() {
    	if(estado=true) {
    		if(volumen>=0 && volumen<=7) {
    			volumen=volumen+1;
    		}
    	}
    }
    
    public void volumenDown() {
    	if(estado=true) {
    		if(volumen>=0 && volumen<=7) {
    			volumen=volumen-1;
    		}
    	}
    }

}
