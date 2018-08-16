package com.lok.timesheet.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lok.timesheet.spring.form.SignInForm;

@Controller
public class TimesheetEntryController {

	@GetMapping(value ="/enter-timesheet")
	public String enterTimesheet() {
		System.out.println("go to sign in");
		return "timesheet/timesheet-entry.html";
	}
	@RequestMapping("/start-shift")
	public String startYourShift(@ModelAttribute("midProfileForm") SignInForm signInForm)
	 {
		System.out.println("start your shift");
		return "timesheet/timesheet-success.html";
	}
}
