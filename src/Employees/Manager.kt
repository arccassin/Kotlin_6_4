package Employees

/**
 * Created by User on 06 Февр., 2020
 */
class Manager(_fixedSalary: Int, _involvementSalary: Int): ParentEmployee(_fixedSalary) {
    var involvementSalary: Int
    init {
        involvementSalary = _involvementSalary
    }

    override fun toString(): String {
        return "Manager{} monthSalary = " + getMonthSalary()
    }

    override fun getMonthSalary(): Int {
        return getFixedSalary() + (0.05 * involvementSalary).toInt()
    }
}