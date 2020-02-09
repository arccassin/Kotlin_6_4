package Employees

/**
 * Created by User on 06 Февр., 2020
 */
class TopManager(_fixedSalary: Int, _premiumSalary: Int, _incomeCompany: Int)
    : ParentEmployee(_fixedSalary) {
    var incomeCompany: Int
    var premiumSalary: Int
    init {
        incomeCompany = _incomeCompany
        premiumSalary = _premiumSalary
    }

    override fun getMonthSalary(): Int {
        return getFixedSalary() + if (incomeCompany > 10_000_000) premiumSalary else 0
    }

    override fun toString(): String {
        return "TopManager{} monthSalary = " + getMonthSalary()
    }
}