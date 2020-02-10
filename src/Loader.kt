import Employees.*
import java.util.ArrayList

/**
 * Created by User on 09 Февр., 2020
 */

fun main() {
    val employeeCount = 270;

    val company = Company(40000, 100000, 20000000, employeeCount)
    for (i in 0 until company.employeeCount) {
        if (i % 27 == 0) {
            val fixedSalary = company.fixedSalary * 10 + (Math.random() * company.fixedSalary / 10).toInt()
            val topManager = TopManager(fixedSalary, company.preliminaryTop, company.incomeCompany)
            company.hire(topManager)
        } else if (i % 10 == 0) {
            val fixedSalary = company.fixedSalary + (Math.random() * company.fixedSalary / 10).toInt()
            val involvementSalary =
                (company.incomeCompany / (company.employeeCount / 10) + Math.random() * 10000 - 5000).toInt()
            val manager = Manager(fixedSalary, involvementSalary)
            company.hire(manager)
        } else {
            val fixedSalary = company.fixedSalary + (Math.random() * company.fixedSalary / 10).toInt()
            val operator = Operator(fixedSalary)
            company.hire(operator)
        }

    }
    println("15 самых высокооплачиваемых")
    var employees: MutableList<ParentEmployee>? = ArrayList()
    employees = company.getTopSalaryStaff(15)
    if (employees != null) {
        var counter = 1;
        for (employee in employees) {
            println("$counter. ${employee.getMonthSalary()}")
            counter++
        }
    }
    println("\n30 самых низкооплачиваемых")
    employees = company.getLowestSalaryStaff(30)
    if (employees != null) {
        var counter = 1;
        for (employee in employees) {
            println("$counter. ${employee.getMonthSalary()}")
            counter++
        }
    }

    for (i in 1..employeeCount / 2) {
        company.fire(company.getRandomEmployee())
    }
    println("Fire 50% employees!")

    println("\n15 самых высокооплачиваемых")
    employees = company.getTopSalaryStaff(15)
    if (employees != null) {
        var counter = 1;
        for (employee in employees) {
            println("$counter. ${employee.getMonthSalary()}")
            counter++
        }
    }

    println("\n30 самых низкооплачиваемых")
    employees = company.getLowestSalaryStaff(30)
    if (employees != null) {
        var counter = 1;
        for (employee in employees) {
            println("$counter. ${employee.getMonthSalary()}")
            counter++
        }
    }

}