import javax.swing.JOptionPane;

public class CUICO_EMS
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Alice", 101, 50000.0, JobTitle.DEVELOPER);
        Employee emp2 = new Employee("Bob", 102, 75000.0, JobTitle.MANAGER);
        Employee emp3 = new Employee("Charlie", 103, 45000.0, JobTitle.TESTER);

        Employee.displayCompanyName();
        
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}

class Employee
{
    private String name;
    private int id;
    private double salary;
    private JobTitle jobTitle;

    public Employee(String empName, int empId, double empSalary, JobTitle empJobTitle)
    {
        name = empName;       
        id = empId;          
        salary = empSalary;   
        jobTitle = empJobTitle;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public JobTitle getJobTitle()
    {
        return jobTitle;
    }
    public void setJobTitle(JobTitle jobTitle)
    {
        this.jobTitle = jobTitle;
    }
    
    public static void displayCompanyName()
    {
        JOptionPane.showMessageDialog(null, "Company: TechCorp");
    }

    public void displayInfo()
    {
        JOptionPane.showMessageDialog(null, "Employee ID: " + id + "\n" + "Name: " + name + "\n" + "Job Title: " + jobTitle + "\n" + "Salary: " + salary);
    }
}

