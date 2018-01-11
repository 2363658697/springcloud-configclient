package food.service;

import java.util.List;

import food.entity.TreeNode;

public interface DeptService {


	public abstract List<TreeNode> queryDept(Integer id);

}