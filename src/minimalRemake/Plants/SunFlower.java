package minimalRemake.Plants;

import java.awt.Image;
import java.awt.Rectangle;
import minimalRemake.Base.Commons;
import minimalRemake.Base.GameEntities;

public class SunFlower extends GameEntities {

  @Override
  public void actions() {

  }

  @Override
  public Rectangle getBounds() {
    return new Rectangle(position.x, position.y, getImage().getWidth(null), getImage().getHeight(null));
  }

  @Override
  public Image getImage() {
    return Commons.SunFlower;
  }


}