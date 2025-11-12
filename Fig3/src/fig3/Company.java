package fig3;

import java.util.Collections;
import java.util.List;

public abstract class Company {
  
    protected abstract List<Employee> getEmployees();

    public final void createSoftware() {
        List<Employee> employees = getEmployees();
        System.out.println(getClass().getSimpleName() + ": Starting software creation with " + employees.size() +
         " employee(s)");
        if (employees.isEmpty()) {
            System.out.println(getClass().getSimpleName() + ": No employees available to work on the project.");
            return;
        }
        for (Employee e : employees) {
            e.doWork();
        }
        System.out.println(getClass().getSimpleName() + ": Software creation complete.\n");
    }

    
    protected List<Employee> emptyEmployees() {
        return Collections.emptyList();
    }
}
