import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {
    private String firstName, lastName;
    private LocalDate dateOfBirth;
    private int employeeNumber;
    private static int nextEmployeeNumber = 10001;

    public Employee(String firstName, String lastName, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setEmployeeNumber(nextEmployeeNumber++);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length()>=2)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("first name must have at least 2 characters");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length()>=2)
            this.lastName = lastName;
        else throw new IllegalArgumentException("last name must have at least 2 characters");
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Birthday cannot be in the future");

        if (getAge(dateOfBirth) >= 120)
            throw new IllegalArgumentException("age must be under 120");

        this.dateOfBirth = dateOfBirth;
    }

    private int getAge(LocalDate dateOfBirth)
    {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    private void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String toString()
    {
        return String.format("%s %s, empl#: %d -> class: %s",firstName, lastName, employeeNumber,
                                            getClass());
    }

    abstract public double calculatePay();
}
