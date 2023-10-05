import java.util.*;

public class Vector2 extends MathObject {
    private int x;
    private int y;

    public Vector2(int x, int y) {
        super(); 
        this.x = x;
        this.y = y;
    }

    public Vector2(int x, int y, String description) {
        super(description); 
        this.x = x;
        this.y = y;
    }

    public int magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public boolean isEqual(Vector2 other) {
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return "Vector2(" + this.x + ", " + this.y + ")";
    }

    @Override
    public int getDimension() {
        return 2; 
    }

    
}

