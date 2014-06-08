package gov.ornl.eden;

import java.awt.Rectangle;

public class PCAxis {
	public Column column;
	public int dataModelIndex;
	public Column xColumn;

	public int xPosition = 0;
	public int topPosition = 0;
	public int bottomPosition = 0;
	public int axisHeight = 0;
	public int axisWidth = 0;
	public int leftPosition = 0;
	public int rightPosition = 0;
	public int yPosition = 0;

	public Rectangle rectangle;
	public Rectangle labelRectangle;

	public Rectangle axisBarRectangle;
	public Rectangle IQRBoxRectangle;
	public Rectangle IQRWhiskerRectangle;
	public Rectangle QueryIQRBoxRectangle;
	public Rectangle QueryIQRWhiskerRectangle;

	public int medianPosition;
	public int queryMedianPosition;

	public int meanPosition;
	public int queryMeanPosition;

	public Rectangle standardDeviationRangeRectangle;
	public Rectangle queryStandardDeviationRangeRectangle;

	public Rectangle frequencyDisplayRectangle;

	public int maxPosition, minPosition;
	public int queryMaxPosition, queryMinPosition;

	public int scatterplot_x0;
	public int scatterplot_y0;

	public PCAxis(Column column) {
		this.column = column;
	}

	public PCAxis(Column column, int dataModelIndex) {
		this.column = column;
		this.dataModelIndex = dataModelIndex;
	}
}