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

    fun getTopSalaryStaff(count: Int): ArrayList<Employee>? {
        if (count == 0 || count > personalList.size) {
            return null
        }

        val currentList = ArrayList<Employee>()
        Collections.sort(personalList)
        for (i in personalList.size - 1 downTo personalList.size - 1 - count + 1) {
            currentList.add(personalList[i])
        }
        return currentList
    }

    fun getLowestSalaryStaff(count: Int): ArrayList<Employee>? {
        if (count == 0 || count > personalList.size) {
            return null
        }

        val currentList = ArrayList<Employee>()
        Collections.sort(personalList)
        for (i in personalList.indices) {
            currentList.add(personalList[i])
        }

        return currentList
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