package jg.pseudoboard.common;

public class CanvasElement implements BoardElement {
	
	private static final long serialVersionUID = -7225535327211306090L;
	
	private int[] canvas;
	
	public CanvasElement(int[] canvas) {
		this.canvas = canvas;
	}

	@Override
	public ElementType getType() {
		return ElementType.CANVAS;
	}

	@Override
	public int getID() {
		return -1;
	}

	@Override
	public Object getData() {
		return canvas;
	}

	@Override
	public void setData(Object data) {
		this.canvas = (int[]) data;
	}

}
