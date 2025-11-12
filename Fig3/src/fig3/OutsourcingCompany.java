package fig3;

import java.util.Arrays;
import java.util.List;

public class OutsourcingCompany extends Company {
    @Override
    protected List<Employee> getEmployees() {
        return Arrays.asList(new Programmer("Contract Programmer"), new Tester("QA Tester"));
    }
}
