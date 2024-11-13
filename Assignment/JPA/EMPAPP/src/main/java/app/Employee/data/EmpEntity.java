package app.Employee.data;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name ="emp")
@NamedQuery(name = "findDept", query = "SELECT e FROM EmpEntity e WHERE e.Deptno = ?1")
public class EmpEntity {
    
    @Id
    @Column()
    private int Empno;

    @Basic
    @Column()
    private String Ename;

    @Column()
    private String Job;

    @Column()
    private double Sal;

    @Column()
    private double Deptno;

    public int getEmpno() {
        return Empno;
    }

    public void setEmpno(int empno) {
        Empno = empno;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public double getSal() {
        return Sal;
    }

    public void setSal(double sal) {
        Sal = sal;
    }

    public double getDeptno() {
        return Deptno;
    }

    public void setDeptno(double deptno) {
        Deptno = deptno;
    }

   
}
