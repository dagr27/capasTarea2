package com.uca.capas.Tarea2.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class dateController {
	@RequestMapping("/date")
	public @ResponseBody String date(HttpServletRequest request) throws ParseException {
		/*Dia mes año*/
		Integer day = Integer.parseInt(request.getParameter("dia"));
		String month = request.getParameter("month").toString();
		Integer year = Integer.parseInt(request.getParameter("Year"));
		
		String fecha = String.format("%s/%s/%s", day, month, year);
        Date date;
        date = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    String dayText = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
	    
	    return dayText;
		
        /*URL a Probar
         *http://localhost:8080/date?dia=19&month=4&Year=2020*/
	}
	
}
