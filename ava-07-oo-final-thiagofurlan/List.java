public class List<T> {

    public Object[] objects;

    List() {
        this.objects = new Object[1];
    }

    public int count() {
        int count = 0;
        for (Object o : this.objects) {
            if (o != null) count++;
        }
        return count;
    }

    public int length() { 
        return this.objects.length;
    }

    public boolean isEmpty() {
        return this.count() == 0;
    }

    public Object get(int i) {
       if (i < 0 || this.length() < i) return null;
        return this.objects[i];
    }

    public Object[] get() {
        return this.objects;
    }

    public Object last() {
        if (this.isEmpty()) return null;
        return this.objects[this.count() - 1];
	}

    public void append(T o) {
        if (o == null) return;
        this.resize();
        for (int i = 0; i < this.length(); i++) {
            if (this.objects[i] == null) {
                this.objects[i] = o;
                return;
            }
        }
    }

    public int indexOf(T o) {
        for (int i = 0; i < this.length(); i++) {
            if (o.equals(this.objects[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean has(T o) {
        if (this.indexOf(o) >= 0) return true;
        return false;
    }

    public boolean delete(int a) {
        if (a > this.count()) return false;
        this.objects[a] = null;
        this.objects = this.trim();
        return true;
    }

    public boolean remove(T o) {
        int i = this.indexOf(o);
        if (i >= 0) {
            this.delete(i);
            return true;
        }
        return false;
    }

    public void reset() {
        this.objects = new Object[1];
    }

    public void prepend(T o) {
        this.objects = this.slip();
        this.objects[0] = o;
    }

    public void insert(T o, int a) {
        if (a < 0 || a > this.count()) return;
        Object[] copy = new Object[10];
        for (int i = 0; i < this.length(); i++) {
            if (i < a) {
                copy[i] = this.objects[i];
            }
            if (i == a) {
                copy[i] = o;    
            }
            if (i > a) {
                copy[i] = this.objects[i-1];
            }
        }
        this.objects = copy;
    }

    private Object[] trim() {
        this.resize();
        Object[] trimmed = new Object[this.length() + 1];
        int j = 0;
        for (int i = 0; i < this.length(); i++) {
            if (this.objects[i] != null) {
                trimmed[j] = this.objects[i];
                j++;
            }
        }
        return trimmed;
    }

    private Object[] slip() {
        Object[] slipped = new Object[this.length() + 1];
        int j = 1;
        slipped[0] = null;
        for (int i = 0; i < this.length(); i++) {
            slipped[j] = this.objects[i];
            j++;
        }
        return slipped;
    }

    private void resize() {
        Object[] copy = new Object[this.length() + 1];
        for (int i = 0; i < this.length(); i++) {
            copy[i] = this.objects[i];
        }
        this.objects = copy;
    }

}
