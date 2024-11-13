package app;
import java.util.List;

import app.Employee.data.EmpEntity;
import jakarta.persistence.Persistence;


public class Program {
    
    public static void main(String[] args) throws Exception {

        var emp = Persistence.createEntityManagerFactory("app.data");
        var em =emp.createEntityManager();
        if(args.length == 0){
            var products = em.createNamedQuery("findDept", EmpEntity.class)
                .setParameter(1, 20)
                .getResultList();
            for(var item : products)
                System.out.printf("%d\t%s\t%f%n", item.getEmpno(), item.getEname(), item.getDeptno());
            
    }
}

}