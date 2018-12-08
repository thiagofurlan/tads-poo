public abstract class Person {

    public String name;
    public Fellowship fellowship;
    private boolean dead;

    Person(String name) {
        this.name = name;
        this.dead = false;
    }

    public String name() {
        return this.name;
    }

    public Person person() {
        return this;
    }

    public boolean isDead() {
        return this.dead;
    }

	public void die() {
        this.left();
		this.dead = true;
	}

    public void left() {
		this.fellowship.cancel(this);
		this.setFellowship(null);
	}

    public Fellowship fellowship() {
        return this.fellowship;
    }

    public void setFellowship(Fellowship f) {
        this.fellowship = f;
    }

    public boolean isMemberOfAFellowship() {
        if (this.fellowship == null) return false;
        return true;
    }

    public boolean isMemberOfTheFellowship(Fellowship f) {
        if (this.isMemberOfAFellowship()) return this.fellowship.equals(f);
        return false;
	}

    public void join(Fellowship f) {
        f.signUp(this);
    }

    public abstract String getRace();

    public Fellowship getFellowship() {
        return fellowship;
    }

    public boolean isFellowOf(Person p) {
		if (p.getFellowship() == this.fellowship) return true;
		return false;
	}

    public void fellow(Person p) {
		if(this.isMemberOfAFellowship()) {
			this.fellowship.signUp(p);
		} else if(p.isMemberOfAFellowship()) {
			p.fellowship().signUp(this);
		}
	}

    @Override
    public String toString() {
        return this.name;
    }

    public boolean equals(Object o) {
        Person other = (Person) o;
		return this.name == other.name;
    }

}