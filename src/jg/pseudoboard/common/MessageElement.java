package jg.pseudoboard.common;

public class MessageElement implements BoardElement {
	
	private static final long serialVersionUID = 6810016108706383314L;
	
	private Object data;
	private int id;
	
	public MessageElement(String message, MessageTypeConverter.MessageType t) {
		this.data = message;
		id = MessageTypeConverter.getInt(t);
	}
	
	@Override
	public ElementType getType() {
		return ElementType.MESSAGE_TO_SERVER;
	}

	@Override
	public int getID() {
		return id;
	}

	@Override
	public Object getData() {
		return data;
	}

	@Override
	public void setData(Object data) {
		this.data = data;
	}
	

}
