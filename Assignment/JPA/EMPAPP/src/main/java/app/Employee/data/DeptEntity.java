package app.Employee.data;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "dept")
public class DeptEntity {

    @Id
    @Column()
    private int Deptno;
    @Column()
    private String Dname;
    @Column()
    private String Loc;

    @OneToMany
    @JoinColumn(name="deptno")
    private List<EmpEntity> Empl;


    public List<EmpEntity> getEmpl() {
        return Empl;
    }

    public void setEmpl(List<EmpEntity> empl) {
        Empl = empl;
    }

    public int getDeptno() {
        return Deptno;
    }

    public void setDeptno(int deptno) {
        Deptno = deptno;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }
    
     
    
}
