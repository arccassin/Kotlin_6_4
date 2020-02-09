import Employees.Employee

/**
 * Created by User on 07 Февр., 2020
 */
class EmployeeComparator: Comparator<Employee> {

    override fun compare(o1: Employee, o2: Employee): Int {
        if (o1.getMonthSalary() > o2.getMonthSalary()) {
            return 1
        }
        return if (o1.getMonthSalary() < o2.getMonthSalary()) {
            -1
        } else 0
    }
}