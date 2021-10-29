package taller3.televisores;

public class TV {
	 private Marca marca;
	 private int canal = 1;
	 private int volumen = 1;
	 private int precio = 500;
	 private boolean estado;
	 private Control control;
	 private static int numTV;
	 
	 public TV(Marca marca, boolean estado) {
		  this.marca = marca;
		  this.estado = estado;
		  numTV = numTV+1;
	 }
	 
	 public void setMarca(Marca marca) {
		 this.marca = marca;
	 }
	 public Marca getMarca() {
		 return marca;
	 }
	 public void setControl(Control control) {
		 this.control = control;
	 }
	 public Control getControl() {
		 return control;
	 }
	 public void setPrecio(int precio) {
		 this.precio = precio;
	 }
	 public int getPrecio() {
		 return precio;
	 }
	 public void setVolumen(int volumen) {
		 this.volumen = volumen;
	 }
	 public int getVolumen() {
		 return volumen;
	 }
	 public void setCanal(int j) {
		if (estado==false) {
			return;
		}
		if(j>=1 && j<=120) {
			this.canal = j;
		}
	 }
	 public int getCanal() {
		 return canal;
	 }
	 public void canalUp() {
		 if(canal==120 | estado==false) {
			 return;
		 }
		 canal=canal+1;
	 }
	 public void canalDown() {
		 if(canal==1 | estado==false) {
			 return;
		 }
		 canal--;
	 }
	 public void volumenUp() {
		 if(volumen==7 | estado==false) {
			 return;
		 }
		 volumen=volumen+1;
	 }
	 public void volumenDown() {
		 if(volumen==0 | estado==false) {
			 return;
		 }
		 volumen=volumen-1;
	 } 
	 public void turnOn() {
		 estado = true;
	 }
	 public void turnOff() {
		 estado = false;
	 }
	 public boolean getEstado() {
		 return estado;
	 }
	 
	 public static int getNumTV() {
		 return numTV;
	 }

	public static void setNumTV(int i) {
		numTV = i;	
	}

}