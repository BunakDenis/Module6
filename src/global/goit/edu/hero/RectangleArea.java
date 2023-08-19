package global.goit.edu.hero;

public class RectangleArea {

    private int[] coords = new int[4];
    public RectangleArea(int[] coords) {
        this.coords = coords;
    }
    public int getArea() {
        int firstLine = Math.abs(coords[3] - coords[1]);
        int secondLine = Math.abs(coords[2] - coords[0]);
        return firstLine * secondLine;
    }
}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
