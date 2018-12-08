public class Member {

    private Person person;

    public Member(Person p) {
        this.person = p;
    }

    public String getRace() {
        return this.person.getRace();
    }

    public Person person() {
        return this.person;
    }

    @Override
    public boolean equals(Object o) {
        if (this.person == o) return true;
        return false;
    }

}