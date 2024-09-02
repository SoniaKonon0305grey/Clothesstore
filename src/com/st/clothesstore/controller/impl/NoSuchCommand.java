package com.st.clothingstore.controller.impl;

import com.st.clothingstore.controller.Command;

public class NoSuchCommand implements Command {
	@Override
	public String execute(String request) {
		return "Invalid command.";
	}
}