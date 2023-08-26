package in.ineuron.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {

	// Syntax :: AS RT packageName.ClassName.methodName(Paraameter)
	@Pointcut("execution(public void in.ineuron.dao.EmployeeDao.saveEmployee())")
	public void saveOperation() {

	}

	@Pointcut("execution(public void in.ineuron.dao.EmployeeDao.deleteEmployee())")
	public void deleteOperation() {

	}

	@Pointcut("saveOperation() || deleteOperation()")
	public void operation() {

	}

	@Before("saveOperation()") // joinpoint
	public void beginTransaction() {
		System.out.println("Transaction Begin");
	}

	@After("saveOperation()") // joinpoint
	public void commitTransaction() {
		System.out.println("Transaction Commited");
	}
}
