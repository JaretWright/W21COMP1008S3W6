public class Rectangle implements GeometricShapes {
    private int length, width;

    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    /**
     * returns true if the length and the width are the same
     * @return
     */
    public boolean isSquare()
    {
        return length == width;
    }

    public double getArea()
    {
        return length*width;
    }

    public String toString()
    {
        return String.format("%d x %d rectangle%s", length, width, isSquare()?", is a square":"");
    }

    public int getPerimeter()
    {
        return 2*length+2*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length>0)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be greater than 0");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");
    }
}
