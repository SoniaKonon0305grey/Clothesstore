package com.st.clothesstore.dao.impl;

import com.st.clothesstore.dao.ClothingDAO;
import com.st.clothesstore.entity.Clothing;

import java.util.ArrayList;
import java.util.List;

public class ClothingDAOImpl implements ClothingDAO {
	private List<Clothing> clothingList = new ArrayList<>();
	private int currentId = 1;

	@Override
	public void addClothing(Clothing clothing) {
		clothing.setId(currentId++);
		clothingList.add(clothing);
	}

	@Override
	public void updateClothing(Clothing clothing) {
		for (int i = 0; i < clothingList.size(); i++) {
			if (clothingList.get(i).getId() == clothing.getId()) {
				clothingList.set(i, clothing);
				break;
			}
		}
	}

	@Override
	public void deleteClothing(int id) {
		clothingList.removeIf(clothing -> clothing.getId() == id);
	}

	@Override
	public List<Clothing> getAllClothing() {
		return new ArrayList<>(clothingList);
	}
}