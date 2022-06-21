class Employee {
    private var firstName = ""
    private var lastName = ""
    private var salary = 0.0
    private var raisedSalary = 0.0

    fun getFirstName(): String {
        return firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun getName(): String {
        return "$firstName $lastName"
    }

    fun setFirstName(fName: String) {
        firstName = fName
    }

    fun setLastName(lName: String) {
        lastName = lName
    }

    fun getSalary(): Double {
        return salary
    }

    fun setSalary(sal: Double) {
        salary = sal
    }

    fun raiseSalary(percent: Int) {
        raisedSalary = salary + (salary * percent / 100)
    }

    fun getRaisedSalary(): Double {
        return raisedSalary
    }

    fun getAnnualSalary(): Double {
        return salary * 12
    }

    fun getAnnualRaisedSalary(): Double {
        return raisedSalary * 12
    }
}

fun main() {
    val employees = mutableListOf<Employee>()
    println("Please enter NUMBER OF EMPLOYEES.")
    val n = readLine()
    var numberOfEmployees: Int
    var newEmployee: Employee
    n?.let {
        numberOfEmployees = n.toInt()
        for (i in 1..numberOfEmployees) {
            newEmployee = Employee()
            println("Please enter FIRST NAME of employee number $i.")
            val fName = readLine()
            fName?.let {
                newEmployee.setFirstName(fName)
            }
            println("Please enter Last NAME of employee number $i.")
            val lName = readLine()
            lName?.let {
                newEmployee.setLastName(lName)
            }
            println("Please enter Salary of employee number $i.")
            val salary = readLine()
            salary?.let {
                val sal = salary.toDouble()
                newEmployee.setSalary(sal)
            }
            println("Please enter RAISE PERCENT for employee number $i.")
            val percent = readLine()
            percent?.let {
                val per = percent.toInt()
                newEmployee.raiseSalary(per)
            }
            employees.add(newEmployee)
        }
        for (employee in employees) {
            print("NAME:\t")
            println(employee.getName())
            print("ANNUAL SALARY:\t")
            println(employee.getAnnualSalary())
            print("RAISED SALARY:\t")
            println(employee.getRaisedSalary())
            print("RAISED ANNUAL SALARY:\t")
            println(employee.getAnnualRaisedSalary())
            println()
        }
    }
}