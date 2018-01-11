package food.service;

import food.entity.Emp;
import food.entity.EmpExample;
import food.utils.PageTools;

public interface EmpService {

	public abstract int getEmpCount(EmpExample example);

	public abstract PageTools queryEmpByEname(String ename, Integer page,
			Integer rows,Integer deptno);

	public abstract void saveEmp(Emp emp);

	public abstract void updateEmp(Emp emp);

	public abstract void deleteEmp(String empno);

}