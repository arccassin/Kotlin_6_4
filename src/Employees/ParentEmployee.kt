package Employees

/**
 * Created by User on 06 Февр., 2020
 */
open class ParentEmployee(_fixedSalary: Int): Employee, Comparable<Employee> {
    private val fixedSalary: Int
    init {
        fixedSalary = _fixedSalary
    }

    fun getFixedSalary(): Int {
        return fixedSalary
    }

    override fun compareTo(o: Employee): Int {
        if (getMonthSalary() > o.getMonthSalary()) {
            return 1
        }
        return if (getMonthSalary() < o.getMonthSalary()) {
            -1
        } else 0
    }

    override fun getMonthSalary(): Int {
        return 0
    }
}