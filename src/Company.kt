import Employees.Employee
import Employees.ParentEmployee
import java.util.*
import kotlin.random.Random

/**
 * Created by User on 06 Февр., 2020
 */
class Company(
    var fixedSalary: Int,
    var preliminaryTop: Int,
    var incomeCompany: Int,
    var employeeCount: Int){

    private val personalList = ArrayList<ParentEmployee>()

    fun getTopSalaryStaff(count: Int): MutableList<ParentEmployee>? {

        val comparator: EmployeeComparator = EmployeeComparator()
        Collections.sort(personalList, comparator.reversed())
        if (count == 0 || count > personalList.size) {
            return personalList
        }
        return personalList.subList(0, count)
    }

    fun getLowestSalaryStaff(count: Int): MutableList<ParentEmployee>? {

        val comparator: EmployeeComparator = EmployeeComparator()
        Collections.sort(personalList, comparator)
        if (count == 0 || count > personalList.size) {
            return personalList
        }
        return personalList.subList(0, count)
    }

    fun hire(employee: ParentEmployee) {
        personalList.add(employee)
    }

    fun hireAll(employeeList: ArrayList<ParentEmployee>) {
        for (employee in employeeList) {
            personalList.add(employee)
        }
    }

    fun fire(employee: Employee) {
        personalList.remove(employee)
    }

    fun getRandomEmployee(): Employee{
        return personalList.get(Random.nextInt(0, personalList.size - 1))
    }

}