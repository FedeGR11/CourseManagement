package models;

public class OnSiteCourse extends Course {
    private int room;
    private int maxQuota;

  public OnSiteCourse(String title, int duration, String professor, int room, int maxQuota){
    super(title, duration, professor);
    this.room = room;
    this.maxQuota = maxQuota;
  }
  public void setRoom(int room) { 
    this.room = room;
  }
  public int getRoom() { 
    return room;
  }
  public void setMaxQuota(int maxQuota) {
    this.maxQuota = maxQuota;
  }
  public int getMaxQuota() {
    return maxQuota;
  }

  @Override
  public String showInformation() {
  return ("[On Site] " + super.showInformation() + " - Room: " + room + ", Quota: " + maxQuota);
  }
}
