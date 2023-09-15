<b>Project: </b> EmployeeProject <br />
<b>Package: </b> employee.version1 <br />

<h2>HourlyEmployee</h2>
<h3>Instance variables:</h3>
<ul>
  <li>empID: int</li>
  <li>empName: String</li>
  <li>empDateHired: Date</li>
  <li>empBirthDate: Date</li>
  <li>totalHoursWorked: float</li>
  <li>ratePerHour: float</li>
</ul>
<p>Create and overload constructors at least 3</p>
<p>Accessors and mutators (Setters and Getters)</p>
<h3>Methods:</h3>
<ul>
  <li>
    <b>computeSalary(): double </b><br />
    Computes the salary based on weekly work hours. An employee normally works 8hrs a day 5 times a week. Excess hours are considered overtime which will have a 150% rate.
  </li>
  <li> 
    <b>displayInfo(): void </b><br />
    Show all details above w/salary
  </li>
  <li>
    <b>override toString()</b><br />
    Returns the string information of the employee only <br /><br />
  </li>
</ul>

<h2>PieceWorkerEmployee</h2> 
<h3>Instance variables:</h3>
<ul>
  <li>empID: int</li>
  <li>empName: String</li>
  <li>empDateHired: Date</li>
  <li>empBirthDate: Date</li>
  <li>totalPiecesFinished: float</li>
  <li>ratePerPieace: float</li>
</ul>
<p>Create and overload constructors at least 3</p>
<p>Accessors and mutators (Setters and Getters)</p>
<h3>Methods:</h3>
<ul>
  <li>
    <b>computeSalary(): double </b><br />
    Computes the salary based on the total pieces finished times the rate. A bonus is given for every hundred pieces finished which is time 10 of the rater per piece.
  </li>
  <li> 
    <b>displayInfo(): void </b><br />
    Show all details above w/salary
  </li>
  <li>
    <b>override toString()</b><br />
    Returns the string information of the employee only <br /><br />
  </li>
</ul>

<h2>CommissionEmployee</h2>
<h3>Instance variables:</h3>
<ul>
  <li>empID: int</li>
  <li>empName: String</li>
  <li>empDateHired: Date</li>
  <li>empBirthDate: Date</li>
  <li>totalSales: double</li>
</ul>
<p>Create and overload constructors at least 3</p>
<p>Accessors and mutators (Setters and Getters)</p>
<h3>Methods:</h3>
<ul>
  <li>
    <b>computeSalary(): double </b><br />
    Computes the salary based on commission.
    <ol>
      <li>Low Sales: For every < 50K. Get 5% of the sales</li>
      <li>Typical Sales: For every >=50K. Get 20% of the sales</li>
      <li>Typical Sales: For every >=100. Get 30% of the sales</li>
      <li>High Sales: For every >=0.5M. Get 50% of the sales</li>
    </ol>
  </li>
  <li> 
    <b>displayInfo(): void </b><br />
    Show all details above w/salary
  </li>
  <li>
    <b>override toString()</b><br />
    Returns the string information of the employee only <br /><br />
  </li>
</ul>

<h2>BasePlusCommissionEmployee</h2>
<h3>Instance variables:</h3>
<ul>
  <li>empID: int</li>
  <li>empName: String</li>
  <li>empDateHired: Date</li>
  <li>empBirthDate: Date</li>
  <li>totalSales: double</li>
  <li>baseSalary: double</li>
</ul>
<p>Create and overload constructors at least 3</p>
<p>Accessors and mutators (Setters and Getters)</p>
<h3>Methods:</h3>
<ul>
  <li>
    <b>computeSalary(): double </b><br />
    Computes the salary based on adding the commission on sales plus the base salary
  </li>
  <li> 
    <b>displayInfo(): void </b><br />
    Show all details above w/salary
  </li>
  <li>
    <b>override toString()</b><br />
    Returns the string information of the employee only <br /><br />
  </li>
</ul>
