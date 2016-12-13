package glows;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicationData {
  @Id
  private Long id;
  private String last_name;
  private String suffix;
  private String first_name;
  private String middle_name;
  
  private String date_of_birth;
  private String city_of_birth;
  private String country_of_birth;
  private String state_province_of_birth;
  private String email_address;
  private String gender;
  private String eye_color;
  private String unit_type;
  private int height_ft;
  private int height_in;
  private int height_cm;
  private String notification_language;
  private String used_other_names;
  
  private PhoneNumber[] phone_numbers;

  public ApplicationData() {
    this.id = new Long(1);
    this.last_name = "Bob";
    this.suffix = "";
    this.first_name = "Jim";
    this.middle_name = "";
    this.date_of_birth = "";
    this.city_of_birth = "";
    this.country_of_birth = "";
    this.state_province_of_birth = "";
    this.email_address = "";
    this.gender = "";
    this.eye_color = "";
    this.unit_type = "";
    this.height_ft = 0;
    this.height_in = 0;
    this.height_cm = 0;
    this.notification_language = "";
    this.used_other_names = "";
    this.phone_numbers = new PhoneNumber[]{new PhoneNumber("", "", "", "")};
  }

  public ApplicationData(
      Long id, String last_name, String suffix, String first_name,
      String middle_name, String date_of_birth, String city_of_birth,
      String country_of_birth, String state_province_of_birth,
      String email_address, String gender, String eye_color, String unit_type,
      int height_ft, int height_in, int height_cm, String notification_language,
      String used_other_names, PhoneNumber[] phone_numbers) {
    this.id = id;
    this.last_name = last_name;
    this.suffix = suffix;
    this.first_name = first_name;
    this.middle_name = middle_name;
    this.date_of_birth = date_of_birth;
    this.city_of_birth = city_of_birth;
    this.country_of_birth = country_of_birth;
    this.state_province_of_birth = state_province_of_birth;
    this.email_address = email_address;
    this.gender = gender;
    this.eye_color = eye_color;
    this.unit_type = unit_type;
    this.height_ft = height_ft;
    this.height_in = height_in;
    this.height_cm = height_cm;
    this.notification_language = notification_language;
    this.used_other_names = used_other_names;
    this.phone_numbers = phone_numbers;
  }
  
  @Override
  public String toString() {
    return String.format(
      "Application for %s %s at %s and is %s",
      first_name, last_name, email_address, gender);
  }
  
  // Getters
  
  public Long getId() {
    return id;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getSuffix() {
    return suffix;
  }
  
  public String getFirst_name() {
    return first_name;
  }
  
  public String getMiddle_name() {
    return middle_name;
  }
  
  public String getDate_of_birth() {
    return date_of_birth;
  }
  
  public String getCity_of_birth() {
    return city_of_birth;
  }
  
  public String getCountry_of_birth() {
    return country_of_birth;
  }
  
  public String getState_province_of_birth() {
    return state_province_of_birth;
  }
  
  public String getEmail_address() {
    return email_address;
  }
  
  public String getGender() {
    return gender;
  }
  
  public String getEye_color() {
    return eye_color;
  }
  
  public String getUnit_type() {
    return unit_type;
  }
  
  public int getHeight_ft() {
    return height_ft;
  }
  
  public int getHeight_in() {
    return height_in;
  }
  
  public int getHeight_cm() {
    return height_cm;
  }
  
  public String getNotification_language() {
    return notification_language;
  }
  
  public String getUsed_other_names() {
    return used_other_names;
  }
  
  public PhoneNumber[] getPhone_numbers() {
    return phone_numbers;
  }
  
  // Setters
  
  public void setId(Long id) {
    this.id = id;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }
  
  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }
  
  public void setMiddle_name(String middle_name) {
    this.middle_name = middle_name;
  }
  
  public void setDate_of_birth(String date_of_birth) {
    this.date_of_birth = date_of_birth;
  }
  
  public void setCity_of_birth(String city_of_birth) {
    this.city_of_birth = city_of_birth;
  }
  
  public void setCountry_of_birth(String country_of_birth) {
    this.country_of_birth = country_of_birth;
  }
  
  public void setState_province_of_birth(String state_province_of_birth) {
    this.state_province_of_birth = state_province_of_birth;
  }
  
  public void setEmail_address(String email_address) {
    this.email_address = email_address;
  }
}
