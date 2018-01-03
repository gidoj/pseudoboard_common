package jg.pseudoboard.common;

public class MessageTypeConverter {
	
	public enum MessageType {
		DISCONNECT, LOGIN_EXISTING_USER, LOGIN_NEW_USER,
		NEW_CANVAS, OPEN_CANVAS, CANVAS_LIST, USER_LIST,
		LOGIN_SUCCESS, LOGIN_FAIL, NEW_CANVAS_FAIL, SAVE_CANVAS,
		NONE;
	}
	
	public static MessageType getMessageType(int i) {
		switch (i) {
		case -1:
			return MessageType.NONE;
		case 0:
			return MessageType.DISCONNECT;
		case 1:
			return MessageType.LOGIN_EXISTING_USER;
		case 2:
			return MessageType.LOGIN_NEW_USER;
		case 3:
			return MessageType.NEW_CANVAS;
		case 4:
			return MessageType.OPEN_CANVAS;
		case 5:
			return MessageType.CANVAS_LIST;
		case 6:
			return MessageType.USER_LIST;
		case 7:
			return MessageType.LOGIN_SUCCESS;
		case 8:
			return MessageType.LOGIN_FAIL;
		case 9:
			return MessageType.NEW_CANVAS_FAIL;
		case 10:
			return MessageType.SAVE_CANVAS;
		default:
			break;
		}
		return MessageType.NONE;
	}
	
	public static int getInt(MessageType t) {
		switch (t) {
		case DISCONNECT:
			return 0;
		case LOGIN_EXISTING_USER:
			return 1;
		case LOGIN_NEW_USER:
			return 2;
		case NEW_CANVAS:
			return 3;
		case OPEN_CANVAS:
			return 4;
		case CANVAS_LIST:
			return 5;
		case USER_LIST:
			return 6;
		case LOGIN_SUCCESS:
			return 7;
		case LOGIN_FAIL:
			return 8;
		case NEW_CANVAS_FAIL:
			return 9;
		case SAVE_CANVAS:
			return 10;
		case NONE:
			return -1;
		default:
			break;
		}
		return -1;
	}

}
