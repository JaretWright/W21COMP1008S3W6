import java.time.LocalDate;

public class CommisionEmployee extends Employee{

    private double commisionRate, sales;

    public CommisionEmployee(String firstName, String lastName, LocalDate dateOfBirth, double commisionRate) {
        super(firstName, lastName, dateOfBirth);
        this.commisionRate = commisionRate;
        sales = 0;
    }

    @Override
    public double calculatePay() {
        return commisionRate*sales;
    }
}
