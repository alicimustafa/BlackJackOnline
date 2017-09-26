package com.mustafa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mustafa.data.GameDAO;

@Controller
public class GameController {
	
	@Autowired
	GameDAO dao;
}
