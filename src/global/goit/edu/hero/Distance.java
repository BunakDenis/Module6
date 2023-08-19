package global.goit.edu.hero;

public class Distance {

    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        return (int) Math.sqrt((endY - startY) * (endY - startY) + (endX - startX) * (endX - startX));
    }
}