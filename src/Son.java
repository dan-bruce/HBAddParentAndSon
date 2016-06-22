import java.io.Serializable;

public class Son implements Serializable {
    private int    id;
    private String sonName;
    private int    sonAge;
    private Person parent;

    public Son(String sonName, int sonAge) {
        this.sonName = sonName;
        this.sonAge = sonAge;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return (this.id);
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public String getSonName() {
        return (this.sonName);
    }

    public void setSonAge(int sonAge) {
        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return (this.sonAge);
    }

    public void setParent(Person p) {
        this.parent = p;
    }

    public Person getParent() {
        return this.parent;
    }

}
