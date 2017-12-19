package jg.pseudoboard.common;

import java.io.Serializable;

public interface BoardElement extends Serializable {
	
	public ElementType getType();
	public Object getData();
	
}
