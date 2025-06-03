package models;

public class Course {
    private String title;
    private int duration;
    private String professor;
    

  public Course(String title, int duration, String professor){
    this.title = title;
    this.duration = duration;
    this.professor = professor.isEmpty() ? "Unnasigned" : professor;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getTitle() {
    return title;
  }
  public void setDuration(int duration) {
    this.duration = duration;
  }
  public int getDuration() {
    return duration;
  }
  public void setProfessor(String professor) {
    this.professor = professor;
  }
  public String getProfessor() {
    return professor; 
  }
  public String showInformation() {
    return (title + " (" + duration + "hs) - " + "Professor: " + professor);
  }


}