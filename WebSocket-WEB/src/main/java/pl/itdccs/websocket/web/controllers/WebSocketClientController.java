package pl.itdccs.websocket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mc109881 on 2015-05-04.
 */
@Controller
public class WebSocketClientController {

	@RequestMapping("/client")
	public String client(){
		return "client";
	}
}
