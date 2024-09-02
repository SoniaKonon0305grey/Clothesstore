package com.st.clothesstore.controller.impl;

import com.st.clothesstore.controller.Command;
import com.st.clothesstore.dao.ClothingDAO;
import com.st.clothesstore.entity.Clothing;
import com.st.clothesstore.util.GenerateId;


import java.util.Scanner;

public class AddClothingCommand implements Command {
	private ClothingDAO clothingDAO;

	public AddClothingCommand(ClothingDAO clothingDAO) {
		this.clothingDAO = clothingDAO;
	}

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название одежды:");
		String name = scanner.nextLine();
		System.out.println("Введите размер:");
		String size = scanner.nextLine();
		System.out.println("Введите цену:");
		double price = Double.parseDouble(scanner.nextLine());

		int id = GenerateId.nextId();
		Clothing clothing = new Clothing(id, name, size, price);
		clothingDAO.addClothing(clothing);
		System.out.println("Одежда '" + name + "' добавлена с ID: " + id);
	}
}