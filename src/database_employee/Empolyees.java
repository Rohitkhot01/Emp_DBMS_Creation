package database_employee;

public class Empolyees {
	String name;
	int empid;
	int deptNo;
	int managerId;
	String hireDate;
	double sal;
	double comm;
	String jobRole;
	public Empolyees(String name, int empid, int deptNo, int managerId, String hireDate, double sal, double comm,
			String jobRole) {
		super();
		this.name = name;
		this.empid = empid;
		this.deptNo = deptNo;
		this.managerId = managerId;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.jobRole = jobRole;
	}
	
//	public static Empolyees createEmp(String name, int empid, int deptNo, int managerId, String hireDate, double sal, double comm,
//			String jobRole)
//	{
//		if(DbEmpolyees.checkConnection())
//		{
//			return new Empolyees(name,empid,deptNo,managerId,hireDate,sal,comm,jobRole);
//		}
//		else 
//			return null;
//	}
	@Override
	public String toString() {
		return "[name=" + name + ", empid=" + empid + ", deptNo=" + deptNo + ", managerId=" + managerId
				+ ", hireDate=" + hireDate + ", sal=" + sal + ", comm=" + comm + ", jobRole=" + jobRole + "]";
	}
	
	
}
