package com.st.clothesstore.controller.impl;

import com.st.clothesstore.controller.Command;
import com.st.clothesstore.dao.ClothingDAO;

import java.util.Scanner;

public class DeleteClothingCommand implements Command {
	private ClothingDAO clothingDAO;

	public DeleteClothingCommand(ClothingDAO clothingDAO) {
		this.clothingDAO = clothingDAO;
	}

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ID одежды для удаления:");
		int id = Integer.parseInt(scanner.nextLine());
		clothingDAO.deleteClothing(id);
		System.out.println("Одежда с ID '" + id + "' удалена.");
	}
}