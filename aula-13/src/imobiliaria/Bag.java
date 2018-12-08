package imobiliaria;

public class Bag {
	
	private Object[] objetos;
	
	public Bag(int tamanho) {
		this.objetos = new Object[tamanho];
	}

	public boolean isEmpty() {
		return this.count() == 0;
	}

	public int count() {
		int count = 0;
		for (Object o : this.objetos) { 
			if (o != null) count++;
		}
		return count;
	}
	
	public void add(Object o) throws FullBagException {
		if (this.count() == this.objetos.length) {
			throw new FullBagException();
		}
		for (int i = 0; i < this.objetos.length; i++) {
			if (this.objetos[i] == null) { 
				this.objetos[i] = o;
				return;
			}
		}
	}

	public boolean has(Object o) {
		for (Object e : this.objetos) if (o.equals(e)) return true; 
		return false;
	}

	public void remove(Object o) {
		for (int i = 0; i < objetos.length; i++) {
			if (this.objetos[i].equals(o)) {
				this.objetos[i] = null;
			}
		}
	}

	public Object[] toArray() {
		Object[] array = new Object[this.count()];
		for (int i = 0, c = 0; i < this.objetos.length; i++) {
			if (this.objetos[i] != null) {
				array[c++] = this.objetos[i];
			}
		}
		return array;
	}
	
	@Override
	public String toString() {
		String s = "Bag content:\n";
		for (Object o : this.toArray()) {
			s += o.toString() + "\n";
		}
		return s;
	}
}
