package pl.sda.java.designPatterns.structural.composite;

public class FinancialDepartment implements Department {
    @Override
    public String getDepartmentName() {
        return getClass().getSimpleName();
    }
}