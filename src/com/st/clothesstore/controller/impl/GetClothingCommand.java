package com.st.clothesstore.controller.impl;

import com.st.clothesstore.controller.Command;
import com.st.clothesstore.dao.ClothingDAO;
import com.st.clothesstore.entity.Clothing;

import java.util.List;

public class GetClothingCommand implements Command {
	private ClothingDAO clothingDAO;

	public GetClothingCommand(ClothingDAO clothingDAO) {
		this.clothingDAO = clothingDAO;
	}

	@Override
	public void execute() {
		List<Clothing> clothingList = clothingDAO.getAllClothing();
		for (Clothing clothing : clothingList) {
			System.out.println(clothing);
		}
	}
}