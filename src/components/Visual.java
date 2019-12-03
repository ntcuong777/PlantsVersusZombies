package components;

import components.Base.Component;
import helper.Dir;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Visual extends Component {
  Image visual;
  public Visual(String relativeLink) {
    this.visual = new ImageIcon(Dir.project + relativeLink).getImage();
  }

  public Image getVisual() {
    return visual;
  }

  public void setVisual(Image visual) {
    this.visual = visual;
  }
}