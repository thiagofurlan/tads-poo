public class Fellowship {

    public String name;
    public List<Member> members = new List<Member>();

    Fellowship(String name) {
        this.name = name;
    }

    public int count() {
        return this.members.count();
    }

    public int count(String race) {
		int count = 0;
        for (int i = 0; i < this.members.count(); i++) {
            if (((Member)this.members.get(i)).getRace() == race) count++;
        }
        return count;
	}

    public boolean has(String race) {
        if (this.count(race) > 0) return true;
        return false;
    }

    public boolean hasNoMembers() {
        return this.count() == 0;
    }

    public boolean hasMembers() {
        return !this.hasNoMembers();
    }

    public Member member(int i) {
        return (Member) this.members.get(i - 1);
    }

    public Member lastMember() {
        return (Member) this.members.last();
    }

    public void cancel(Person p) {
		for (int i = 0; i < this.members.count(); i++) {
			if (this.members.get(i).equals(p)) {
                this.members.delete(i);
				p.setFellowship(null);
			}
		}
	}

    public void signUp(Person p) {
        if (!p.isMemberOfAFellowship() && !p.isDead()) {
            p.setFellowship(this);
            members.append(new Member(p));
        }
    }

    public void signUp(Person p1, Person p2) {
        signUp(p1);
        signUp(p2);
    }

    public void signUp(Person p1, Person p2, Person p3) {
        signUp(p1);
        signUp(p2);
        signUp(p3);
    }

    public void dissolve() {
		this.members.reset();
	}

    @Override
    public String toString() {
        return "Fellowship " + this.name;
    }

}