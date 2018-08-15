package com.lok.timesheet.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimesheetEntryController {

	@GetMapping(value ="/enter-timesheet")
	public String enterTimesheet() {
		return "/timesheet/timesheet-entry.html";
	}
}
