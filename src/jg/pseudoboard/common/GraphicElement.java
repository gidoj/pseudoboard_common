package jg.pseudoboard.common;

public class GraphicElement implements BoardElement {

	private static final long serialVersionUID = -384507767901738607L;
	
	private int[] graphic;
	
	public GraphicElement(int x0, int y0, int xf, int yf, int[] pixels) {
		int size = pixels.length + 4;
		graphic = new int[size];
		graphic[0] = x0;
		graphic[1] = y0;
		graphic[2] = xf;
		graphic[3] = yf;
		for (int i = 4; i < size; i++) graphic[i] = pixels[i-4];	
	}
	
	@Override
	public ElementType getType() {
		return ElementType.GRAPHIC;
	}

	@Override
	public int getID() {
		return -1;
	}

	@Override
	public Object getData() {
		return graphic;
	}

	@Override
	public void setData(Object data) {
		graphic = (int[]) data;
	}

}
