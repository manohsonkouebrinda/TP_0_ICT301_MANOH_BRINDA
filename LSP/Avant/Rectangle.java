package LSP.Avant;

public class Rectangle {
    protected int w;
    protected int h;

    public void setWidth(int w) {
        this.w = w;
    }

    public void setHeight(int h) {
        this.h = h;
    }

    public void setAspectRatio(Rectangle r, float ratio) {
        // Méthode du diagramme utilisant r et ratio
    }

    public int getArea() {
        return this.w * this.h;
    }
}

