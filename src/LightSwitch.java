import java.rmi.server.UID;

public class LightSwitch {
  public String id;
  public boolean isOn;

  public LightSwitch(String id, boolean isOn) {
    this.id = id;
    this.isOn = setOn(isOn);
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public boolean isOn() {
    return isOn;
  }

  public boolean setOn(boolean isOn) {
   if(isOn == true) {
      return false;
    } else {
      return true;
    }

  }
}

