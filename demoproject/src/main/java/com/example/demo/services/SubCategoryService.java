package com.example.demo.services;
import com.example.demo.repository.*;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.app.dao.SubCategoryDaoIF;
//import com.app.pojos.Category;
import com.example.demo.model.*;
//import com.app.repository.CategoryRepository;

@Service
@Transactional
public class SubCategoryService {

	@Autowired
	private SubCategoryRepository repo;
	//private SubCategoryDaoIF subdao;
	
	public SubCategoryService() {
	}
	
	public SubCategoryService(SubCategoryRepository repo) {
	
	super();
	this.repo = repo;
}
	public void saveMyUser(SubCategory subcategory)
	{
		repo.save(subcategory);
	}
	public Iterable<SubCategory> showAllUser()
	{
		return repo.findAll();
	}

public Iterable<SubCategory> deleteCategoryByName(String name)
{
	repo.deleteByName(name);
	return repo.findAll();
}

public SubCategory findByCategoryName(String name)
{
	return repo.findByName(name);
}




}

	
	
	
	/*@Override
	public SubCategory saveSubCatgory(SubCategory sub) {
		if (subdao.saveSubCatgory(sub) != null) {
			return sub;
		}
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public List<SubCategory> getSubCategoriesByCategoryId(int cid) {
		List<SubCategory> list = null;
		list = subdao.getSubCategoriesByCategoryId(cid);
		if (list != null) {
			return list;
		}
		return null;
	}

	@Override
	public SubCategory updateSubCategory(SubCategory sub) {
		if (subdao.updateSubCategory(sub) != null) {
			return sub;
		}
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public SubCategory getSubCategory(int scid) {
		return subdao.getSubCategory(scid);
	}
	
	@Override
	public int  deleteSubCategory(int id) {
		subdao.deleteSubCategory(id);
		return id;
	}
}
*/