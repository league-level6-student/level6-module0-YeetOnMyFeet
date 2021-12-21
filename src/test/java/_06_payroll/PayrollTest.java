package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
        double hourlyWage = 12.0;
        int numHours = 5;
        //when
        double result = hourlyWage * numHours;
        //then
        assertEquals(60, payroll.calculatePaycheck(hourlyWage, numHours), 0.01);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given

        //when

        //then
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given

        //when

        //then
    }

}