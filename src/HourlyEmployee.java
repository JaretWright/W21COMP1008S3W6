import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private double hourlyRate, hoursWorked;

    public HourlyEmployee(String firstName, String lastName, LocalDate dateOfBirth, double hourlyRate) {
        super(firstName, lastName, dateOfBirth);
        setHourlyRate(hourlyRate);
    }

    @Override
    public double calculatePay() {
        return hourlyRate*hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 14)
            this.hourlyRate = hourlyRate;
        else
            throw new IllegalArgumentException("Hourly Rate must be at least $14");
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked>=0 && hoursWorked<=80)
            this.hoursWorked = hoursWorked;
        else
            throw new IllegalArgumentException("Hours worked must be 0-80");
    }
}
