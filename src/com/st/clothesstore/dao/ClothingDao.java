package com.st.clothesstore.dao;

import com.st.clothesstore.entity.Clothing;

import java.util.List;

public interface ClothingDAO {
	void addClothing(Clothing clothing);
	void updateClothing(Clothing clothing);
	void deleteClothing(int id);
	List<Clothing> getAllClothing();
}