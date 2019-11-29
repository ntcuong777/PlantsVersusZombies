package entity;

import component.Move;
import component.Position;

public class Sun extends RootEntity implements Move {

  public Sun(int x, int y) {
    this.addComponent(new Position(x, y));
  }

  public void move() {
    //assume that the sun has speed of 1
    Position pos = getSingleComponent(Position.class);
    pos.setX(pos.getY() - 1);
  }
}