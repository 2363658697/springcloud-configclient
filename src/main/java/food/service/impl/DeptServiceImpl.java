package food.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import food.dao.DeptMapper;
import food.entity.Dept;
import food.entity.DeptExample;
import food.entity.DeptExample.Criteria;
import food.entity.TreeNode;
import food.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptMapper deptMapper;

	/* (non-Javadoc)
	 * @see food.service.impl.DeptService#queryFoodByFoodName(java.lang.Integer)
	 */
	public List<TreeNode> queryDept(Integer id) {
		if(id==null){
			id=0;
		}
		
		DeptExample example=new DeptExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(id);
		
		List<TreeNode> nodes = new ArrayList<TreeNode>();
		List<Dept> list = deptMapper.selectByExample(example);
		for(Dept dept:list){
			TreeNode treeNode=new TreeNode();
			treeNode.setId(dept.getDeptno());
			treeNode.setText(dept.getDname());
			//判断该节点是否还存在子节点
			if(queryDept(dept.getDeptno()).size()==0){
				treeNode.setState("open");
			}
			nodes.add(treeNode);
		}
		return nodes;
	}

}
