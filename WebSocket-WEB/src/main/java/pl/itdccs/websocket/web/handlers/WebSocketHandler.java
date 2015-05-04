package pl.itdccs.websocket.web.handlers;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

/**
 * Created by mc109881 on 2015-04-29.
 */
public class WebSocketHandler extends BinaryWebSocketHandler {

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) {
		super.handleTextMessage(session, message);
	}
}
