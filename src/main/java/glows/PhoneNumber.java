package glows;

public class PhoneNumber implements java.io.Serializable {
  private String number_format;
  private String phone_type;
  private String number;
  private String extension;

  public PhoneNumber() {
    this.number_format = "";
    this.phone_type = "";
    this.number = "";
    this.extension = "";
  }

  public PhoneNumber(
      String number_format, String phone_type, String number,
      String extension) {
    this.number_format = number_format;
    this.phone_type = phone_type;
    this.number = number;
    this.extension = extension;
  }
  
  public String getNumber_format() {
    return number_format;
  }

  public String getPhone_type() {
    return phone_type;
  }
  
  public String getNumber() {
    return number;
  }
  
  public String getExtension() {
    return extension;
  }
}
