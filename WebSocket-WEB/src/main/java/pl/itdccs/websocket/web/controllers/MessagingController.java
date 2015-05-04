package pl.itdccs.websocket.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.itdccs.websocket.web.entities.WebSocketMessage;

/**
 * Created by mc109881 on 2015-04-29.
 */

@Controller
public class MessagingController {
	Logger logger = Logger.getLogger(this.getClass());

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public
	@ResponseBody
	WebSocketMessage messageHandle(@RequestBody WebSocketMessage msg) {
		logger.info("Recieved some msg");
		logger.info("GotMsg   " + msg);
		return new WebSocketMessage("Got message:   " + msg.getContent());
	}


}
