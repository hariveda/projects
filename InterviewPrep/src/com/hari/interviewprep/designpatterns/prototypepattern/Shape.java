/**
 * 
 */
package com.hari.interviewprep.designpatterns.prototypepattern;

/**
 * @author hariharan
 * 
 */
public abstract class Shape implements Cloneable {

	private int shapeId;
	private String shapeType;

	public abstract void drawShape();

	public Object clone() {
		Object obj = null;
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	/**
	 * @return the shapeId
	 */
	public int getShapeId() {
		return shapeId;
	}

	/**
	 * @param shapeId
	 *            the shapeId to set
	 */
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}

	/**
	 * @return the shapeType
	 */
	public String getShapeType() {
		return shapeType;
	}

	/**
	 * @param shapeType
	 *            the shapeType to set
	 */
	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
}
