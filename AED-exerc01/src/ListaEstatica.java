public class ListaEstatica {

	private int[] info;
	private int tamanho;
	
	public ListaEstatica() {
		info = new int[10];
		tamanho = 0;
	}
	
	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	private void redimensionar() {
		int[] novo = new int[tamanho+10];
		for (int i=0; i < info.length; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}
	
	public int buscar(int elemento) {
		for (int i = 0; i < info.length; i++) {
			if (info[i]== elemento) {
				return 1;
			}
		}
		return -1;
	}
	
	private void reposicionar(int posElemt) {
		for (int i = posElemt; i < info.length; i++) {
			if (i < info.length-1) {
				info[i] = info[i+1];
			}
			if(i == info.length-1) {
				info[i]=0;
			}
		}
	}
	
	
	public int[] retirar(int elemento) {
		int posElemt = 0;
		
		if (this.buscar(elemento)==1) {
			for (int i = 0; i < info.length; i++) {
				if (info[i]== elemento) {
					posElemt = i;
					info[i] = info[i+1];
					break;
				}
			}
				
			this.reposicionar(posElemt);
			
			this.redimensionar();
			
			return this.info;
		}
		return null;
	}
	
	
}