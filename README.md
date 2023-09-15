<b>Project: </b> EmployeeProject <br />
<b>Package: </b> employee.version1 <br />

<h2>HourlyEmployee</h2>
<ul>
  <li>empID: int</li>
</ul>
- empName: String <br />
- empDateHired: Date <br />
- empBirthDate: Date <br />
- totalHoursWorked: float <br />
- ratePerHour: float <br />
Create and overload constructors at least 3 <br />
Accessors and mutators<br />
- computeSalary(): double <br />
  - computes the salary based on a weekly work hours. An employee normally works 8hrs a day 5 times a week. Excess hours is considered as an overtime which will have 150% rate <br />
- displayInfo(): void <br />
  - show all details above w/salary<br />
- override toString() <br />
  - returns the string information of the employee only <br /><br />

<h2>PieceWorkerEmployee</h2> 
- empID: int <br />
- empName: String <br />
- empDateHired: Date <br />
- empBirthDate: Date <br />

<h2>CommissionEmployee</h2>

<h2>BasePlusCommissionEmployee</h2>

<h2>TestMain</h2>

Read this! Possible solution of bug:
Exception in thread "main" java.time.format.DateTimeParseException: Text '02-10-2003' could not be parsed at index 0
https://javahungry.blogspot.com/2022/12/java-time-format-datetimeparseexception-text-could-not-be-parsed-at-index.html

Why?
LocalDateTime will asks for date and time while our code didn't include time thus try to fix it!
