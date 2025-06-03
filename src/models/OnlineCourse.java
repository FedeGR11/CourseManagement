package models;


public class OnlineCourse extends Course {
    private String plataform;

  public OnlineCourse(String title, int duration, String professor, String plataform){
    super(title, duration, professor);
    this.plataform = plataform;
  }
  public void setPlataform(String plataform) {
    this.plataform = plataform;
  }
  public String getPlataform() {
    return plataform;
  }

  @Override
  public String showInformation() {
    return ("[Online] " + super.showInformation() + " - Plataform: " + plataform);
  
  } 
}
