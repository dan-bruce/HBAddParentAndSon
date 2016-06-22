import com.opensymphony.xwork2.ActionSupport;

public class AddPersonAndSon extends ActionSupport {
    private String name;
    private String gender;
    private String sonName;
    private int    sonAge;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return (this.gender);
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

    public String execute() throws Exception {

        String[] sonNames = { sonName };
        int[] sonAges = { sonAge };

        PersonService ps = (PersonService) AppFactory.instance()
                .getApp("personService");

        ps.createPersonAndSon(name, gender, sonNames, sonAges);
        return "success";
    }

}
