package pl.itdccs.websocket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mc109881 on 2015-05-05.
 */
@Controller
public class LoginController {
	@RequestMapping(value="/login")
	public String showLogin(){
		return "login";
	}
}

