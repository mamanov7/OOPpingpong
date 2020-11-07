package grarak.pong;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Point extends DrawObject {

    private final Main.PLAYER player;
    protected int point = 0;

    public Point(GraphicsContext graphicsContext, Main.PLAYER player) {
        super(graphicsContext);
        this.player = player;
    }

    @Override
    public void draw(double width, double height) {
        double w = 0;
        switch (player) {
            case ONE:
                w = width / 4;
                break;
            case TWO:
                w = width - width / 4;
                break;
        }
        getGraphicsContext().setFill(Color.WHITE);
        getGraphicsContext().fillText(String.valueOf(point), w, 40);
    }

}
