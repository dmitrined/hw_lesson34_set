import java.util.Comparator;
import java.util.Objects;

// Класс Person создан для Task2
public class Person {
    private  String fName;
    private String lName;
    private String birthDate;

    public Person(String fName, String lName, String birthDate) {
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person that)) return false;
        return Objects.equals(getfName(), that.getfName()) && Objects.equals(getlName(), that.getlName()) && Objects.equals(getBirthDate(), that.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getfName(), getlName(), getBirthDate());
    }

    @Override
    public String toString() {
        return "PersonTask2{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
    public static Comparator<Person> byLName(){
        return  (Person o1, Person o2) -> { return o1.lName.compareTo(o2.lName); };
    }

}


