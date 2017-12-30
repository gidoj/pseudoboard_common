package jg.pseudoboard.common;

import java.io.Serializable;

public interface BoardElement extends Serializable {
	
	public ElementType getType();
	public int getID();
	public Object getData();
	public void setData(Object data);
	
}
