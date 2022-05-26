package pl.sda.java.designPatterns.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositeTest {

    @Test
    void shouldCreateHeadWithFinancialAndSales() {

        Department salesDepartment = new SalesDepartment();
        Department financialDepartment = new FinancialDepartment();
        HeadDepartment headDepartment = new HeadDepartment();
        String expected = "HeadDepartment: SalesDepartment, FinancialDepartment";

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        String parentDepartmentWithChildren = headDepartment.getDepartmentName();

        assertEquals(expected,parentDepartmentWithChildren);
    }

    @Test
    void shouldCreateHeadWithNoKids() {
        HeadDepartment headDepartment = new HeadDepartment();
        String expected = "HeadDepartment";

        String departmentName = headDepartment.getDepartmentName();

        assertEquals(expected, departmentName);
    }
}