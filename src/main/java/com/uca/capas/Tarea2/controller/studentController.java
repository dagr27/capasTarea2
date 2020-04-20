package com.uca.capas.Tarea2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studentController {
	@RequestMapping("/Student")
	public @ResponseBody String getStudent(){
		return "Daniel Gomez - 00118717 - Ing En sistemas - 4o Año";
	}
}
