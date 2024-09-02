package com.st.clothesstore.controller.impl;

import com.st.clothesstore.controller.Command;
import com.st.clothesstore.dao.ClothingDAO;
import com.st.clothesstore.entity.Clothing;

import java.util.Scanner;

public class UpdateClothingCommand implements Command {
	private ClothingDAO clothingDAO;

	public UpdateClothingCommand(ClothingDAO clothingDAO) {
		this.clothingDAO = clothingDAO;
	}

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ID одежды для обновления:");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Введите новое название одежды:");
		String name = scanner.nextLine();
		System.out.println("Введите новый размер:");
		String size = scanner.nextLine();
		System.out.println("Введите новую цену:");
		double price = Double.parseDouble(scanner.nextLine());

		Clothing clothing = new Clothing(name, size, price);
		clothing.setId(id);
		clothingDAO.updateClothing(clothing);
		System.out.println("Одежда '" + name + "' обновлена.");
	}
}