import java.util.Objects;

public class Student {

    private String name;
    private String tccTitle;
    private Boolean approved;
    private int yearsOld;

    public Student(String name, String tccTitle, Boolean approved, int yearsOld) {
        this.name = name;
        this.tccTitle = tccTitle;
        this.approved = approved;
        this.yearsOld = yearsOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTccTitle() {
        return tccTitle;
    }

    public void setTccTitle(String tccTitle) {
        this.tccTitle = tccTitle;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getYearsOld() == student.getYearsOld() &&
                getName().equals(student.getName()) &&
                getTccTitle().equals(student.getTccTitle()) &&
                getApproved().equals(student.getApproved());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTccTitle(), getApproved(), getYearsOld());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", tccTitle='" + tccTitle + '\'' +
                ", approved=" + approved +
                ", yearsOld=" + yearsOld +
                '}';
    }
}

