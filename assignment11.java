// interface 1
interface Drawable {
    void draw();   // abstract by default, no body
}

// interface 2
interface Resizable {
    void resize(int percent);   // abstract by default, no body
}

// a single class implementing MULTIPLE interfaces - multiple inheritance of type
class Box implements Drawable, Resizable {
    int size;

    Box(int size) {
        this.size = size;
    }

    // must implement all methods from Drawable
    public void draw() {
        System.out.println("Drawing a box of size: " + size);
    }

    // must implement all methods from Resizable
    public void resize(int percent) {
        size = size + (size * percent / 100);
        System.out.println("Box resized to: " + size);
    }
}

public class assignment11 {
    public static void main(String[] args) {

        Box box = new Box(50);
        box.draw();
        box.resize(20);
        box.draw();
        System.out.println();

        // interface reference can point to the implementing class's object - abstraction in action
        Drawable d = box;
        d.draw();

        Resizable r = box;
        r.resize(10);
    }
}
