package pl.itdccs.websocket.web.entities;

import java.io.Serializable;

/**
 * Created by mc109881 on 2015-05-04.
 */
public class WebSocketMessage implements Serializable {

	private static final long serialVersionUID = 7466722871033882677L;
	private String content;

	WebSocketMessage(){}

	public WebSocketMessage(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "WebSocketMessage{" +
				"content='" + content + '\'' +
				'}';
	}
}
