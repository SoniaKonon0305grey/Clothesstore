package com.st.clothesstore.logic;

import com.st.clothesstore.controller.Command;
import com.st.clothesstore.controller.impl.AddClothingCommand;
import com.st.clothesstore.controller.impl.DeleteClothingCommand;
import com.st.clothesstore.controller.impl.GetClothingCommand;
import com.st.clothesstore.controller.impl.UpdateClothingCommand;
import com.st.clothesstore.dao.ClothingDAO;
import com.st.clothesstore.dao.impl.ClothingDAOImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClothingStore {
	private Map<String, Command> commandMap = new HashMap<>();

	public ClothingStore() {
		ClothingDAO clothingDAO = new ClothingDAOImpl();
		commandMap.put("add", new AddClothingCommand(clothingDAO));
		commandMap.put("update", new UpdateClothingCommand(clothingDAO));
		commandMap.put("delete", new DeleteClothingCommand(clothingDAO));
		commandMap.put("get", new GetClothingCommand(clothingDAO));
	}

	public void executeCommand(String commandName) {
		Command command = commandMap.get(commandName);
		if (command != null) {
			command.execute();
		} else {
			System.out.println("Неизвестная команда: " + commandName);
		}
	}

	public static void main(String[] args) {
		ClothingStore store = new ClothingStore();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Введите команду (add/update/delete/get/exit):");
			String command = scanner.nextLine();
			if ("exit".equalsIgnoreCase(command)) {
				break;
			}
			store.executeCommand(command);
		}
	}
}