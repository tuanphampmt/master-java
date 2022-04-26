package collections;

import java.util.Date;

public class Person implements Comparable<Person> {
    private long id;
    private String email;
    private Date createdOn;

    public Person(long id, String email) {
        this.id = id;
        this.email = email;
        this.createdOn = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Person@id=" + id + ",email=" + email + ",createdOn=" + createdOn;
    }

    @Override
    public int compareTo(Person person) {
        if (getEmail() == null || person.getEmail() == null) {
            return 0;
        }
        return getEmail().compareTo(person.getEmail());
    }

//    @Override
//    public int compareTo(Person person) {
//        if (getCreatedOn() == null || person.getCreatedOn() == null) {
//            return 0;
//        }
//        return getCreatedOn().compareTo(person.getCreatedOn());
//    }

//    @Override
//    public int compareTo(Person person) {
//        return getId() == person.getId();
//    }
}
