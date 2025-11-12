package fig3;

import java.util.Arrays;
import java.util.List;


public class GameDevCompany extends Company {
    @Override
    protected List<Employee> getEmployees() {
        return Arrays.asList(new Designer("Lead Designer"), new Programmer("Game Programmer"));
    }
}
