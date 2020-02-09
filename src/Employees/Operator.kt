package Employees

/**
 * Created by User on 06 Февр., 2020
 */
class Operator(_fixedSalary: Int) : ParentEmployee(_fixedSalary) {
    override fun getMonthSalary(): Int {
        return getFixedSalary()
    }

    override fun toString(): String {
        return "Operator{} monthSalary = " + getMonthSalary()
    }
}