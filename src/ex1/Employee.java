package ex1;

class Employee {
    public String firstName, lastName, empId;
    public double experienceInYears;

    public Employee(String firstName, String lastName, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(double experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}

